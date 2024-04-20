package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.synthesis.EpsilonFreeNFA;

public class EnterAction extends Action {

    EnterAction(String code, ActionLocator locator, int id) {
        super(code, locator, id);
    }

    @Override
    public void apply(EpsilonFreeNFA nfa) {
        var graph = nfa.getNFA();
        for (var e : graph.edgeSet()) {
            var startNode = graph.getEdgeSource(e);
            if (!startNode.isStart()) {
                continue;
            }
            e.addAction(this);
        }
    }
}
