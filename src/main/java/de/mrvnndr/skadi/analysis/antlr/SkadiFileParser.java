package de.mrvnndr.skadi.analysis.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SkadiFileParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            HOST_CODE = 1, CURLY_CLOSED = 2, REGEX = 3, COPY = 4, FRAGMENT = 5, AUTOMATON = 6,
            ENTER = 7, PROGRESS = 8, FINISH = 9, EMBED = 10, AT = 11, IN = 12, CURLY_OPEN = 13,
            EQUAL = 14, PERIOD = 15, COMMA = 16, ID = 17, WS = 18, CODE_END = 19;
    public static final int
            RULE_file = 0, RULE_definition = 1, RULE_copy_definition = 2, RULE_fragment_definition = 3,
            RULE_automaton_definition = 4, RULE_embed_definition = 5, RULE_embed_pair = 6,
            RULE_action_definition = 7, RULE_enter_action = 8, RULE_progress_action = 9,
            RULE_finish_action = 10, RULE_locator = 11;

    private static String[] makeRuleNames() {
        return new String[]{
                "file", "definition", "copy_definition", "fragment_definition", "automaton_definition",
                "embed_definition", "embed_pair", "action_definition", "enter_action",
                "progress_action", "finish_action", "locator"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, "'copy'", "'fragment'", "'automaton'", "'enter'",
                "'progress'", "'finish'", "'embed'", "'at'", "'in'", "'{'", "'='", "'.'",
                "','"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "HOST_CODE", "CURLY_CLOSED", "REGEX", "COPY", "FRAGMENT", "AUTOMATON",
                "ENTER", "PROGRESS", "FINISH", "EMBED", "AT", "IN", "CURLY_OPEN", "EQUAL",
                "PERIOD", "COMMA", "ID", "WS", "CODE_END"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "SkadiFileParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public SkadiFileParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FileContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(SkadiFileParser.EOF, 0);
        }

        public List<DefinitionContext> definition() {
            return getRuleContexts(DefinitionContext.class);
        }

        public DefinitionContext definition(int i) {
            return getRuleContext(DefinitionContext.class, i);
        }

        public FileContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_file;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener) ((SkadiFileParserListener) listener).enterFile(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener) ((SkadiFileParserListener) listener).exitFile(this);
        }
    }

    public final FileContext file() throws RecognitionException {
        FileContext _localctx = new FileContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_file);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(27);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2032L) != 0)) {
                    {
                        {
                            setState(24);
                            definition();
                        }
                    }
                    setState(29);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(30);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefinitionContext extends ParserRuleContext {
        public Copy_definitionContext copy_definition() {
            return getRuleContext(Copy_definitionContext.class, 0);
        }

        public Fragment_definitionContext fragment_definition() {
            return getRuleContext(Fragment_definitionContext.class, 0);
        }

        public Automaton_definitionContext automaton_definition() {
            return getRuleContext(Automaton_definitionContext.class, 0);
        }

        public Embed_definitionContext embed_definition() {
            return getRuleContext(Embed_definitionContext.class, 0);
        }

        public Action_definitionContext action_definition() {
            return getRuleContext(Action_definitionContext.class, 0);
        }

        public DefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener) ((SkadiFileParserListener) listener).enterDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener) ((SkadiFileParserListener) listener).exitDefinition(this);
        }
    }

    public final DefinitionContext definition() throws RecognitionException {
        DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_definition);
        try {
            setState(37);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case COPY:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(32);
                    copy_definition();
                }
                break;
                case FRAGMENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(33);
                    fragment_definition();
                }
                break;
                case AUTOMATON:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(34);
                    automaton_definition();
                }
                break;
                case EMBED:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(35);
                    embed_definition();
                }
                break;
                case ENTER:
                case PROGRESS:
                case FINISH:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(36);
                    action_definition();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Copy_definitionContext extends ParserRuleContext {
        public TerminalNode COPY() {
            return getToken(SkadiFileParser.COPY, 0);
        }

        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiFileParser.CURLY_OPEN, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiFileParser.CURLY_CLOSED, 0);
        }

        public List<TerminalNode> HOST_CODE() {
            return getTokens(SkadiFileParser.HOST_CODE);
        }

        public TerminalNode HOST_CODE(int i) {
            return getToken(SkadiFileParser.HOST_CODE, i);
        }

        public Copy_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_copy_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterCopy_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitCopy_definition(this);
        }
    }

    public final Copy_definitionContext copy_definition() throws RecognitionException {
        Copy_definitionContext _localctx = new Copy_definitionContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_copy_definition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(39);
                match(COPY);
                setState(40);
                match(CURLY_OPEN);
                setState(44);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(41);
                            match(HOST_CODE);
                        }
                    }
                    setState(46);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(47);
                match(CURLY_CLOSED);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Fragment_definitionContext extends ParserRuleContext {
        public TerminalNode FRAGMENT() {
            return getToken(SkadiFileParser.FRAGMENT, 0);
        }

        public TerminalNode ID() {
            return getToken(SkadiFileParser.ID, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(SkadiFileParser.EQUAL, 0);
        }

        public TerminalNode REGEX() {
            return getToken(SkadiFileParser.REGEX, 0);
        }

        public Fragment_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fragment_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterFragment_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitFragment_definition(this);
        }
    }

    public final Fragment_definitionContext fragment_definition() throws RecognitionException {
        Fragment_definitionContext _localctx = new Fragment_definitionContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_fragment_definition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(49);
                match(FRAGMENT);
                setState(50);
                match(ID);
                setState(51);
                match(EQUAL);
                setState(52);
                match(REGEX);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Automaton_definitionContext extends ParserRuleContext {
        public TerminalNode AUTOMATON() {
            return getToken(SkadiFileParser.AUTOMATON, 0);
        }

        public TerminalNode ID() {
            return getToken(SkadiFileParser.ID, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(SkadiFileParser.EQUAL, 0);
        }

        public TerminalNode REGEX() {
            return getToken(SkadiFileParser.REGEX, 0);
        }

        public Automaton_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_automaton_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterAutomaton_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitAutomaton_definition(this);
        }
    }

    public final Automaton_definitionContext automaton_definition() throws RecognitionException {
        Automaton_definitionContext _localctx = new Automaton_definitionContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_automaton_definition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(54);
                match(AUTOMATON);
                setState(55);
                match(ID);
                setState(56);
                match(EQUAL);
                setState(57);
                match(REGEX);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Embed_definitionContext extends ParserRuleContext {
        public TerminalNode EMBED() {
            return getToken(SkadiFileParser.EMBED, 0);
        }

        public List<Embed_pairContext> embed_pair() {
            return getRuleContexts(Embed_pairContext.class);
        }

        public Embed_pairContext embed_pair(int i) {
            return getRuleContext(Embed_pairContext.class, i);
        }

        public TerminalNode IN() {
            return getToken(SkadiFileParser.IN, 0);
        }

        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiFileParser.CURLY_OPEN, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiFileParser.CURLY_CLOSED, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SkadiFileParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SkadiFileParser.COMMA, i);
        }

        public List<TerminalNode> HOST_CODE() {
            return getTokens(SkadiFileParser.HOST_CODE);
        }

        public TerminalNode HOST_CODE(int i) {
            return getToken(SkadiFileParser.HOST_CODE, i);
        }

        public Embed_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_embed_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterEmbed_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitEmbed_definition(this);
        }
    }

    public final Embed_definitionContext embed_definition() throws RecognitionException {
        Embed_definitionContext _localctx = new Embed_definitionContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_embed_definition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(59);
                match(EMBED);
                setState(60);
                embed_pair();
                setState(65);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(61);
                            match(COMMA);
                            setState(62);
                            embed_pair();
                        }
                    }
                    setState(67);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(68);
                match(IN);
                setState(69);
                match(CURLY_OPEN);
                setState(73);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(70);
                            match(HOST_CODE);
                        }
                    }
                    setState(75);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(76);
                match(CURLY_CLOSED);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Embed_pairContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(SkadiFileParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(SkadiFileParser.ID, i);
        }

        public TerminalNode AT() {
            return getToken(SkadiFileParser.AT, 0);
        }

        public Embed_pairContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_embed_pair;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener) ((SkadiFileParserListener) listener).enterEmbed_pair(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener) ((SkadiFileParserListener) listener).exitEmbed_pair(this);
        }
    }

    public final Embed_pairContext embed_pair() throws RecognitionException {
        Embed_pairContext _localctx = new Embed_pairContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_embed_pair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(78);
                match(ID);
                setState(79);
                match(AT);
                setState(80);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Action_definitionContext extends ParserRuleContext {
        public Enter_actionContext enter_action() {
            return getRuleContext(Enter_actionContext.class, 0);
        }

        public Progress_actionContext progress_action() {
            return getRuleContext(Progress_actionContext.class, 0);
        }

        public Finish_actionContext finish_action() {
            return getRuleContext(Finish_actionContext.class, 0);
        }

        public Action_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_action_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterAction_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitAction_definition(this);
        }
    }

    public final Action_definitionContext action_definition() throws RecognitionException {
        Action_definitionContext _localctx = new Action_definitionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_action_definition);
        try {
            setState(85);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ENTER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(82);
                    enter_action();
                }
                break;
                case PROGRESS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(83);
                    progress_action();
                }
                break;
                case FINISH:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(84);
                    finish_action();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Enter_actionContext extends ParserRuleContext {
        public TerminalNode ENTER() {
            return getToken(SkadiFileParser.ENTER, 0);
        }

        public LocatorContext locator() {
            return getRuleContext(LocatorContext.class, 0);
        }

        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiFileParser.CURLY_OPEN, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiFileParser.CURLY_CLOSED, 0);
        }

        public List<TerminalNode> HOST_CODE() {
            return getTokens(SkadiFileParser.HOST_CODE);
        }

        public TerminalNode HOST_CODE(int i) {
            return getToken(SkadiFileParser.HOST_CODE, i);
        }

        public Enter_actionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_enter_action;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterEnter_action(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitEnter_action(this);
        }
    }

    public final Enter_actionContext enter_action() throws RecognitionException {
        Enter_actionContext _localctx = new Enter_actionContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_enter_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(87);
                match(ENTER);
                setState(88);
                locator();
                setState(89);
                match(CURLY_OPEN);
                setState(93);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(90);
                            match(HOST_CODE);
                        }
                    }
                    setState(95);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(96);
                match(CURLY_CLOSED);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Progress_actionContext extends ParserRuleContext {
        public TerminalNode PROGRESS() {
            return getToken(SkadiFileParser.PROGRESS, 0);
        }

        public LocatorContext locator() {
            return getRuleContext(LocatorContext.class, 0);
        }

        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiFileParser.CURLY_OPEN, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiFileParser.CURLY_CLOSED, 0);
        }

        public List<TerminalNode> HOST_CODE() {
            return getTokens(SkadiFileParser.HOST_CODE);
        }

        public TerminalNode HOST_CODE(int i) {
            return getToken(SkadiFileParser.HOST_CODE, i);
        }

        public Progress_actionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_progress_action;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterProgress_action(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitProgress_action(this);
        }
    }

    public final Progress_actionContext progress_action() throws RecognitionException {
        Progress_actionContext _localctx = new Progress_actionContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_progress_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(98);
                match(PROGRESS);
                setState(99);
                locator();
                setState(100);
                match(CURLY_OPEN);
                setState(104);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(101);
                            match(HOST_CODE);
                        }
                    }
                    setState(106);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(107);
                match(CURLY_CLOSED);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Finish_actionContext extends ParserRuleContext {
        public TerminalNode FINISH() {
            return getToken(SkadiFileParser.FINISH, 0);
        }

        public LocatorContext locator() {
            return getRuleContext(LocatorContext.class, 0);
        }

        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiFileParser.CURLY_OPEN, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiFileParser.CURLY_CLOSED, 0);
        }

        public List<TerminalNode> HOST_CODE() {
            return getTokens(SkadiFileParser.HOST_CODE);
        }

        public TerminalNode HOST_CODE(int i) {
            return getToken(SkadiFileParser.HOST_CODE, i);
        }

        public Finish_actionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_finish_action;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterFinish_action(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitFinish_action(this);
        }
    }

    public final Finish_actionContext finish_action() throws RecognitionException {
        Finish_actionContext _localctx = new Finish_actionContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_finish_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(109);
                match(FINISH);
                setState(110);
                locator();
                setState(111);
                match(CURLY_OPEN);
                setState(115);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(112);
                            match(HOST_CODE);
                        }
                    }
                    setState(117);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(118);
                match(CURLY_CLOSED);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LocatorContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(SkadiFileParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(SkadiFileParser.ID, i);
        }

        public List<TerminalNode> PERIOD() {
            return getTokens(SkadiFileParser.PERIOD);
        }

        public TerminalNode PERIOD(int i) {
            return getToken(SkadiFileParser.PERIOD, i);
        }

        public LocatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_locator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener) ((SkadiFileParserListener) listener).enterLocator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener) ((SkadiFileParserListener) listener).exitLocator(this);
        }
    }

    public final LocatorContext locator() throws RecognitionException {
        LocatorContext _localctx = new LocatorContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_locator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(120);
                match(ID);
                setState(125);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PERIOD) {
                    {
                        {
                            setState(121);
                            match(PERIOD);
                            setState(122);
                            match(ID);
                        }
                    }
                    setState(127);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u0001\u0013\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001" +
                    "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004" +
                    "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007" +
                    "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b" +
                    "\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001" +
                    "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0003\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005" +
                    "\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0005\u0005\u0005@\b\u0005\n\u0005\f\u0005C\t\u0005\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0005\u0005H\b\u0005\n\u0005\f\u0005K\t" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007V\b\u0007\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0005\b\\\b\b\n\b\f\b_\t\b\u0001\b\u0001\b" +
                    "\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tg\b\t\n\t\f\tj\t\t\u0001\t\u0001" +
                    "\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nr\b\n\n\n\f\nu\t\n\u0001\n\u0001" +
                    "\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b|\b\u000b\n\u000b\f" +
                    "\u000b\u007f\t\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006" +
                    "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u0082\u0000\u001b\u0001" +
                    "\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000" +
                    "\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000" +
                    "\n;\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000eU\u0001\u0000" +
                    "\u0000\u0000\u0010W\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000" +
                    "\u0014m\u0001\u0000\u0000\u0000\u0016x\u0001\u0000\u0000\u0000\u0018\u001a" +
                    "\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d" +
                    "\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c" +
                    "\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b" +
                    "\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001" +
                    "\u0001\u0000\u0000\u0000 &\u0003\u0004\u0002\u0000!&\u0003\u0006\u0003" +
                    "\u0000\"&\u0003\b\u0004\u0000#&\u0003\n\u0005\u0000$&\u0003\u000e\u0007" +
                    "\u0000% \u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000%\"\u0001\u0000" +
                    "\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0003" +
                    "\u0001\u0000\u0000\u0000\'(\u0005\u0004\u0000\u0000(,\u0005\r\u0000\u0000" +
                    ")+\u0005\u0001\u0000\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000" +
                    "\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000" +
                    "\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0002\u0000\u00000\u0005" +
                    "\u0001\u0000\u0000\u000012\u0005\u0005\u0000\u000023\u0005\u0011\u0000" +
                    "\u000034\u0005\u000e\u0000\u000045\u0005\u0003\u0000\u00005\u0007\u0001" +
                    "\u0000\u0000\u000067\u0005\u0006\u0000\u000078\u0005\u0011\u0000\u0000" +
                    "89\u0005\u000e\u0000\u00009:\u0005\u0003\u0000\u0000:\t\u0001\u0000\u0000" +
                    "\u0000;<\u0005\n\u0000\u0000<A\u0003\f\u0006\u0000=>\u0005\u0010\u0000" +
                    "\u0000>@\u0003\f\u0006\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000" +
                    "\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000" +
                    "\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\f\u0000\u0000EI\u0005\r" +
                    "\u0000\u0000FH\u0005\u0001\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001" +
                    "\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000" +
                    "JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u0002\u0000" +
                    "\u0000M\u000b\u0001\u0000\u0000\u0000NO\u0005\u0011\u0000\u0000OP\u0005" +
                    "\u000b\u0000\u0000PQ\u0005\u0011\u0000\u0000Q\r\u0001\u0000\u0000\u0000" +
                    "RV\u0003\u0010\b\u0000SV\u0003\u0012\t\u0000TV\u0003\u0014\n\u0000UR\u0001" +
                    "\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000" +
                    "V\u000f\u0001\u0000\u0000\u0000WX\u0005\u0007\u0000\u0000XY\u0003\u0016" +
                    "\u000b\u0000Y]\u0005\r\u0000\u0000Z\\\u0005\u0001\u0000\u0000[Z\u0001" +
                    "\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000" +
                    "]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000" +
                    "\u0000`a\u0005\u0002\u0000\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0005" +
                    "\b\u0000\u0000cd\u0003\u0016\u000b\u0000dh\u0005\r\u0000\u0000eg\u0005" +
                    "\u0001\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000" +
                    "hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000" +
                    "\u0000jh\u0001\u0000\u0000\u0000kl\u0005\u0002\u0000\u0000l\u0013\u0001" +
                    "\u0000\u0000\u0000mn\u0005\t\u0000\u0000no\u0003\u0016\u000b\u0000os\u0005" +
                    "\r\u0000\u0000pr\u0005\u0001\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001" +
                    "\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000" +
                    "tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005\u0002\u0000" +
                    "\u0000w\u0015\u0001\u0000\u0000\u0000x}\u0005\u0011\u0000\u0000yz\u0005" +
                    "\u000f\u0000\u0000z|\u0005\u0011\u0000\u0000{y\u0001\u0000\u0000\u0000" +
                    "|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000" +
                    "\u0000\u0000~\u0017\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000" +
                    "\n\u001b%,AIU]hs}";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}