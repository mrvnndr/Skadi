package de.mrvnndr.skadi.analysis.check;

import de.mrvnndr.skadi.analysis.InputFile;

public interface SemanticCheck {
    boolean performCheck(InputFile inputFile);
}
