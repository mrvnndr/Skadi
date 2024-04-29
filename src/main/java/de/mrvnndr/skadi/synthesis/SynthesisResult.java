package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.EmbedTarget;
import de.mrvnndr.skadi.analysis.Embedding;

import java.util.List;
import java.util.Map;

public record SynthesisResult(List<EmbedTarget> embedTargets,
                              Map<String, Embedding> embeddings,
                              Map<String, EpsilonFreeNFA> automatons) {

    public SynthesisResult(List<EmbedTarget> embedTargets,
                           Map<String, Embedding> embeddings,
                           Map<String, EpsilonFreeNFA> automatons) {
        this.embedTargets = List.copyOf(embedTargets);
        this.embeddings = Map.copyOf(embeddings);
        this.automatons = Map.copyOf(automatons);
    }
}
