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
            ENTER = 7, PROGRESS = 8, FINISH = 9, EMBED = 10, EMBEDDING = 11, AT = 12, IN = 13, CURLY_OPEN = 14,
            PAREN_OPEN = 15, PAREN_CLOSE = 16, EQUAL = 17, PERIOD = 18, COMMA = 19, COLON = 20,
            ID = 21, WS = 22, CODE_END = 23;
    public static final int
            RULE_file = 0, RULE_definition = 1, RULE_copy_definition = 2, RULE_fragment_definition = 3,
            RULE_automaton_definition = 4, RULE_embedding_definition = 5, RULE_embedding_key_value = 6,
            RULE_embed_definition = 7, RULE_action_definition = 8, RULE_enter_action = 9,
            RULE_progress_action = 10, RULE_finish_action = 11, RULE_locator = 12;

    private static String[] makeRuleNames() {
        return new String[]{
                "file", "definition", "copy_definition", "fragment_definition", "automaton_definition",
                "embedding_definition", "embedding_key_value", "embed_definition", "action_definition",
                "enter_action", "progress_action", "finish_action", "locator"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, "'copy'", "'fragment'", "'automaton'", "'enter'",
                "'progress'", "'finish'", "'embed'", "'embedding'", "'at'", "'in'", "'{'",
                "'('", "')'", "'='", "'.'", "','", "':'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "HOST_CODE", "CURLY_CLOSED", "REGEX", "COPY", "FRAGMENT", "AUTOMATON",
                "ENTER", "PROGRESS", "FINISH", "EMBED", "EMBEDDING", "AT", "IN", "CURLY_OPEN",
                "PAREN_OPEN", "PAREN_CLOSE", "EQUAL", "PERIOD", "COMMA", "COLON", "ID",
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
                setState(29);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4080L) != 0)) {
                    {
                        {
                            setState(26);
                            definition();
                        }
                    }
                    setState(31);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(32);
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

        public Embedding_definitionContext embedding_definition() {
            return getRuleContext(Embedding_definitionContext.class, 0);
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
            setState(40);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case COPY:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(34);
                    copy_definition();
                }
                break;
                case FRAGMENT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(35);
                    fragment_definition();
                }
                break;
                case AUTOMATON:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(36);
                    automaton_definition();
                }
                break;
                case EMBEDDING:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(37);
                    embedding_definition();
                }
                break;
                case EMBED:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(38);
                    embed_definition();
                }
                break;
                case ENTER:
                case PROGRESS:
                case FINISH:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(39);
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
                setState(42);
                match(COPY);
                setState(43);
                match(CURLY_OPEN);
                setState(47);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(44);
                            match(HOST_CODE);
                        }
                    }
                    setState(49);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(50);
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
                setState(52);
                match(FRAGMENT);
                setState(53);
                match(ID);
                setState(54);
                match(EQUAL);
                setState(55);
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
                setState(57);
                match(AUTOMATON);
                setState(58);
                match(ID);
                setState(59);
                match(EQUAL);
                setState(60);
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
    public static class Embedding_definitionContext extends ParserRuleContext {
        public TerminalNode EMBEDDING() {
            return getToken(SkadiFileParser.EMBEDDING, 0);
        }

        public TerminalNode ID() {
            return getToken(SkadiFileParser.ID, 0);
        }

        public TerminalNode PAREN_OPEN() {
            return getToken(SkadiFileParser.PAREN_OPEN, 0);
        }

        public List<Embedding_key_valueContext> embedding_key_value() {
            return getRuleContexts(Embedding_key_valueContext.class);
        }

        public Embedding_key_valueContext embedding_key_value(int i) {
            return getRuleContext(Embedding_key_valueContext.class, i);
        }

        public TerminalNode PAREN_CLOSE() {
            return getToken(SkadiFileParser.PAREN_CLOSE, 0);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(SkadiFileParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(SkadiFileParser.COMMA, i);
        }

        public Embedding_definitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_embedding_definition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterEmbedding_definition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitEmbedding_definition(this);
        }
    }

    public final Embedding_definitionContext embedding_definition() throws RecognitionException {
        Embedding_definitionContext _localctx = new Embedding_definitionContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_embedding_definition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(62);
                match(EMBEDDING);
                setState(63);
                match(ID);
                setState(64);
                match(PAREN_OPEN);
                setState(65);
                embedding_key_value();
                setState(70);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(66);
                            match(COMMA);
                            setState(67);
                            embedding_key_value();
                        }
                    }
                    setState(72);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(73);
                match(PAREN_CLOSE);
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
    public static class Embedding_key_valueContext extends ParserRuleContext {
        public List<TerminalNode> ID() {
            return getTokens(SkadiFileParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(SkadiFileParser.ID, i);
        }

        public TerminalNode COLON() {
            return getToken(SkadiFileParser.COLON, 0);
        }

        public Embedding_key_valueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_embedding_key_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).enterEmbedding_key_value(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiFileParserListener)
                ((SkadiFileParserListener) listener).exitEmbedding_key_value(this);
        }
    }

    public final Embedding_key_valueContext embedding_key_value() throws RecognitionException {
        Embedding_key_valueContext _localctx = new Embedding_key_valueContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_embedding_key_value);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(75);
                match(ID);
                setState(76);
                match(COLON);
                setState(77);
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
    public static class Embed_definitionContext extends ParserRuleContext {
        public TerminalNode EMBED() {
            return getToken(SkadiFileParser.EMBED, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(SkadiFileParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(SkadiFileParser.ID, i);
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
        enterRule(_localctx, 14, RULE_embed_definition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                match(EMBED);
                setState(80);
                match(ID);
                setState(85);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(81);
                            match(COMMA);
                            setState(82);
                            match(ID);
                        }
                    }
                    setState(87);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(88);
                match(IN);
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
        enterRule(_localctx, 16, RULE_action_definition);
        try {
            setState(101);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ENTER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(98);
                    enter_action();
                }
                break;
                case PROGRESS:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(99);
                    progress_action();
                }
                break;
                case FINISH:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(100);
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
        enterRule(_localctx, 18, RULE_enter_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(103);
                match(ENTER);
                setState(104);
                locator();
                setState(105);
                match(CURLY_OPEN);
                setState(109);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(106);
                            match(HOST_CODE);
                        }
                    }
                    setState(111);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(112);
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
        enterRule(_localctx, 20, RULE_progress_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                match(PROGRESS);
                setState(115);
                locator();
                setState(116);
                match(CURLY_OPEN);
                setState(120);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(117);
                            match(HOST_CODE);
                        }
                    }
                    setState(122);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(123);
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
        enterRule(_localctx, 22, RULE_finish_action);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(125);
                match(FINISH);
                setState(126);
                locator();
                setState(127);
                match(CURLY_OPEN);
                setState(131);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == HOST_CODE) {
                    {
                        {
                            setState(128);
                            match(HOST_CODE);
                        }
                    }
                    setState(133);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(134);
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
        enterRule(_localctx, 24, RULE_locator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(136);
                match(ID);
                setState(141);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == PERIOD) {
                    {
                        {
                            setState(137);
                            match(PERIOD);
                            setState(138);
                            match(ID);
                        }
                    }
                    setState(143);
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
            "\u0004\u0001\u0017\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001" +
                    "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004" +
                    "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007" +
                    "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b" +
                    "\u0002\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000" +
                    "\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0005\u0005E\b\u0005\n\u0005\f\u0005H\t\u0005\u0001\u0005\u0001\u0005" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0005\u0007T\b\u0007\n\u0007\f\u0007W\t\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\\\b\u0007\n\u0007\f\u0007" +
                    "_\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\bf\b\b" +
                    "\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tl\b\t\n\t\f\to\t\t\u0001\t\u0001" +
                    "\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nw\b\n\n\n\f\nz\t\n\u0001\n\u0001" +
                    "\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0082\b" +
                    "\u000b\n\u000b\f\u000b\u0085\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001" +
                    "\f\u0001\f\u0005\f\u008c\b\f\n\f\f\f\u008f\t\f\u0001\f\u0000\u0000\r\u0000" +
                    "\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000" +
                    "\u0093\u0000\u001d\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000" +
                    "\u0004*\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b9\u0001" +
                    "\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000" +
                    "\u000eO\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012g" +
                    "\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016}\u0001\u0000" +
                    "\u0000\u0000\u0018\u0088\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002" +
                    "\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000" +
                    "\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000" +
                    "\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000" +
                    "\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000\u0000\")\u0003" +
                    "\u0004\u0002\u0000#)\u0003\u0006\u0003\u0000$)\u0003\b\u0004\u0000%)\u0003" +
                    "\n\u0005\u0000&)\u0003\u000e\u0007\u0000\')\u0003\u0010\b\u0000(\"\u0001" +
                    "\u0000\u0000\u0000(#\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000" +
                    "(%\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000" +
                    "\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005\u0004\u0000\u0000+/\u0005" +
                    "\u000e\u0000\u0000,.\u0005\u0001\u0000\u0000-,\u0001\u0000\u0000\u0000" +
                    ".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000" +
                    "\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0002" +
                    "\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0005\u0000\u0000" +
                    "56\u0005\u0015\u0000\u000067\u0005\u0011\u0000\u000078\u0005\u0003\u0000" +
                    "\u00008\u0007\u0001\u0000\u0000\u00009:\u0005\u0006\u0000\u0000:;\u0005" +
                    "\u0015\u0000\u0000;<\u0005\u0011\u0000\u0000<=\u0005\u0003\u0000\u0000" +
                    "=\t\u0001\u0000\u0000\u0000>?\u0005\u000b\u0000\u0000?@\u0005\u0015\u0000" +
                    "\u0000@A\u0005\u000f\u0000\u0000AF\u0003\f\u0006\u0000BC\u0005\u0013\u0000" +
                    "\u0000CE\u0003\f\u0006\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000" +
                    "\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000" +
                    "\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0010\u0000\u0000J\u000b" +
                    "\u0001\u0000\u0000\u0000KL\u0005\u0015\u0000\u0000LM\u0005\u0014\u0000" +
                    "\u0000MN\u0005\u0015\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0005\n" +
                    "\u0000\u0000PU\u0005\u0015\u0000\u0000QR\u0005\u0013\u0000\u0000RT\u0005" +
                    "\u0015\u0000\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000" +
                    "US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000" +
                    "\u0000WU\u0001\u0000\u0000\u0000XY\u0005\r\u0000\u0000Y]\u0005\u000e\u0000" +
                    "\u0000Z\\\u0005\u0001\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000" +
                    "\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001" +
                    "\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0002\u0000\u0000" +
                    "a\u000f\u0001\u0000\u0000\u0000bf\u0003\u0012\t\u0000cf\u0003\u0014\n" +
                    "\u0000df\u0003\u0016\u000b\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000" +
                    "\u0000\u0000ed\u0001\u0000\u0000\u0000f\u0011\u0001\u0000\u0000\u0000" +
                    "gh\u0005\u0007\u0000\u0000hi\u0003\u0018\f\u0000im\u0005\u000e\u0000\u0000" +
                    "jl\u0005\u0001\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000" +
                    "\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000" +
                    "\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0002\u0000\u0000q\u0013" +
                    "\u0001\u0000\u0000\u0000rs\u0005\b\u0000\u0000st\u0003\u0018\f\u0000t" +
                    "x\u0005\u000e\u0000\u0000uw\u0005\u0001\u0000\u0000vu\u0001\u0000\u0000" +
                    "\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000" +
                    "\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005" +
                    "\u0002\u0000\u0000|\u0015\u0001\u0000\u0000\u0000}~\u0005\t\u0000\u0000" +
                    "~\u007f\u0003\u0018\f\u0000\u007f\u0083\u0005\u000e\u0000\u0000\u0080" +
                    "\u0082\u0005\u0001\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082" +
                    "\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083" +
                    "\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085" +
                    "\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0002\u0000\u0000\u0087" +
                    "\u0017\u0001\u0000\u0000\u0000\u0088\u008d\u0005\u0015\u0000\u0000\u0089" +
                    "\u008a\u0005\u0012\u0000\u0000\u008a\u008c\u0005\u0015\u0000\u0000\u008b" +
                    "\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d" +
                    "\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e" +
                    "\u0019\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u000b" +
                    "\u001d(/FU]emx\u0083\u008d";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}