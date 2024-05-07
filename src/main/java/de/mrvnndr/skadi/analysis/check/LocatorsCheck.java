package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.Action;
import de.mrvnndr.skadi.analysis.AnalysisResult;
import de.mrvnndr.skadi.analysis.ParsedRegex;

import java.util.HashMap;

public class LocatorsCheck implements SemanticCheck {

    @Override
    public boolean performCheck(AnalysisResult analysisResult) {
        return checkFragmentsExist(analysisResult) &&
                checkLocatorsFQ(analysisResult) &&
                checkDependenciesValid(analysisResult);
    }

    private boolean checkFragmentsExist(AnalysisResult analysisResult) {
        var locators = analysisResult.actions().stream().map(Action::getLocator).toList();
        var result = true;

        for (var locator : locators) {
            for (var regexID : locator.getPath()) {
                if (!analysisResult.automatonMap().containsKey(regexID) && !analysisResult.fragmentMap().containsKey(regexID)) {
                    var msg = "Action locator '%s' contains reference to unknown fragment '%s'!"
                            .formatted(locator.toString(), regexID);
                    ConsoleUtil.error(msg);
                    result = false;
                }
            }
        }

        return result;
    }

    private boolean checkLocatorsFQ(AnalysisResult analysisResult) {
        var locators = analysisResult.actions().stream().map(Action::getLocator).toList();
        var result = true;

        for (var locator : locators) {
            if (!analysisResult.automatonMap().containsKey(locator.automatonName())) {
                var msg = "Action locator '%s' is not fully qualified. A locator has to start with a valid automaton name!"
                        .formatted(locator.toString());
                ConsoleUtil.error(msg);
                result = false;
            }
        }

        return result;
    }

    private boolean checkDependenciesValid(AnalysisResult analysisResult) {
        var locators = analysisResult.actions().stream().map(Action::getLocator).toList();
        var result = true;
        var unifiedMap = new HashMap<String, ParsedRegex>();

        unifiedMap.putAll(analysisResult.automatonMap());
        unifiedMap.putAll(analysisResult.fragmentMap());

        nextLocator:
        for (var locator : locators) {
            var path = locator.getPath();
            for (var i = 0; i < path.size() - 1; i++) {
                var deps = unifiedMap.get(path.get(i)).getDependencies();
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
}
