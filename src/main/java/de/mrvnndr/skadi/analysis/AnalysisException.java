package de.mrvnndr.skadi.analysis;

import org.antlr.v4.runtime.Token;

public class AnalysisException extends RuntimeException {
    public AnalysisException(String message) {
        super(message);
    }

    public AnalysisException(String message, Token token) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
