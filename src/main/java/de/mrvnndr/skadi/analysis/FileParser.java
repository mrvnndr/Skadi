package de.mrvnndr.skadi.analysis;

import de.mrvnndr.skadi.analysis.antlr.SkadiFileParser;
import de.mrvnndr.skadi.analysis.antlr.SkadiFileParserBaseListener;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexLexer;
import de.mrvnndr.skadi.analysis.antlr.SkadiRegexParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.*;
import java.util.stream.Collectors;

public class FileParser extends SkadiFileParserBaseListener {
    private final Map<String, ParsedRegex> fragmentIdRegexMap = new HashMap<>();
    private final Map<String, ParsedRegex> automatonIdRegexMap = new HashMap<>();
    private final ParseTreeProperty<ActionLocator> locators = new ParseTreeProperty<>();
    private final List<String> copySequences = new ArrayList<>();
    private final List<Action> actions = new ArrayList<>();

    private int actionIndex = 1;

    public InputFile getResult() {
        return new InputFile(fragmentIdRegexMap, automatonIdRegexMap, copySequences, actions);
    }

    @Override
    public void exitCopy_definition(SkadiFileParser.Copy_definitionContext ctx) {
        ctx.HOST_CODE().forEach(h -> copySequences.add(h.getText()));
    }

    @Override
    public void exitFragment_definition(SkadiFileParser.Fragment_definitionContext ctx) {
        var id = ctx.ID().getText();

        if (fragmentIdRegexMap.containsKey(id)) {
            throw new SemanticAnalysisException("Multiple definitions of fragment " + id + "!");
        }

        var regex = ctx.REGEX().getText().trim();
        var regexCleaned = regex.substring(1, regex.length() - 1);
        var parseTree = parseRegex(regexCleaned);
        fragmentIdRegexMap.put(id, new ParsedRegex(id, parseTree));
    }

    @Override
    public void exitAutomaton_definition(SkadiFileParser.Automaton_definitionContext ctx) {
        var id = ctx.ID().getText();

        if (automatonIdRegexMap.containsKey(id)) {
            throw new SemanticAnalysisException("Multiple definitions of automaton " + id + "!");
        }

        var regex = ctx.REGEX().getText().trim();
        var regexCleaned = regex.substring(1, regex.length() - 1);
        var parseTree = parseRegex(regexCleaned);
        automatonIdRegexMap.put(id, new ParsedRegex(id, parseTree));
    }

    private static SkadiRegexParser.RegexContext parseRegex(String regex) {
        var is = CharStreams.fromString(regex);
        var lexer = new SkadiRegexLexer(is);
        var tokenStream = new CommonTokenStream(lexer);
        var parser = new SkadiRegexParser(tokenStream);

        return parser.regex();
    }

    @Override
    public void exitEnter_action(SkadiFileParser.Enter_actionContext ctx) {
        var code = ctx.HOST_CODE().stream().map(ParseTree::getText).collect(Collectors.joining());
        actions.add(new EnterAction(code.trim(), locators.get(ctx.locator()), actionIndex++));
    }

    @Override
    public void exitProgress_action(SkadiFileParser.Progress_actionContext ctx) {
        var code = ctx.HOST_CODE().stream().map(ParseTree::getText).collect(Collectors.joining());
        actions.add(new ProgressAction(code.trim(), locators.get(ctx.locator()), actionIndex++));
    }

    @Override
    public void exitFinish_action(SkadiFileParser.Finish_actionContext ctx) {
        var code = ctx.HOST_CODE().stream().map(ParseTree::getText).collect(Collectors.joining());
        actions.add(new FinishAction(code.trim(), locators.get(ctx.locator()), actionIndex++));
    }

    @Override
    public void exitLocator(SkadiFileParser.LocatorContext ctx) {
        var path = ctx.ID().stream().map(ParseTree::getText).toList();
        locators.put(ctx, new ActionLocator(path));
    }
}
