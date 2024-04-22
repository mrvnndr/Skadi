package de.mrvnndr.skadi.synthesis;

import de.mrvnndr.skadi.analysis.Embedding;

import java.util.List;
import java.util.Map;

public record SynthesisResult(List<Embedding> embeddings, Map<String, EpsilonFreeNFA> automatons) {
    public SynthesisResult(List<Embedding> embeddings, Map<String, EpsilonFreeNFA> automatons) {
        this.embeddings = List.copyOf(embeddings);
        this.automatons = Map.copyOf(automatons);
    }
}
