package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.Action;
import de.mrvnndr.skadi.analysis.FragmentDependencyParser;
import de.mrvnndr.skadi.analysis.InputFile;
import de.mrvnndr.skadi.analysis.ParsedRegex;

import java.util.HashMap;
import java.util.Set;

public class LocatorsCheck implements SemanticCheck {

    @Override
    public boolean performCheck(InputFile inputFile) {
        return checkFragmentsExist(inputFile) &&
                checkLocatorsFQ(inputFile) &&
                checkDependenciesValid(inputFile);
    }

    private boolean checkFragmentsExist(InputFile inputFile) {
        var locators = inputFile.actions().stream().map(Action::getLocator).toList();
        var result = true;

        for (var locator : locators) {
            for (var regexID : locator.getPath()) {
                if (!inputFile.automatonMap().containsKey(regexID) && !inputFile.fragmentMap().containsKey(regexID)) {
                    var msg = "Action locator '%s' contains reference to unknown fragment '%s'!"
                            .formatted(locator.toString(), regexID);
                    ConsoleUtil.error(msg);
                    result = false;
                }
            }
        }

        return result;
    }

    private boolean checkLocatorsFQ(InputFile inputFile) {
        var locators = inputFile.actions().stream().map(Action::getLocator).toList();
        var result = true;

        for (var locator : locators) {
            if (!inputFile.automatonMap().containsKey(locator.automatonName())) {
                var msg = "Action locator '%s' is not fully qualified. A locator has to start with a valid automaton name!"
                        .formatted(locator.toString());
                ConsoleUtil.error(msg);
                result = false;
            }
        }

        return result;
    }

    private boolean checkDependenciesValid(InputFile inputFile) {
        var locators = inputFile.actions().stream().map(Action::getLocator).toList();
        var result = true;
        var unifiedMap = new HashMap<String, ParsedRegex>();

        unifiedMap.putAll(inputFile.automatonMap());
        unifiedMap.putAll(inputFile.fragmentMap());

        nextLocator:
        for (var locator : locators) {
            var path = locator.getPath();
            for (var i = 0; i < path.size() - 1; i++) {
                var deps = getDependenciesOfRegex(unifiedMap.get(path.get(i)));
                if (!deps.contains(path.get(i + 1))) {
                    var msg = "In locator '%s': '%s' does not use fragment '%s'!"
                            .formatted(locator.toString(), path.get(i), path.get(i + 1));
                    ConsoleUtil.error(msg);
                    result = false;
                    continue nextLocator;
                }
            }
        }
        return result;
    }

    private static Set<String> getDependenciesOfRegex(ParsedRegex regex) {
        var depParser = new FragmentDependencyParser();
        regex.walkTree(depParser);
        return depParser.getDependencies();
    }
}
