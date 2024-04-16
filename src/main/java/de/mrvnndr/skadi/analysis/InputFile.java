package de.mrvnndr.skadi.analysis;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class InputFile {
    private final Map<String, ParsedRegex> fragmentMap;
    private final Map<String, ParsedRegex> automatonMap;
    private final List<String> copySequences;
    private final List<Action> actions;

    public InputFile(Map<String, ParsedRegex> fragmentMap, Map<String, ParsedRegex> automatonMap,
                     List<String> copySequences, List<Action> actions) {
        this.fragmentMap = fragmentMap;
        this.automatonMap = automatonMap;
        this.copySequences = List.copyOf(copySequences);
        this.actions = List.copyOf(actions);
    }

    public Map<String, ParsedRegex> getFragmentMap() {
        return Collections.unmodifiableMap(fragmentMap);
    }

    public Map<String, ParsedRegex> getAutomatonMap() {
        return Collections.unmodifiableMap(automatonMap);
    }

    public List<String> getCopySequences() {
        return copySequences;
    }

    public List<Action> getActions() {
        return actions;
    }

    public List<Action> getMatchingActions(ActionLocator locator) {
        return actions.stream().filter(a -> a.locator.equals(locator)).toList();
    }
}
