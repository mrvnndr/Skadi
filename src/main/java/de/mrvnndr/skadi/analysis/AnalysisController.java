package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.ConsoleUtil;
import de.mrvnndr.skadi.analysis.antlr.SkadiFileLexer;
import de.mrvnndr.skadi.analysis.antlr.SkadiFileParser;
import de.mrvnndr.skadi.analysis.check.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Path;

public class AnalysisController {

    public static InputFile analyseFile(Path path) throws IOException {
        var parseTree = buildParseTree(path);

        var walker = new ParseTreeWalker();
        var parser = new FileParser();
        walker.walk(parser, parseTree);
        var inputFile = parser.getResult();

        if (!performSemanticChecks(inputFile)) {
            throw new SemanticAnalysisException("");
        }

        return inputFile;
    }

    private static SkadiFileParser.FileContext buildParseTree(Path path) throws IOException {
        var charStream = CharStreams.fromPath(path);

        var lexer = new SkadiFileLexer(charStream);
        var tokenStream = new CommonTokenStream(lexer);
        var parser = new SkadiFileParser(tokenStream);

        var errorListener = new ParseErrorListener();
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        var parseTree = parser.file();
        if (errorListener.error) {
            throw new IllegalArgumentException();
        }
        return parseTree;
    }

    private static boolean performSemanticChecks(InputFile inputFile) {
        return new LocatorsCheck().performCheck(inputFile) &&
                new RegexNameUniqueCheck().performCheck(inputFile) &&
                new CyclicDependencyCheck().performCheck(inputFile) &&
                new EmbeddingsCheck().performCheck(inputFile) &&
                new FragmentsUsedCheck().performCheck(inputFile);
    }

    private static class ParseErrorListener extends BaseErrorListener {
        private boolean error = false;

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                                String msg, RecognitionException e) {
            String sourceName = recognizer.getInputStream().getSourceName();
            if (!sourceName.isEmpty()) {
                sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
            }

            error = true;
            ConsoleUtil.error(sourceName + msg);
        }
    }
}
