package de.mrvnndr.skadi.synthesis;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.traverse.BreadthFirstIterator;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EpsilonFreeNFA {

    private final Graph<NFANode, NFAEdge> nfa;
    private final NFANode startState;
    private final Set<NFANode> acceptStates;

    private EpsilonFreeNFA(Graph<NFANode, NFAEdge> nfa, NFANode startState, Set<NFANode> acceptStates) {
        this.nfa = nfa;
        this.startState = startState;
        this.acceptStates = acceptStates;
    }

    public static EpsilonFreeNFA fromThompsonNFA(ThompsonNFA thompsonNFA) {
        var currentGraph = GraphUtil.copyAndReindex(thompsonNFA.nfa(), thompsonNFA.startNode(), 1);
        boolean addedEpsilonEdge;
        NFANode startState;
        do {
            var newNFA = new DefaultDirectedGraph<NFANode, NFAEdge>(NFAEdge.class);
            currentGraph.vertexSet().forEach(newNFA::addVertex);

            addedEpsilonEdge = removeEpsilonIteration(currentGraph, newNFA);

            cleanUnreachableStates(newNFA);

            startState = newNFA.vertexSet().stream().filter(NFANode::isStart).findAny().orElseThrow();
            currentGraph = GraphUtil.copyAndReindex(newNFA, startState, 1);
        } while (addedEpsilonEdge);

        var acceptingStates = currentGraph.vertexSet().stream().filter(NFANode::isAccepting).collect(Collectors.toSet());
        return new EpsilonFreeNFA(currentGraph, startState, acceptingStates);
    }

    private static boolean removeEpsilonIteration(Graph<NFANode, NFAEdge> input, Graph<NFANode, NFAEdge> output) {
        boolean addedEpsilonEdge = false;
        for (var e : input.edgeSet()) {
            var source = input.getEdgeSource(e);
            var target = input.getEdgeTarget(e);

            if (!e.isEpsilon()) {
                output.addEdge(source, target, e);
                continue;
            }

            var targetOutgoingEdges = input.outgoingEdgesOf(target);

            for (var outgoingEdge : targetOutgoingEdges) {
                var isEpsilon = outgoingEdge.isEpsilon();

                if (isEpsilon && input.getEdgeTarget(outgoingEdge) == source) {
                    continue;
                }

                addedEpsilonEdge = isEpsilon || addedEpsilonEdge;
                var newEdge = new NFAEdge(isEpsilon);
                newEdge.insertAll(outgoingEdge.getChars());
                outgoingEdge.getActions().forEach(newEdge::addAction);
                output.addEdge(source, input.getEdgeTarget(outgoingEdge), newEdge);
            }

            if (target.isAccepting()) {
                source.setAccepting(true);
            }
        }
        return addedEpsilonEdge;
    }

    private static void cleanUnreachableStates(Graph<NFANode, NFAEdge> g) {
        var reachableStates = new HashSet<NFANode>();
        var statesToDelete = new HashSet<NFANode>();
        var startState = g.vertexSet().stream().filter(NFANode::isStart).findAny().orElseThrow();

        var iter = new BreadthFirstIterator<>(g, startState);
        iter.forEachRemaining(reachableStates::add);

        g.vertexSet().stream().filter(n -> !reachableStates.contains(n)).forEach(statesToDelete::add);
        g.removeAllVertices(statesToDelete);
    }

    public Graph<NFANode, NFAEdge> getNFA() {
        return nfa;
    }

    public NFANode getStartState() {
        return startState;
    }

    public Set<NFANode> getAcceptStates() {
        return acceptStates;
    }
}
