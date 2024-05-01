package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.InputFile;

public class RegexNameUniqueCheck implements SemanticCheck {

    @Override
    public boolean performCheck(InputFile inputFile) {
        var automatons = inputFile.automatonMap();
        var fragments = inputFile.fragmentMap();
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
