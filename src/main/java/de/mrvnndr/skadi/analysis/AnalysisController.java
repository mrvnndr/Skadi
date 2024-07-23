package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.analysis.antlr.SkadiFileLexer;
import de.mrvnndr.skadi.analysis.antlr.SkadiFileParser;
import de.mrvnndr.skadi.analysis.check.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Path;

public class AnalysisController {

    public static AnalysisResult analyseFile(Path path) throws IOException {
        var parseTree = buildParseTree(path);

        var walker = new ParseTreeWalker();
        var parser = new FileParser();
        walker.walk(parser, parseTree);
        var inputFile = parser.getResult();

        if (!performSemanticChecks(inputFile)) {
            throw new AnalysisException("");
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

        return parser.file();
    }

    private static boolean performSemanticChecks(AnalysisResult analysisResult) {
        return new LocatorsCheck().performCheck(analysisResult) &&
                new RegexNameUniqueCheck().performCheck(analysisResult) &&
                new CyclicDependencyCheck().performCheck(analysisResult) &&
                new EmbeddingsCheck().performCheck(analysisResult) &&
                new FragmentsUsedCheck().performCheck(analysisResult);
    }

}
