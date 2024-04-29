package de.mrvnndr.skadi.analysis;

import java.util.Set;

public record EmbedTarget(String embeddableCode, Set<String> embeddingIDs) {

    public EmbedTarget(String embeddableCode, Set<String> embeddingIDs) {
        this.embeddableCode = embeddableCode;
        this.embeddingIDs = Set.copyOf(embeddingIDs);
    }
}
