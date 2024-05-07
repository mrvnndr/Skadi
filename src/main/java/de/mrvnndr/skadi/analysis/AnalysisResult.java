package de.mrvnndr.skadi.analysis;

import java.util.List;
import java.util.Map;

public record AnalysisResult(Map<String, ParsedRegex> fragmentMap, Map<String, ParsedRegex> automatonMap,
                             List<Action> actions, List<EmbedTarget> embedTargets, Map<String, Embedding> embeddings) {

    public AnalysisResult(Map<String, ParsedRegex> fragmentMap, Map<String, ParsedRegex> automatonMap,
                          List<Action> actions, List<EmbedTarget> embedTargets, Map<String, Embedding> embeddings) {
        this.fragmentMap = Map.copyOf(fragmentMap);
        this.automatonMap = Map.copyOf(automatonMap);
        this.actions = List.copyOf(actions);
        this.embedTargets = List.copyOf(embedTargets);
        this.embeddings = Map.copyOf(embeddings);
    }

    public List<Action> getMatchingActions(ActionLocator locator) {
        return actions.stream().filter(a -> a.locator.equals(locator)).toList();
    }
}
