package de.mrvnndr.skadi.synthesis.generator;

import de.mrvnndr.skadi.analysis.EmbedTarget;
import de.mrvnndr.skadi.synthesis.*;

import java.util.ArrayList;

public class JavaGenerator extends CodeGenerator {

    public JavaGenerator(SynthesisResult synthesisResult) {
        super(synthesisResult);
    }

    public String generate() {
        var sb = new StringBuilder();
        for (var emb : synthesisResult.embedTargets()) {
            sb.append(generateEmbed(emb));
            sb.append("\n\n");
        }
        return sb.toString();
    }

    private String generateEmbed(EmbedTarget embedTarget) {
        var code = CodeUtil.normalizeIndent(embedTarget.embeddableCode());

        for (var embeddingID : embedTarget.embeddingIDs()) {
            var automatonID = this.getOptionValue(embeddingID, "regex");
            var defToken = this.getOptionValue(embeddingID, "definitions");
            var transitionToken = this.getOptionValue(embeddingID, "transitions");

            code = replaceToken(code, defToken, generateDefinitions(automatonID));

            var automaton = synthesisResult.automatons().get(automatonID);
            var initializationCode = generateVarInitialization(automatonID) + "\n";
            var automatonCode = generateAutomatonCode(automaton) + "\n";
            var stateSwapCode = generateStateSwap() + "\n";
            var actionsCode = generateActionsCode(automatonID);
            code = replaceToken(code, transitionToken,
                    initializationCode + automatonCode + stateSwapCode + actionsCode);
        }

        return code;
    }

    private String generateDefinitions(String automatonID) {
        var sb = new StringBuilder();
        sb.append("var currentStates = new HashSet<>(Set.of(1));\n");
        sb.append("var nextStates = new HashSet<Integer>();\n");

        var actions = getAllActions(automatonID);
        for (var action : actions) {
            sb.append("var ");
            sb.append(getActionVarName(action)).append(" = false;\n");
        }
        return sb.toString();
    }

    private String generateStateSwap() {
        var sb = new StringBuilder();
        sb.append("var tempState = currentStates;\n");
        sb.append("currentStates = nextStates;\n");
        sb.append("nextStates = tempState;\n");
        return sb.toString();
    }

    private String generateActionsCode(String automatonID) {
        var actions = getAllActions(automatonID);
        var sb = new StringBuilder();

        for (var action : actions) {
            var varName = getActionVarName(action);
            sb.append("if (").append(varName).append(") {\n");

            var actionCode = CodeUtil.normalizeIndent(action.getCode());
            sb.append(actionCode.indent(4));

            sb.append("}\n");
        }

        return sb.toString();
    }

    private String generateVarInitialization(String automatonID) {
        var sb = new StringBuilder();
        var actions = getAllActions(automatonID);

        sb.append("nextStates.clear();\n");
        for (var action : actions) {
            sb.append(getActionVarName(action)).append(" = false;\n");
        }
        return sb.toString();
    }

    private String generateAutomatonCode(EpsilonFreeNFA nfa) {
        var sb = new StringBuilder();
        sb.append("""
                for (int state : currentStates) {
                    switch(state) {
                """);

        for (var state : nfa.getNFA().vertexSet()) {
            sb.append(("case " + state.getId() + ":\n").indent(4));

            for (var edge : nfa.getNFA().outgoingEdgesOf(state)) {
                var ifStart = "if(" + generateTransitionCondition(edge) + ") {\n";
                var addEdge = "nextStates.add(" + nfa.getNFA().getEdgeTarget(edge).getId() + ");\n";

                sb.append(ifStart.indent(8));
                sb.append(addEdge.indent(12));

                for (var action : edge.getActions()) {
                    var actionEnable = getActionVarName(action) + " = true;\n";
                    sb.append(actionEnable.indent(12));
                }

                sb.append("}\n".indent(8));
            }

            sb.append("break;\n".indent(8));
        }

        sb.append("}".indent(4));
        sb.append("}");

        return sb.toString();
    }

    private static String generateTransitionCondition(NFAEdge edge) {
        var iter = CharRange.iterator(edge.getChars());
        var condList = new ArrayList<String>();

        while (iter.hasNext()) {
            var charRange = iter.next();
            if (charRange.low() == charRange.high()) {
                condList.add("ascii == %s".formatted(escapeChar(charRange.low())));
            } else {
                var lowCheck = "ascii >= %s".formatted(escapeChar(charRange.low()));
                var highCheck = "ascii <= %s".formatted(escapeChar(charRange.high()));
                condList.add("(%s && %s)".formatted(lowCheck, highCheck));
            }
        }
        return String.join(" || ", condList);
    }

    private static String escapeChar(char c) {
        if (Character.isISOControl(c)) {
            return Integer.toString(c);
        }
        if (c == '\'') {
            return """
                    '\\''""";
        }
        if (c == '\\') {
            return """
                    '\\'""";
        }
        return "'" + c + "'";
    }
}
