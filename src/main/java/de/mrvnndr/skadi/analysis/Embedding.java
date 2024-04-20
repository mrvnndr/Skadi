package de.mrvnndr.skadi.analysis;

import java.util.Collections;
import java.util.Set;

public record Embedding(String embeddableCode, Set<EmbedPair> embedPairs) {

    @Override
    public Set<EmbedPair> embedPairs() {
        return Collections.unmodifiableSet(embedPairs);
    }
}
