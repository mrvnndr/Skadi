package de.mrvnndr.skadi.analysis.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

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
            ENTER = 7, PROGRESS = 8, FINISH = 9, CURLY_OPEN = 10, EQUAL = 11, PERIOD = 12, ID = 13,
            WS = 14, CODE_END = 15;
    public static final int
            RULE_file = 0, RULE_definition = 1, RULE_copy_definition = 2, RULE_fragment_definition = 3,
            RULE_automaton_definition = 4, RULE_action_definition = 5, RULE_enter_action = 6,
            RULE_progress_action = 7, RULE_finish_action = 8, RULE_locator = 9;

    private static String[] makeRuleNames() {
        return new String[]{
                "file", "definition", "copy_definition", "fragment_definition", "automaton_definition",
                "action_definition", "enter_action", "progress_action", "finish_action",
                "locator"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, "'copy'", "'fragment'", "'automaton'", "'enter'",
                "'progress'", "'finish'", "'{'", "'='", "'.'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "HOST_CODE", "CURLY_CLOSED", "REGEX", "COPY", "FRAGMENT", "AUTOMATON",
                "ENTER", "PROGRESS", "FINISH", "CURLY_OPEN", "EQUAL", "PERIOD", "ID",
                "WS", "CODE_END"
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
                setState(23);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008L) != 0)) {
                    {
                        {
                            setState(20);
                            definition();
                        }
                    }
                    setState(25);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(26);
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
            setState(32);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case COPY:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(28);
                    copy_definition();
                }
                break;
                case FRAGMENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(29);
                    fragment_definition();
                }
                break;
                case AUTOMATON:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(30);
                    automaton_definition();
                }
                break;
                case ENTER:
                case PROGRESS:
                case FINISH:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(31);
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
                setState(34);
                match(COPY);
                setState(35);
                match(CURLY_OPEN);
                setState(39);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(36);
                            match(HOST_CODE);
                        }
                    }
                    setState(41);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(42);
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
                setState(44);
                match(FRAGMENT);
                setState(45);
                match(ID);
                setState(46);
                match(EQUAL);
                setState(47);
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
                setState(49);
                match(AUTOMATON);
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
        enterRule(_localctx, 10, RULE_action_definition);
        try {
            setState(57);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ENTER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(54);
                    enter_action();
                }
                break;
                case PROGRESS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(55);
                    progress_action();
                }
                break;
                case FINISH:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(56);
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
        enterRule(_localctx, 12, RULE_enter_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(59);
                match(ENTER);
                setState(60);
                locator();
                setState(61);
                match(CURLY_OPEN);
                setState(65);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(62);
                            match(HOST_CODE);
                        }
                    }
                    setState(67);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(68);
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
        enterRule(_localctx, 14, RULE_progress_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(70);
                match(PROGRESS);
                setState(71);
                locator();
                setState(72);
                match(CURLY_OPEN);
                setState(76);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(73);
                            match(HOST_CODE);
                        }
                    }
                    setState(78);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(79);
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
        enterRule(_localctx, 16, RULE_finish_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                match(FINISH);
                setState(82);
                locator();
                setState(83);
                match(CURLY_OPEN);
                setState(87);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(84);
                            match(HOST_CODE);
                        }
                    }
                    setState(89);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(90);
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
        enterRule(_localctx, 18, RULE_locator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                match(ID);
                setState(97);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PERIOD) {
                    {
                        {
                            setState(93);
                            match(PERIOD);
                            setState(94);
                            match(ID);
                        }
                    }
                    setState(99);
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
            "\u0004\u0001\u000fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000" +
                    "\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005" +
                    "\u0001\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0001\u0006\u0005\u0006@\b\u0006\n\u0006\f\u0006C\t\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0005\u0007K\b\u0007\n\u0007\f\u0007N\t\u0007\u0001\u0007\u0001\u0007" +
                    "\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bV\b\b\n\b\f\bY\t\b\u0001\b\u0001" +
                    "\b\u0001\t\u0001\t\u0001\t\u0005\t`\b\t\n\t\f\tc\t\t\u0001\t\u0000\u0000" +
                    "\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000e\u0000" +
                    "\u0017\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004\"" +
                    "\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b1\u0001\u0000" +
                    "\u0000\u0000\n9\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e" +
                    "F\u0001\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012\\\u0001" +
                    "\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001" +
                    "\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001" +
                    "\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u001a\u0001" +
                    "\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0005" +
                    "\u0000\u0000\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c!\u0003\u0004" +
                    "\u0002\u0000\u001d!\u0003\u0006\u0003\u0000\u001e!\u0003\b\u0004\u0000" +
                    "\u001f!\u0003\n\u0005\u0000 \u001c\u0001\u0000\u0000\u0000 \u001d\u0001" +
                    "\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000" +
                    "\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0005\u0004\u0000\u0000#\'\u0005" +
                    "\n\u0000\u0000$&\u0005\u0001\u0000\u0000%$\u0001\u0000\u0000\u0000&)\u0001" +
                    "\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000" +
                    "(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000" +
                    "\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005\u0005\u0000\u0000-.\u0005" +
                    "\r\u0000\u0000./\u0005\u000b\u0000\u0000/0\u0005\u0003\u0000\u00000\u0007" +
                    "\u0001\u0000\u0000\u000012\u0005\u0006\u0000\u000023\u0005\r\u0000\u0000" +
                    "34\u0005\u000b\u0000\u000045\u0005\u0003\u0000\u00005\t\u0001\u0000\u0000" +
                    "\u00006:\u0003\f\u0006\u00007:\u0003\u000e\u0007\u00008:\u0003\u0010\b" +
                    "\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000" +
                    "\u0000\u0000:\u000b\u0001\u0000\u0000\u0000;<\u0005\u0007\u0000\u0000" +
                    "<=\u0003\u0012\t\u0000=A\u0005\n\u0000\u0000>@\u0005\u0001\u0000\u0000" +
                    "?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000" +
                    "\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000" +
                    "\u0000\u0000DE\u0005\u0002\u0000\u0000E\r\u0001\u0000\u0000\u0000FG\u0005" +
                    "\b\u0000\u0000GH\u0003\u0012\t\u0000HL\u0005\n\u0000\u0000IK\u0005\u0001" +
                    "\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001" +
                    "\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000" +
                    "NL\u0001\u0000\u0000\u0000OP\u0005\u0002\u0000\u0000P\u000f\u0001\u0000" +
                    "\u0000\u0000QR\u0005\t\u0000\u0000RS\u0003\u0012\t\u0000SW\u0005\n\u0000" +
                    "\u0000TV\u0005\u0001\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000" +
                    "\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001" +
                    "\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u0002\u0000\u0000" +
                    "[\u0011\u0001\u0000\u0000\u0000\\a\u0005\r\u0000\u0000]^\u0005\f\u0000" +
                    "\u0000^`\u0005\r\u0000\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000" +
                    "\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0013\u0001" +
                    "\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000\b\u0017 \'9ALWa";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}