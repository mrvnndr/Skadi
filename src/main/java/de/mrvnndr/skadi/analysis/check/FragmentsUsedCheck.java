package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.InputFile;

import java.util.HashSet;

public class FragmentsUsedCheck implements SemanticCheck {

    @Override
    public boolean performCheck(InputFile inputFile) {
        var fragmentsInUse = new HashSet<String>();

        inputFile.fragmentMap().values().forEach(fragment -> {
            fragmentsInUse.addAll(fragment.getDependencies());
        });
        inputFile.automatonMap().values().forEach(automaton -> {
            fragmentsInUse.addAll(automaton.getDependencies());
        });

        for (var fragment : inputFile.fragmentMap().keySet()) {
            if (!fragmentsInUse.contains(fragment)) {
                var msg = "Fragment '%s' is unused!".formatted(fragment);
                ConsoleUtil.warn(msg);
            }
        }

        return true;
    }
}
