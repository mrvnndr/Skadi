package de.mrvnndr.skadi;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.SimpleDirectedGraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public record ThompsonNFA(Graph<NFANode, NFAEdge> nfa, NFANode startNode, NFANode acceptNode) {

    public static ThompsonNFA characterTransition(Collection<Character> chars) {
        return simpleTransition(chars, false);
    }

    public static ThompsonNFA empty() {
        return simpleTransition(Set.of(), true);
    }

    public static ThompsonNFA alternation(ThompsonNFA nfa1, ThompsonNFA nfa2, ThompsonNFA... nfas) {
        var nfaList = new ArrayList<>(List.of(nfas));
        nfaList.add(nfa1);
        nfaList.add(nfa2);

        Graph<NFANode, NFAEdge> nfa = new SimpleDirectedGraph<>(NFAEdge.class);
        var nfaCopies = new ArrayList<ThompsonNFA>();
        int index = 2;

        for (var oldNfa : nfaList) {
            var copy = copyAndReindex(oldNfa, index);
            nfaCopies.add(copy);
            Graphs.addGraph(nfa, copy.nfa());
            index += oldNfa.nfa().vertexSet().size();
        }

        var nodeStart = new NFANode(1).setStart(true);
        var nodeEnd = new NFANode(index).setAccepting(true);

        nfa.addVertex(nodeStart);
        nfa.addVertex(nodeEnd);

        for (var newNfa : nfaCopies) {
            newNfa.startNode.setStart(false);
            var epsEdge = new NFAEdge(true);
            nfa.addEdge(nodeStart, newNfa.startNode, epsEdge);

            newNfa.acceptNode.setAccepting(false);
            var epsEdge2 = new NFAEdge(true);
            nfa.addEdge(newNfa.acceptNode, nodeEnd, epsEdge2);
        }

        return new ThompsonNFA(nfa, nodeStart, nodeEnd);
    }

    public static ThompsonNFA concatenation(ThompsonNFA nfa1, ThompsonNFA nfa2) {
        var nfa1Copy = copyAndReindex(nfa1, 1);
        var nfa2Copy = copyAndReindex(nfa2, nfa1.nfa().vertexSet().size() + 1);

        Graph<NFANode, NFAEdge> nfa = new SimpleDirectedGraph<>(NFAEdge.class);
        Graphs.addGraph(nfa, nfa1Copy.nfa());
        Graphs.addGraph(nfa, nfa2Copy.nfa());

        var exitEdges = nfa.edgesOf(nfa1Copy.acceptNode());
        for (var e : exitEdges) {
            var source = nfa.getEdgeSource(e);
            nfa.removeEdge(e);
            nfa.addEdge(source, nfa2Copy.startNode(), e);
        }

        nfa.removeVertex(nfa1Copy.acceptNode());

        nfa2Copy.startNode.setStart(false);

        return copyAndReindex(new ThompsonNFA(nfa, nfa1Copy.startNode, nfa2Copy.acceptNode), 1);
    }

    public static ThompsonNFA repetition(ThompsonNFA insideNFA, boolean atLeastOnce) {
        return repeatOptional(insideNFA, !atLeastOnce, true);
    }

    public static ThompsonNFA maybe(ThompsonNFA insideNFA) {
        return repeatOptional(insideNFA, true, false);
    }

    public static ThompsonNFA copyAndReindex(ThompsonNFA nfa, int startIndex) {
        Graph<NFANode, NFAEdge> newNFA = GraphUtil.copyAndReindex(nfa.nfa, nfa.startNode, startIndex);
        var newStart = newNFA.vertexSet().stream().filter(NFANode::isStart).findAny();
        var newAccept = newNFA.vertexSet().stream().filter(NFANode::isAccepting).findAny();
        return new ThompsonNFA(newNFA, newStart.orElseThrow(), newAccept.orElseThrow());
    }

    private static ThompsonNFA simpleTransition(Collection<Character> chars, boolean epsilon) {
        Graph<NFANode, NFAEdge> nfa = new SimpleDirectedGraph<>(NFAEdge.class);
        var nodeStart = new NFANode(1).setStart(true);
        var nodeEnd = new NFANode(2).setAccepting(true);

        nfa.addVertex(nodeStart);
        nfa.addVertex(nodeEnd);

        var edge = new NFAEdge(epsilon);
        edge.insertAll(chars);

        nfa.addEdge(nodeStart, nodeEnd, edge);

        return new ThompsonNFA(nfa, nodeStart, nodeEnd);
    }

    private static ThompsonNFA repeatOptional(ThompsonNFA insideNFA, boolean forwardEdge, boolean backwardEdge) {
        var nfaCopy = copyAndReindex(insideNFA, 2);
        var nfaGraph = nfaCopy.nfa();

        var nodeStart = new NFANode(1).setStart(true);
        var nodeEnd = new NFANode(nfaGraph.vertexSet().size() + 2).setAccepting(true);
        nfaGraph.addVertex(nodeStart);
        nfaGraph.addVertex(nodeEnd);

        nfaGraph.addEdge(nodeStart, nfaCopy.startNode, new NFAEdge(true));
        nfaGraph.addEdge(nfaCopy.acceptNode, nodeEnd, new NFAEdge(true));

        if (forwardEdge) {
            nfaGraph.addEdge(nodeStart, nodeEnd, new NFAEdge(true));
        }

        if (backwardEdge) {
            nfaGraph.addEdge(nfaCopy.acceptNode, nfaCopy.startNode, new NFAEdge(true));
        }

        nfaCopy.startNode.setStart(false);
        nfaCopy.acceptNode.setAccepting(false);

        return new ThompsonNFA(nfaGraph, nodeStart, nodeEnd);
    }
}
