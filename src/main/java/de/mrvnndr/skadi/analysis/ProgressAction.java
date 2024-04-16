package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.synthesis.EpsilonFreeNFA;

public class ProgressAction extends Action {
    public ProgressAction(String code, ActionLocator locator, int id) {
        super(code, locator, id);
    }

    @Override
    public void apply(EpsilonFreeNFA nfa) {
        var graph = nfa.getNFA();
        for (var e : graph.edgeSet()) {
            e.addAction(this);
        }
    }
}
