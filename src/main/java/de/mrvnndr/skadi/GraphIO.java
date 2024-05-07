package de.mrvnndr.skadi;

import de.mrvnndr.skadi.synthesis.CharRange;
import de.mrvnndr.skadi.synthesis.NFAEdge;
import de.mrvnndr.skadi.synthesis.NFANode;
import org.jgrapht.Graph;

import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class GraphIO {
    public static String exportNFAToDOT(Graph<NFANode, NFAEdge> graph) {
        var sb = new StringBuilder();

        sb.append("strict digraph G {\n");
        sb.append(getGraphAttributes(graph));

        for (var node : graph.vertexSet()) {
            sb.append("  ").append(node.getId()).append(" [ ");
            sb.append(getVertexAttributes(node, graph));
            sb.append(" ];\n");
        }

        for (var edge : graph.edgeSet()) {
            var sourceID = graph.getEdgeSource(edge).getId();
            var targetID = graph.getEdgeTarget(edge).getId();
            sb.append("  ").append(sourceID).append(" -> ").append(targetID).append(" [ ");
            sb.append(getEdgeAttributes(edge, graph));
            sb.append(" ];\n");
        }

        sb.append("}\n");

        return sb.toString();
    }


    private static String getGraphAttributes(Graph<NFANode, NFAEdge> graph) {
        return "rankdir=LR;\n";
    }

    private static String getVertexAttributes(NFANode vertex, Graph<NFANode, NFAEdge> graph) {
        var lst = new ArrayList<String>();

        if (vertex.isAccepting()) {
            lst.add(getAttributeString("shape", "doublecircle"));
        }

        if (vertex.isStart()) {
            lst.add(getAttributeString("shape", "diamond"));
        }

        return String.join(" ", lst);
    }

    private static String getEdgeAttributes(NFAEdge edge, Graph<NFANode, NFAEdge> graph) {
        var lst = new ArrayList<String>();

        if (graph.getEdgeSource(edge).getId() > graph.getEdgeTarget(edge).getId()) {
            lst.add(getAttributeString("constraint", "false"));
        }
        if (edge.isEpsilon()) {
            lst.add(getAttributeString("style", "dashed"));
            lst.add(getAttributeString("label", "ε"));
        } else {
            lst.add(getAttributeString("label", generateEdgeLabel(edge.getChars())));
        }

        return String.join(" ", lst);
    }

    private static String getAttributeString(String attrName, String value) {
        var escapedValue = value.replaceAll("\"", Matcher.quoteReplacement("\\\""));
        return "%s = \"%s\"".formatted(attrName, escapedValue);
    }

    private static String generateEdgeLabel(SortedSet<Character> chars) {
        chars = new TreeSet<>(chars);
        if (chars.isEmpty()) {
            return "[]";
        }

        var result = new StringBuilder("[");

        var specialChars = chars.stream()
                .filter(c -> !Character.isAlphabetic(c) && !Character.isDigit(c) && !Character.isISOControl(c))
                .collect(Collectors.toSet());
        specialChars.forEach(chars::remove);

        var controlCodes = chars.stream()
                .filter(Character::isISOControl)
                .collect(Collectors.toSet());
        controlCodes.forEach(chars::remove);

        result.append(alphanumericLabelString(chars));
        specialChars.forEach(result::append);
        result.append(controlCodeLabelString(controlCodes));

        result.append("]");
        return result.toString();
    }

    private static String alphanumericLabelString(SortedSet<Character> chars) {
        var sb = new StringBuilder();
        var iter = CharRange.iterator(chars);
        while (iter.hasNext()) {
            var range = iter.next();
            if (range.low() == range.high()) {
                sb.append(range.low());
            } else {
                sb.append(range.low()).append("-").append(range.high());
            }
        }
        return sb.toString();
    }

    private static String controlCodeLabelString(Set<Character> chars) {
        if (chars.isEmpty()) {
            return "";
        }

        var result = new StringBuilder();

        for (var c : chars) {
            var str = controlCodeString(c);
            result.append("<").append(str).append(">");
        }

        return result.toString();
    }

    private static String controlCodeString(char c) {
        return switch (c) {
            case 0 -> "NUL";
            case 1 -> "SOH";
            case 2 -> "STX";
            case 3 -> "ETX";
            case 4 -> "EOT";
            case 5 -> "ENQ";
            case 6 -> "ACK";
            case 7 -> "BEL";
            case 8 -> "BS";
            case 9 -> "HT";
            case 10 -> "LF";
            case 11 -> "VT";
            case 12 -> "FF";
            case 13 -> "CR";
            case 14 -> "SO";
            case 15 -> "SI";
            case 16 -> "DLE";
            case 17 -> "DC1";
            case 18 -> "DC2";
            case 19 -> "DC3";
            case 20 -> "DC4";
            case 21 -> "NAK";
            case 22 -> "SYN";
            case 23 -> "ETB";
            case 24 -> "CAN";
            case 25 -> "EM";
            case 26 -> "SUB";
            case 27 -> "ESC";
            case 28 -> "FS";
            case 29 -> "GS";
            case 30 -> "RS";
            case 31 -> "US";
            case 127 -> "DEL";
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }
}
