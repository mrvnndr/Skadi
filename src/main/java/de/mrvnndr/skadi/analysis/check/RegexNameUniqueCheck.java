package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.AnalysisResult;

public class RegexNameUniqueCheck implements SemanticCheck {

    @Override
    public boolean performCheck(AnalysisResult analysisResult) {
        var automatons = analysisResult.automatonMap();
        var fragments = analysisResult.fragmentMap();
        var result = true;

        for (var automatonID : automatons.keySet()) {
            if (fragments.containsKey(automatonID)) {
                var msg = "Identifier '%s' is used both for an automaton and a fragment!".formatted(automatonID);
                ConsoleUtil.error(msg);
                result = false;
            }
        }

        return result;
    }
}
