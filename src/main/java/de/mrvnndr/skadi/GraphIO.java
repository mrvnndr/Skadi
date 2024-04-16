package de.mrvnndr.skadi;

import de.mrvnndr.skadi.synthesis.NFAEdge;
import de.mrvnndr.skadi.synthesis.NFANode;
import org.jgrapht.Graph;
import org.jgrapht.nio.Attribute;
import org.jgrapht.nio.DefaultAttribute;
import org.jgrapht.nio.dot.DOTExporter;

import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collectors;

public class GraphIO {
    public static void exportNFAToDOT(FileWriter writer, Graph<NFANode, NFAEdge> graph) {
        DOTExporter<NFANode, NFAEdge> exporter = new DOTExporter<>(v -> String.valueOf(v.getId()));
        exporter.setVertexAttributeProvider((v) -> getVertexAttributes(v, graph));
        exporter.setGraphAttributeProvider(() -> getGraphAttributes(graph));
        exporter.setEdgeAttributeProvider((e) -> getEdgeAttributes(e, graph));
        exporter.exportGraph(graph, writer);
    }

    private static Map<String, Attribute> getGraphAttributes(Graph<NFANode, NFAEdge> graph) {
        Map<String, Attribute> map = new HashMap<>();
        map.put("rankdir", DefaultAttribute.createAttribute("LR"));
        return map;
    }

    private static Map<String, Attribute> getVertexAttributes(NFANode vertex, Graph<NFANode, NFAEdge> graph) {
        Map<String, Attribute> map = new HashMap<>();
        if (vertex.isAccepting()) {
            map.put("shape", DefaultAttribute.createAttribute("doublecircle"));
        }

        if (vertex.isStart()) {
            map.put("shape", DefaultAttribute.createAttribute("diamond"));
        }

        return map;
    }

    private static Map<String, Attribute> getEdgeAttributes(NFAEdge edge, Graph<NFANode, NFAEdge> graph) {
        Map<String, Attribute> map = new HashMap<>();
        if (graph.getEdgeSource(edge).getId() > graph.getEdgeTarget(edge).getId()) {
            map.put("constraint", DefaultAttribute.createAttribute("false"));
        }
        if (edge.isEpsilon()) {
            map.put("style", DefaultAttribute.createAttribute("dashed"));
            map.put("label", DefaultAttribute.createAttribute("ε"));
        } else {
            map.put("label", DefaultAttribute.createAttribute(generateEdgeLabel(edge.getChars())));
        }
        return map;
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
        if (chars.isEmpty()) {
            return "";
        }

        var result = new StringBuilder();

        char start = chars.removeFirst();
        char lastSeen = start;
        boolean dirty = true;
        for (var c : chars) {
            dirty = true;
            if (c - lastSeen > 1) {
                result.append(start);
                if (lastSeen != start) {
                    result.append("-").append(lastSeen);
                }
                start = c;
                dirty = false;
            }
            lastSeen = c;
        }

        if (dirty) {
            result.append(start);
            if (lastSeen != start) {
                result.append("-").append(lastSeen);
            }
        }

        return result.toString();
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
