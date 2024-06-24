package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class VHDLGenerator {
    private final SynthesisResult synthesisResult;

    public VHDLGenerator(SynthesisResult synthesisResult) {
        this.synthesisResult = synthesisResult;
    }

    public String generate() {
        var sb = new StringBuilder();
        for (var emb : this.synthesisResult.embedTargets()) {
            sb.append(generateEmbed(emb, this.synthesisResult));
            sb.append("\n\n");
        }
        return sb.toString();
    }

    private String generateEmbed(EmbedTarget embedTarget, SynthesisResult synthesisResult) {
        var code = CodeUtil.normalizeIndent(embedTarget.embeddableCode());

        for (var embeddingID : embedTarget.embeddingIDs()) {
            var embedding = synthesisResult.embeddings().get(embeddingID);
            var automatonID = embedding.optionMap().get("regex");

            if (automatonID == null) {
                var msg = "Embedding %s does not define regular expression!".formatted(embeddingID);
                throw new GenerationException(msg);
            }

            var procVarToken = getOptionValue(embeddingID, "procVar");
            var resetToken = getOptionValue(embeddingID, "reset");
            var transitionToken = getOptionValue(embeddingID, "transitions");

            code = replaceToken(code, procVarToken, generateVarDeclaration(automatonID));
            code = replaceToken(code, resetToken, generateReset());

            var procCode = generateVarInitialization(automatonID) + "\n" +
                    generateStateLogic(automatonID) + "\n" +
                    generateSetNewState() + "\n" +
                    generateActionCode(getAllActions(automatonID));

            code = replaceToken(code, transitionToken, procCode);
        }

        return code;
    }

    private String replaceToken(String input, String token, String replacement) {
        var indentation = CodeUtil.getTokenIndentation(input, token);
        var indented = replacement.indent(indentation);
        return input.replaceAll("[ \\t]*" + token, Matcher.quoteReplacement(indented));
    }

    private String getOptionValue(String embeddingID, String optionName) {
        var embedding = synthesisResult.embeddings().get(embeddingID);
        var optionValue = embedding.optionMap().get(optionName);

        if (optionValue == null) {
            var msg = "Embedding %s does not define option %s!".formatted(embeddingID, optionName);
            throw new GenerationException(msg);
        }

        return optionValue;
    }

    private Collection<Action> getAllActions(String automatonID) {
        return synthesisResult.automatons().get(automatonID).getNFA().edgeSet()
                .stream()
                .map(NFAEdge::getActions)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    private String generateReset() {
        return "state_register := (1 => '1', others => '0');\n";
    }

    private String generateVarDeclaration(String automatonID) {
        var sb = new StringBuilder();
        var stateCount = synthesisResult.automatons().get(automatonID).getNFA().vertexSet().size();
        var actions = getAllActions(automatonID);

        sb.append("variable state_register : bit_vector(1 to %d);\n".formatted(stateCount));
        sb.append("variable new_state : bit_vector(1 to %d);\n".formatted(stateCount));

        for (var action : actions) {
            var varName = getActionVarName(action);
            sb.append("variable %s : boolean;\n".formatted(varName));
        }
        return sb.toString();
    }

    private String generateVarInitialization(String automatonID) {
        var sb = new StringBuilder();
        var actions = getAllActions(automatonID);

        sb.append("new_state := (others => '0');\n");
        for (var action : actions) {
            sb.append(getActionVarName(action)).append(" := false;\n");
        }
        return sb.toString();
    }

    private String generateStateLogic(String automatonID) {
        var sb = new StringBuilder();
        var automaton = synthesisResult.automatons().get(automatonID);
        var nfa = automaton.getNFA();

        for (var state : nfa.vertexSet()) {
            sb.append("if state_register(%d) then\n".formatted(state.getId()));
            for (var edge : nfa.outgoingEdgesOf(state)) {
                var condString = "if %s then\n".formatted(generateTransitionCondition(edge));
                sb.append(condString.indent(4));

                var transitionStr = generateTransition(edge, nfa.getEdgeTarget(edge).getId());
                sb.append(transitionStr.indent(8));

                sb.append("end if;\n".indent(4));
            }
            sb.append("end if;\n");
        }
        return sb.toString();
    }

    private String generateActionCode(Collection<Action> actions) {
        var sb = new StringBuilder();

        for (var action : actions) {
            var varName = getActionVarName(action);
            sb.append("if ").append(varName).append(" then\n");

            var actionCode = CodeUtil.normalizeIndent(action.getCode());
            sb.append(actionCode.indent(4));

            sb.append("end if;\n");
        }

        return sb.toString();
    }

    private String generateTransition(NFAEdge edge, int targetID) {
        var sb = new StringBuilder();
        for (var action : edge.getActions()) {
            sb.append(getActionVarName(action)).append(" := true;\n");
        }
        sb.append("new_state(%d) := '1';\n".formatted(targetID));
        return sb.toString();
    }

    private String getActionVarName(Action action) {
        var locString = action.getLocator().toString();
        var stateString = switch (action) {
            case EnterAction ignored -> "enter";
            case ProgressAction ignored -> "progress";
            case FinishAction ignored -> "finish";
            default -> throw new IllegalStateException("Unexpected value: " + action);
        };

        return "do_%s_%s_%d".formatted(stateString, locString.replace(".", "_"), action.getId());
    }

    private String generateTransitionCondition(NFAEdge edge) {
        var iter = CharRange.iterator(edge.getChars());
        var condList = new ArrayList<String>();

        while (iter.hasNext()) {
            var charRange = iter.next();
            if (charRange.low() == charRange.high()) {
                condList.add("ascii = character'pos(%s)".formatted(getCharacterEnumName(charRange.low())));
            } else {
                var lowCheck = "ascii >= character'pos(%s)".formatted(getCharacterEnumName(charRange.low()));
                var highCheck = "ascii <= character'pos(%s)".formatted(getCharacterEnumName(charRange.high()));
                condList.add("(%s and %s)".formatted(lowCheck, highCheck));
            }
        }
        return String.join(" or ", condList);
    }

    private String generateSetNewState() {
        return """
                for i in new_state'range loop
                    state_register(i) := new_state(i);
                end loop;
                """;
    }

    private String getCharacterEnumName(char character) {
        if (character >= ' ' && character <= '~') {
            return "'" + character + "'";
        }

        return switch (character) {
            case 0 -> "nul";
            case 1 -> "soh";
            case 2 -> "stx";
            case 3 -> "etx";
            case 4 -> "eot";
            case 5 -> "enq";
            case 6 -> "ack";
            case 7 -> "bel";
            case 8 -> "bs";
            case 9 -> "ht";
            case 10 -> "lf";
            case 11 -> "vt";
            case 12 -> "ff";
            case 13 -> "cr";
            case 14 -> "so";
            case 15 -> "si";
            case 16 -> "dle";
            case 17 -> "dc1";
            case 18 -> "dc2";
            case 19 -> "dc3";
            case 20 -> "dc4";
            case 21 -> "nak";
            case 22 -> "syn";
            case 23 -> "etb";
            case 24 -> "can";
            case 25 -> "em";
            case 26 -> "sub";
            case 27 -> "esc";
            case 28 -> "fsp";
            case 29 -> "gsp";
            case 30 -> "rsp";
            case 31 -> "usp";
            case 127 -> "del";
            default -> throw new IllegalStateException("Unexpected value: " + character);
        };
    }
}
