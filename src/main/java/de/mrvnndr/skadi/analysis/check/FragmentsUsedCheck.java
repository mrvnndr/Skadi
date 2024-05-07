package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.AnalysisResult;

import java.util.HashSet;

public class FragmentsUsedCheck implements SemanticCheck {

    @Override
    public boolean performCheck(AnalysisResult analysisResult) {
        var fragmentsInUse = new HashSet<String>();

        analysisResult.fragmentMap().values().forEach(fragment -> fragmentsInUse.addAll(fragment.getDependencies()));
        analysisResult.automatonMap().values().forEach(automaton -> fragmentsInUse.addAll(automaton.getDependencies()));

        for (var fragment : analysisResult.fragmentMap().keySet()) {
            if (!fragmentsInUse.contains(fragment)) {
                var msg = "Fragment '%s' is unused!".formatted(fragment);
                ConsoleUtil.warn(msg);
            }
        }

        return true;
    }
}
