package de.mrvnndr.skadi.analysis;

import java.util.*;

public record InputFile(Map<String, ParsedRegex> fragmentMap, Map<String, ParsedRegex> automatonMap,
                        List<Action> actions, List<Embedding> embeddings) {

    public InputFile(Map<String, ParsedRegex> fragmentMap, Map<String, ParsedRegex> automatonMap,
                     List<Action> actions, List<Embedding> embeddings) {
        this.fragmentMap = fragmentMap;
        this.automatonMap = automatonMap;
        this.actions = List.copyOf(actions);
        this.embeddings = List.copyOf(embeddings);
    }

    @Override
    public Map<String, ParsedRegex> fragmentMap() {
        return Collections.unmodifiableMap(fragmentMap);
    }

    @Override
    public Map<String, ParsedRegex> automatonMap() {
        return Collections.unmodifiableMap(automatonMap);
    }

    public List<Action> getMatchingActions(ActionLocator locator) {
        return actions.stream().filter(a -> a.locator.equals(locator)).toList();
    }
}
