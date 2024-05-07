package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.analysis.AnalysisResult;

public interface SemanticCheck {
    boolean performCheck(AnalysisResult analysisResult);
}
