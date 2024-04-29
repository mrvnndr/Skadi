package de.mrvnndr.skadi.analysis;

import java.util.Collections;
import java.util.Map;

public record Embedding(String embeddingID, Map<String, String> optionMap) {

    public Embedding(String embeddingID, Map<String, String> optionMap) {
        this.embeddingID = embeddingID;
        this.optionMap = Collections.unmodifiableMap(optionMap);
    }
}
