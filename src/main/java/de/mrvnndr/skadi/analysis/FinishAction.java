package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.synthesis.EpsilonFreeNFA;

public class FinishAction extends Action {

    FinishAction(String code, ActionLocator locator, int id) {
        super(code, locator, id);
    }

    @Override
    public void apply(EpsilonFreeNFA nfa) {
        var graph = nfa.getNFA();
        for (var e : graph.edgeSet()) {
            var targetNode = graph.getEdgeTarget(e);
            if (!targetNode.isAccepting()) {
                continue;
            }
            e.addAction(this);
        }
    }
}
