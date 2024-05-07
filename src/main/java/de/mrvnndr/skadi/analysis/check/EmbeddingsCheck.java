package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.AnalysisResult;

import java.util.HashSet;

public class EmbeddingsCheck implements SemanticCheck {

    @Override
    public boolean performCheck(AnalysisResult analysisResult) {
        var result = true;
        var allEmbeddingsUsed = new HashSet<String>();

        if (analysisResult.embedTargets().isEmpty()) {
            var msg = "The input does not define any output!";
            ConsoleUtil.warn(msg);
        }

        for (var embedTarget : analysisResult.embedTargets()) {
            for (var embedID : embedTarget.embeddingIDs()) {
                allEmbeddingsUsed.add(embedID);
                if (!analysisResult.embeddings().containsKey(embedID)) {
                    var msg = "Unknown embedding '%s' used in embed target!".formatted(embedID);
                    ConsoleUtil.error(msg);
                    result = false;
                }
            }
        }

        for (var embedID : analysisResult.embeddings().keySet()) {
            if (!allEmbeddingsUsed.contains(embedID)) {
                var msg = "Embedding '%s' is unused!".formatted(embedID);
                ConsoleUtil.warn(msg);
            }
        }

        return result;
    }
}
