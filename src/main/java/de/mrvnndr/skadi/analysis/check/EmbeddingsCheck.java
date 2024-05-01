package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.InputFile;

import java.util.HashSet;

public class EmbeddingsCheck implements SemanticCheck {

    @Override
    public boolean performCheck(InputFile inputFile) {
        var result = true;
        var allEmbeddingsUsed = new HashSet<String>();

        if (inputFile.embedTargets().isEmpty()) {
            var msg = "The input does not define any output!";
            ConsoleUtil.warn(msg);
        }

        for (var embedTarget : inputFile.embedTargets()) {
            for (var embedID : embedTarget.embeddingIDs()) {
                allEmbeddingsUsed.add(embedID);
                if (!inputFile.embeddings().containsKey(embedID)) {
                    var msg = "Unknown embedding '%s' used in embed target!".formatted(embedID);
                    ConsoleUtil.error(msg);
                    result = false;
                }
            }
        }

        for (var embedID : inputFile.embeddings().keySet()) {
            if (!allEmbeddingsUsed.contains(embedID)) {
                var msg = "Embedding '%s' is unused!".formatted(embedID);
                ConsoleUtil.warn(msg);
            }
        }

        return result;
    }
}
