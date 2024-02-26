package de.mrvnndr.skadi;

import org.jgrapht.Graph;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.traverse.BreadthFirstIterator;

import java.util.HashMap;
import java.util.Map;

public class GraphUtil {
    public static Graph<NFANode, NFAEdge> copyAndReindex(Graph<NFANode, NFAEdge> nfa,
                                                         NFANode startNode,
                                                         int startIndex) {

        Graph<NFANode, NFAEdge> newNFA = GraphTypeBuilder.forGraph(nfa).buildGraph();
        Map<Integer, NFANode> oldIdNewNodeMap = new HashMap<>();

        var iter = new BreadthFirstIterator<>(nfa, startNode);
        int index = startIndex;

        while (iter.hasNext()) {
            var node = iter.next();
            var newNode = new NFANode(index++);
            newNode.setStart(node.isStart()).setAccepting(node.isAccepting());
            oldIdNewNodeMap.put(node.getId(), newNode);
            newNFA.addVertex(newNode);
        }

        for (var oldEdge : nfa.edgeSet()) {
            var newEdge = new NFAEdge(oldEdge.isEpsilon());
            newEdge.insertAll(oldEdge.getChars());

            var oldSource = nfa.getEdgeSource(oldEdge);
            var oldTarget = nfa.getEdgeTarget(oldEdge);

            var newSource = oldIdNewNodeMap.get(oldSource.getId());
            var newTarget = oldIdNewNodeMap.get(oldTarget.getId());

            newNFA.addEdge(newSource, newTarget, newEdge);
        }

        return newNFA;
    }
}
