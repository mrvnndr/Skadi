package de.mrvnndr.skadi;

import de.mrvnndr.skadi.analysis.antlr.SkadiRegexLexer;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexParser;
import org.antlr.v4.runtime.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RegexParseTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "(a|b)*a",
            "test",
            //E-Mail address:
            "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])",
            "[^\\x00-\\x7F]+\\ *(?:[^\\x00-\\x7F]| )*",
            "abc{otherRule_32}def",
            "a{2,6}b{2,}"

    })
    void validRegexShouldParse(String input) {
        assertDoesNotThrow(() -> tryParse(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "(a|b*a",
            "[abc",
            "[a\\]",
            "a{,5}"
    })
    void invalidRegexShouldThrow(String input) {
        assertThrows(RuntimeException.class, () -> tryParse(input));
    }

    private static void tryParse(String input) {
        var is = CharStreams.fromString(input);
        var lexer = new BailSkadiLexer(is);
        var tokenStream = new CommonTokenStream(lexer);
        var parser = new SkadiRegexParser(tokenStream);
        parser.setErrorHandler(new BailErrorStrategy());

        parser.regex();
    }

    private static class BailErrorStrategy extends DefaultErrorStrategy {
        @Override
        public void recover(Parser recognizer, RecognitionException e) {
            throw new RuntimeException(e);
        }

        @Override
        public Token recoverInline(Parser recognizer) throws RecognitionException {
            throw new RuntimeException(new InputMismatchException(recognizer));
        }

        @Override
        public void sync(Parser recognizer) {
        }
    }


    private static class BailSkadiLexer extends SkadiRegexLexer {
        public BailSkadiLexer(CharStream input) {
            super(input);
        }

        public void recover(LexerNoViableAltException e) {
            throw new RuntimeException(e);
        }
    }

}
