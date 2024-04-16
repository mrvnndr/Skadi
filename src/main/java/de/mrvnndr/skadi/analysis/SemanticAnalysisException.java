package de.mrvnndr.skadi.analysis;

import org.antlr.v4.runtime.Token;

public class SemanticAnalysisException extends RuntimeException {
    public SemanticAnalysisException(String message) {
        super(message);
    }

    public SemanticAnalysisException(String message, Token token) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
