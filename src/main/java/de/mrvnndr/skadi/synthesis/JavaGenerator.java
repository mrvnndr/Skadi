package de.mrvnndr.skadi.synthesis;

import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class JavaGenerator {

    public static String generate(SynthesisResult synthesisResult) {
        var sb = new StringBuilder();
        for (var emb : synthesisResult.embeddings()) {
            var currentCode = normalizeIndent(emb.embeddableCode());
            for (var replacement : emb.embedPairs()) {
                var indentation = getTokenIndentation(emb.embeddableCode(), replacement.embedToken());
                var automaton = synthesisResult.automatons().get(replacement.automatonID());
                var automatonCode = generateAutomatonCode(automaton).indent(indentation);
                currentCode = currentCode.replaceFirst("[ \\t]*" + replacement.embedToken(),
                        Matcher.quoteReplacement(automatonCode));
            }
            sb.append(currentCode).append(System.lineSeparator()).append(System.lineSeparator());
        }
        return sb.toString();
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
                    var actionCode = normalizeIndent(action.getCode());
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

    private static String normalizeIndent(String text) {
        text = text.stripTrailing();
        text = text.lines()
                .dropWhile(String::isBlank)
                .collect(Collectors.joining(System.lineSeparator()));
        return text.stripIndent();
    }

    private static int getTokenIndentation(String text, String token) {
        var index = text.indexOf(token);
        int wscount = 0;
        for (int i = index - 1; i >= 0; i--) {
            var c = text.charAt(i);
            if (c != ' ' && c != '\t') {
                break;
            }
            wscount++;
        }
        return wscount;
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
