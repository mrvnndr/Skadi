package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.EmbedTarget;

import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class JavaGenerator {

    public static String generate(SynthesisResult synthesisResult) {
        var sb = new StringBuilder();
        for (var emb : synthesisResult.embedTargets()) {
            sb.append(generateEmbed(emb, synthesisResult));
            sb.append("\n\n");
        }
        return sb.toString();
    }

    private static String generateEmbed(EmbedTarget embedTarget, SynthesisResult synthesisResult) {
        var code = CodeUtil.normalizeIndent(embedTarget.embeddableCode());

        for (var embeddingID : embedTarget.embeddingIDs()) {
            var embedding = synthesisResult.embeddings().get(embeddingID);
            var replacement = embedding.optionMap().get("token");

            if (replacement == null) {
                var msg = "Embedding %s does not define replacement token!".formatted(embeddingID);
                throw new GenerationException(msg);
            }

            var automatonID = embedding.optionMap().get("regex");

            if (automatonID == null) {
                var msg = "Embedding %s does not define regular expression!".formatted(embeddingID);
                throw new GenerationException(msg);
            }

            var indentation = CodeUtil.getTokenIndentation(embedTarget.embeddableCode(), replacement);
            var automaton = synthesisResult.automatons().get(automatonID);
            var automatonCode = generateAutomatonCode(automaton).indent(indentation);

            code = code.replaceFirst("[ \\t]*" + replacement, Matcher.quoteReplacement(automatonCode));
        }

        return code;
    }

    private static String generateAutomatonCode(EpsilonFreeNFA nfa) {
        var sb = new StringBuilder();
        sb.append("""
                var nextStates = new HashSet<Integer>();
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
                    var actionCode = CodeUtil.normalizeIndent(action.getCode());
                    sb.append(actionCode.indent(12));
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
        return edge.getChars().stream().map(c -> "c == " + escapeChar(c)).collect(Collectors.joining(" || "));
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
