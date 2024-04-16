package de.mrvnndr.skadi.analysis.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SkadiRegexParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            CH_a = 1, CH_b = 2, CH_c = 3, CH_d = 4, CH_e = 5, CH_f = 6, CH_n = 7, CH_r = 8, CH_s = 9,
            CH_t = 10, CH_v = 11, CH_w = 12, CH_x = 13, CH_A = 14, CH_B = 15, CH_C = 16, CH_D = 17,
            CH_E = 18, CH_F = 19, CH_S = 20, CH_W = 21, ZERO = 22, NON_ZERO_DIGIT = 23, PAREN_OPEN = 24,
            PAREN_CLOSED = 25, CURLY_OPEN = 26, CURLY_CLOSED = 27, BRACKET_OPEN = 28, BRACKET_CLOSED = 29,
            CIRCUMFLEX = 30, DASH = 31, UNDERSCORE = 32, STAR = 33, BACKSLASH = 34, PERIOD = 35,
            COMMA = 36, DOLLAR = 37, PLUS = 38, COLON = 39, QUESTION_MARK = 40, VERT_BAR = 41,
            CHAR = 42, PATTERN_CHAR = 43;
    public static final int
            RULE_regex = 0, RULE_inner_regex = 1, RULE_alternative = 2, RULE_term = 3,
            RULE_assertion = 4, RULE_quantifier = 5, RULE_quantifier_prefix = 6, RULE_atom = 7,
            RULE_atom_escape = 8, RULE_character_escape = 9, RULE_control_escape = 10,
            RULE_control_letter = 11, RULE_identity_escape = 12, RULE_decimal_escape = 13,
            RULE_hex_escape_sequence = 14, RULE_hex_digit = 15, RULE_character_class_escape = 16,
            RULE_character_class = 17, RULE_class_ranges = 18, RULE_non_empty_class_ranges = 19,
            RULE_non_empty_class_ranges_no_dash = 20, RULE_class_atom = 21, RULE_class_atom_no_dash = 22,
            RULE_class_escape = 23, RULE_rule_reference = 24, RULE_rule_name = 25,
            RULE_pattern_char = 26, RULE_digit = 27, RULE_char = 28;

    private static String[] makeRuleNames() {
        return new String[]{
                "regex", "inner_regex", "alternative", "term", "assertion", "quantifier",
                "quantifier_prefix", "atom", "atom_escape", "character_escape", "control_escape",
                "control_letter", "identity_escape", "decimal_escape", "hex_escape_sequence",
                "hex_digit", "character_class_escape", "character_class", "class_ranges",
                "non_empty_class_ranges", "non_empty_class_ranges_no_dash", "class_atom",
                "class_atom_no_dash", "class_escape", "rule_reference", "rule_name",
                "pattern_char", "digit", "char"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'n'", "'r'", "'s'",
                "'t'", "'v'", "'w'", "'x'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'",
                "'S'", "'W'", "'0'", null, "'('", "')'", "'{'", "'}'", "'['", "']'",
                "'^'", "'-'", "'_'", "'*'", "'\\'", "'.'", "','", "'$'", "'+'", "':'",
                "'?'", "'|'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "CH_a", "CH_b", "CH_c", "CH_d", "CH_e", "CH_f", "CH_n", "CH_r",
                "CH_s", "CH_t", "CH_v", "CH_w", "CH_x", "CH_A", "CH_B", "CH_C", "CH_D",
                "CH_E", "CH_F", "CH_S", "CH_W", "ZERO", "NON_ZERO_DIGIT", "PAREN_OPEN",
                "PAREN_CLOSED", "CURLY_OPEN", "CURLY_CLOSED", "BRACKET_OPEN", "BRACKET_CLOSED",
                "CIRCUMFLEX", "DASH", "UNDERSCORE", "STAR", "BACKSLASH", "PERIOD", "COMMA",
                "DOLLAR", "PLUS", "COLON", "QUESTION_MARK", "VERT_BAR", "CHAR", "PATTERN_CHAR"
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
        return "SkadiRegex.g4";
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

    public SkadiRegexParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RegexContext extends ParserRuleContext {
        public List<AlternativeContext> alternative() {
            return getRuleContexts(AlternativeContext.class);
        }

        public AlternativeContext alternative(int i) {
            return getRuleContext(AlternativeContext.class, i);
        }

        public TerminalNode EOF() {
            return getToken(SkadiRegexParser.EOF, 0);
        }

        public List<TerminalNode> VERT_BAR() {
            return getTokens(SkadiRegexParser.VERT_BAR);
        }

        public TerminalNode VERT_BAR(int i) {
            return getToken(SkadiRegexParser.VERT_BAR, i);
        }

        public RegexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_regex;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterRegex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitRegex(this);
        }
    }

    public final RegexContext regex() throws RecognitionException {
        RegexContext _localctx = new RegexContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_regex);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(58);
                alternative();
                setState(63);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == VERT_BAR) {
                    {
                        {
                            setState(59);
                            match(VERT_BAR);
                            setState(60);
                            alternative();
                        }
                    }
                    setState(65);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(66);
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
    public static class Inner_regexContext extends ParserRuleContext {
        public List<AlternativeContext> alternative() {
            return getRuleContexts(AlternativeContext.class);
        }

        public AlternativeContext alternative(int i) {
            return getRuleContext(AlternativeContext.class, i);
        }

        public List<TerminalNode> VERT_BAR() {
            return getTokens(SkadiRegexParser.VERT_BAR);
        }

        public TerminalNode VERT_BAR(int i) {
            return getToken(SkadiRegexParser.VERT_BAR, i);
        }

        public Inner_regexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inner_regex;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterInner_regex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitInner_regex(this);
        }
    }

    public final Inner_regexContext inner_regex() throws RecognitionException {
        Inner_regexContext _localctx = new Inner_regexContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_inner_regex);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                alternative();
                setState(73);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == VERT_BAR) {
                    {
                        {
                            setState(69);
                            match(VERT_BAR);
                            setState(70);
                            alternative();
                        }
                    }
                    setState(75);
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

    @SuppressWarnings("CheckReturnValue")
    public static class AlternativeContext extends ParserRuleContext {
        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public AlternativeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alternative;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAlternative(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAlternative(this);
        }
    }

    public final AlternativeContext alternative() throws RecognitionException {
        AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_alternative);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14003036225534L) != 0)) {
                    {
                        {
                            setState(76);
                            term();
                        }
                    }
                    setState(81);
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

    @SuppressWarnings("CheckReturnValue")
    public static class TermContext extends ParserRuleContext {
        public TermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_term;
        }

        public TermContext() {
        }

        public void copyFrom(TermContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomBaseContext extends TermContext {
        public AtomContext atom() {
            return getRuleContext(AtomContext.class, 0);
        }

        public AtomBaseContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomBase(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomBase(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomQuantifierContext extends TermContext {
        public AtomContext atom() {
            return getRuleContext(AtomContext.class, 0);
        }

        public QuantifierContext quantifier() {
            return getRuleContext(QuantifierContext.class, 0);
        }

        public AtomQuantifierContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomQuantifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomQuantifier(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomAssertionContext extends TermContext {
        public AssertionContext assertion() {
            return getRuleContext(AssertionContext.class, 0);
        }

        public AtomAssertionContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomAssertion(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomAssertion(this);
        }
    }

    public final TermContext term() throws RecognitionException {
        TermContext _localctx = new TermContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_term);
        try {
            setState(87);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                case 1:
                    _localctx = new AtomBaseContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(82);
                    atom();
                }
                break;
                case 2:
                    _localctx = new AtomQuantifierContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(83);
                    atom();
                    setState(84);
                    quantifier();
                }
                break;
                case 3:
                    _localctx = new AtomAssertionContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(86);
                    assertion();
                }
                break;
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
    public static class AssertionContext extends ParserRuleContext {
        public TerminalNode CIRCUMFLEX() {
            return getToken(SkadiRegexParser.CIRCUMFLEX, 0);
        }

        public TerminalNode DOLLAR() {
            return getToken(SkadiRegexParser.DOLLAR, 0);
        }

        public TerminalNode BACKSLASH() {
            return getToken(SkadiRegexParser.BACKSLASH, 0);
        }

        public TerminalNode CH_b() {
            return getToken(SkadiRegexParser.CH_b, 0);
        }

        public TerminalNode CH_B() {
            return getToken(SkadiRegexParser.CH_B, 0);
        }

        public AssertionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assertion;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAssertion(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAssertion(this);
        }
    }

    public final AssertionContext assertion() throws RecognitionException {
        AssertionContext _localctx = new AssertionContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_assertion);
        try {
            setState(95);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(89);
                    match(CIRCUMFLEX);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(90);
                    match(DOLLAR);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(91);
                    match(BACKSLASH);
                    setState(92);
                    match(CH_b);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(93);
                    match(BACKSLASH);
                    setState(94);
                    match(CH_B);
                }
                break;
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
    public static class QuantifierContext extends ParserRuleContext {
        public Quantifier_prefixContext quantifier_prefix() {
            return getRuleContext(Quantifier_prefixContext.class, 0);
        }

        public QuantifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_quantifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterQuantifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitQuantifier(this);
        }
    }

    public final QuantifierContext quantifier() throws RecognitionException {
        QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_quantifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(97);
                quantifier_prefix();
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
    public static class Quantifier_prefixContext extends ParserRuleContext {
        public Quantifier_prefixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_quantifier_prefix;
        }

        public Quantifier_prefixContext() {
        }

        public void copyFrom(Quantifier_prefixContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuantifierPlusContext extends Quantifier_prefixContext {
        public TerminalNode PLUS() {
            return getToken(SkadiRegexParser.PLUS, 0);
        }

        public QuantifierPlusContext(Quantifier_prefixContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterQuantifierPlus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitQuantifierPlus(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuantifierQuestionMarkContext extends Quantifier_prefixContext {
        public TerminalNode QUESTION_MARK() {
            return getToken(SkadiRegexParser.QUESTION_MARK, 0);
        }

        public QuantifierQuestionMarkContext(Quantifier_prefixContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener)
                ((SkadiRegexListener) listener).enterQuantifierQuestionMark(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener)
                ((SkadiRegexListener) listener).exitQuantifierQuestionMark(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuantifierBetweenContext extends Quantifier_prefixContext {
        public DigitContext digit;
        public List<DigitContext> amtL = new ArrayList<DigitContext>();
        public List<DigitContext> amtH = new ArrayList<DigitContext>();

        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiRegexParser.CURLY_OPEN, 0);
        }

        public TerminalNode COMMA() {
            return getToken(SkadiRegexParser.COMMA, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiRegexParser.CURLY_CLOSED, 0);
        }

        public List<DigitContext> digit() {
            return getRuleContexts(DigitContext.class);
        }

        public DigitContext digit(int i) {
            return getRuleContext(DigitContext.class, i);
        }

        public QuantifierBetweenContext(Quantifier_prefixContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterQuantifierBetween(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitQuantifierBetween(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuantifierExactlyContext extends Quantifier_prefixContext {
        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiRegexParser.CURLY_OPEN, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiRegexParser.CURLY_CLOSED, 0);
        }

        public List<DigitContext> digit() {
            return getRuleContexts(DigitContext.class);
        }

        public DigitContext digit(int i) {
            return getRuleContext(DigitContext.class, i);
        }

        public QuantifierExactlyContext(Quantifier_prefixContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterQuantifierExactly(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitQuantifierExactly(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuantifierStarContext extends Quantifier_prefixContext {
        public TerminalNode STAR() {
            return getToken(SkadiRegexParser.STAR, 0);
        }

        public QuantifierStarContext(Quantifier_prefixContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterQuantifierStar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitQuantifierStar(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class QuantifierAtLeastContext extends Quantifier_prefixContext {
        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiRegexParser.CURLY_OPEN, 0);
        }

        public TerminalNode COMMA() {
            return getToken(SkadiRegexParser.COMMA, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiRegexParser.CURLY_CLOSED, 0);
        }

        public List<DigitContext> digit() {
            return getRuleContexts(DigitContext.class);
        }

        public DigitContext digit(int i) {
            return getRuleContext(DigitContext.class, i);
        }

        public QuantifierAtLeastContext(Quantifier_prefixContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterQuantifierAtLeast(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitQuantifierAtLeast(this);
        }
    }

    public final Quantifier_prefixContext quantifier_prefix() throws RecognitionException {
        Quantifier_prefixContext _localctx = new Quantifier_prefixContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_quantifier_prefix);
        int _la;
        try {
            setState(133);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                case 1:
                    _localctx = new QuantifierStarContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(99);
                    match(STAR);
                }
                break;
                case 2:
                    _localctx = new QuantifierPlusContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(100);
                    match(PLUS);
                }
                break;
                case 3:
                    _localctx = new QuantifierQuestionMarkContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(101);
                    match(QUESTION_MARK);
                }
                break;
                case 4:
                    _localctx = new QuantifierExactlyContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(102);
                    match(CURLY_OPEN);
                    setState(104);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(103);
                                digit();
                            }
                        }
                        setState(106);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == ZERO || _la == NON_ZERO_DIGIT);
                    setState(108);
                    match(CURLY_CLOSED);
                }
                break;
                case 5:
                    _localctx = new QuantifierAtLeastContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(110);
                    match(CURLY_OPEN);
                    setState(112);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(111);
                                digit();
                            }
                        }
                        setState(114);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == ZERO || _la == NON_ZERO_DIGIT);
                    setState(116);
                    match(COMMA);
                    setState(117);
                    match(CURLY_CLOSED);
                }
                break;
                case 6:
                    _localctx = new QuantifierBetweenContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(119);
                    match(CURLY_OPEN);
                    setState(121);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(120);
                                ((QuantifierBetweenContext) _localctx).digit = digit();
                                ((QuantifierBetweenContext) _localctx).amtL.add(((QuantifierBetweenContext) _localctx).digit);
                            }
                        }
                        setState(123);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == ZERO || _la == NON_ZERO_DIGIT);
                    setState(125);
                    match(COMMA);
                    setState(127);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(126);
                                ((QuantifierBetweenContext) _localctx).digit = digit();
                                ((QuantifierBetweenContext) _localctx).amtH.add(((QuantifierBetweenContext) _localctx).digit);
                            }
                        }
                        setState(129);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == ZERO || _la == NON_ZERO_DIGIT);
                    setState(131);
                    match(CURLY_CLOSED);
                }
                break;
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
    public static class AtomContext extends ParserRuleContext {
        public AtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atom;
        }

        public AtomContext() {
        }

        public void copyFrom(AtomContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomAtomEscapeContext extends AtomContext {
        public TerminalNode BACKSLASH() {
            return getToken(SkadiRegexParser.BACKSLASH, 0);
        }

        public Atom_escapeContext atom_escape() {
            return getRuleContext(Atom_escapeContext.class, 0);
        }

        public AtomAtomEscapeContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomAtomEscape(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomAtomEscape(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomPeriodContext extends AtomContext {
        public TerminalNode PERIOD() {
            return getToken(SkadiRegexParser.PERIOD, 0);
        }

        public AtomPeriodContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomPeriod(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomPeriod(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomParenRegexContext extends AtomContext {
        public TerminalNode PAREN_OPEN() {
            return getToken(SkadiRegexParser.PAREN_OPEN, 0);
        }

        public Inner_regexContext inner_regex() {
            return getRuleContext(Inner_regexContext.class, 0);
        }

        public TerminalNode PAREN_CLOSED() {
            return getToken(SkadiRegexParser.PAREN_CLOSED, 0);
        }

        public TerminalNode QUESTION_MARK() {
            return getToken(SkadiRegexParser.QUESTION_MARK, 0);
        }

        public TerminalNode COLON() {
            return getToken(SkadiRegexParser.COLON, 0);
        }

        public AtomParenRegexContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomParenRegex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomParenRegex(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomCharacterClassContext extends AtomContext {
        public Character_classContext character_class() {
            return getRuleContext(Character_classContext.class, 0);
        }

        public AtomCharacterClassContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomCharacterClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomCharacterClass(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomRuleReferenceContext extends AtomContext {
        public Rule_referenceContext rule_reference() {
            return getRuleContext(Rule_referenceContext.class, 0);
        }

        public AtomRuleReferenceContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomRuleReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomRuleReference(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtomPatternCharContext extends AtomContext {
        public Pattern_charContext pattern_char() {
            return getRuleContext(Pattern_charContext.class, 0);
        }

        public AtomPatternCharContext(AtomContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtomPatternChar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtomPatternChar(this);
        }
    }

    public final AtomContext atom() throws RecognitionException {
        AtomContext _localctx = new AtomContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_atom);
        int _la;
        try {
            setState(149);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case CH_a:
                case CH_b:
                case CH_c:
                case CH_d:
                case CH_e:
                case CH_f:
                case CH_n:
                case CH_r:
                case CH_s:
                case CH_t:
                case CH_v:
                case CH_w:
                case CH_x:
                case CH_A:
                case CH_B:
                case CH_C:
                case CH_D:
                case CH_E:
                case CH_F:
                case CH_S:
                case CH_W:
                case ZERO:
                case NON_ZERO_DIGIT:
                case COMMA:
                case COLON:
                case CHAR:
                case PATTERN_CHAR:
                    _localctx = new AtomPatternCharContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(135);
                    pattern_char();
                }
                break;
                case PERIOD:
                    _localctx = new AtomPeriodContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(136);
                    match(PERIOD);
                }
                break;
                case BACKSLASH:
                    _localctx = new AtomAtomEscapeContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(137);
                    match(BACKSLASH);
                    setState(138);
                    atom_escape();
                }
                break;
                case BRACKET_OPEN:
                    _localctx = new AtomCharacterClassContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(139);
                    character_class();
                }
                break;
                case PAREN_OPEN:
                    _localctx = new AtomParenRegexContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(140);
                    match(PAREN_OPEN);
                    setState(143);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == QUESTION_MARK) {
                        {
                            setState(141);
                            match(QUESTION_MARK);
                            setState(142);
                            match(COLON);
                        }
                    }

                    setState(145);
                    inner_regex();
                    setState(146);
                    match(PAREN_CLOSED);
                }
                break;
                case CURLY_OPEN:
                    _localctx = new AtomRuleReferenceContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(148);
                    rule_reference();
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
    public static class Atom_escapeContext extends ParserRuleContext {
        public Decimal_escapeContext decimal_escape() {
            return getRuleContext(Decimal_escapeContext.class, 0);
        }

        public Character_class_escapeContext character_class_escape() {
            return getRuleContext(Character_class_escapeContext.class, 0);
        }

        public Character_escapeContext character_escape() {
            return getRuleContext(Character_escapeContext.class, 0);
        }

        public Atom_escapeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atom_escape;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterAtom_escape(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitAtom_escape(this);
        }
    }

    public final Atom_escapeContext atom_escape() throws RecognitionException {
        Atom_escapeContext _localctx = new Atom_escapeContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_atom_escape);
        try {
            setState(154);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(151);
                    decimal_escape();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(152);
                    character_class_escape();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(153);
                    character_escape();
                }
                break;
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
    public static class Character_escapeContext extends ParserRuleContext {
        public Control_escapeContext control_escape() {
            return getRuleContext(Control_escapeContext.class, 0);
        }

        public TerminalNode CH_c() {
            return getToken(SkadiRegexParser.CH_c, 0);
        }

        public Control_letterContext control_letter() {
            return getRuleContext(Control_letterContext.class, 0);
        }

        public Hex_escape_sequenceContext hex_escape_sequence() {
            return getRuleContext(Hex_escape_sequenceContext.class, 0);
        }

        public Identity_escapeContext identity_escape() {
            return getRuleContext(Identity_escapeContext.class, 0);
        }

        public Character_escapeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_character_escape;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterCharacter_escape(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitCharacter_escape(this);
        }
    }

    public final Character_escapeContext character_escape() throws RecognitionException {
        Character_escapeContext _localctx = new Character_escapeContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_character_escape);
        try {
            setState(161);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(156);
                    control_escape();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(157);
                    match(CH_c);
                    setState(158);
                    control_letter();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(159);
                    hex_escape_sequence();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(160);
                    identity_escape();
                }
                break;
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
    public static class Control_escapeContext extends ParserRuleContext {
        public TerminalNode CH_f() {
            return getToken(SkadiRegexParser.CH_f, 0);
        }

        public TerminalNode CH_n() {
            return getToken(SkadiRegexParser.CH_n, 0);
        }

        public TerminalNode CH_r() {
            return getToken(SkadiRegexParser.CH_r, 0);
        }

        public TerminalNode CH_t() {
            return getToken(SkadiRegexParser.CH_t, 0);
        }

        public TerminalNode CH_v() {
            return getToken(SkadiRegexParser.CH_v, 0);
        }

        public Control_escapeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_control_escape;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterControl_escape(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitControl_escape(this);
        }
    }

    public final Control_escapeContext control_escape() throws RecognitionException {
        Control_escapeContext _localctx = new Control_escapeContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_control_escape);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(163);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 3520L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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

    @SuppressWarnings("CheckReturnValue")
    public static class Control_letterContext extends ParserRuleContext {
        public CharContext char_() {
            return getRuleContext(CharContext.class, 0);
        }

        public Control_letterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_control_letter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterControl_letter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitControl_letter(this);
        }
    }

    public final Control_letterContext control_letter() throws RecognitionException {
        Control_letterContext _localctx = new Control_letterContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_control_letter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(165);
                char_();
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
    public static class Identity_escapeContext extends ParserRuleContext {
        public Identity_escapeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identity_escape;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterIdentity_escape(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitIdentity_escape(this);
        }
    }

    public final Identity_escapeContext identity_escape() throws RecognitionException {
        Identity_escapeContext _localctx = new Identity_escapeContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_identity_escape);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(167);
                matchWildcard();
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
    public static class Decimal_escapeContext extends ParserRuleContext {
        public List<TerminalNode> ZERO() {
            return getTokens(SkadiRegexParser.ZERO);
        }

        public TerminalNode ZERO(int i) {
            return getToken(SkadiRegexParser.ZERO, i);
        }

        public List<TerminalNode> NON_ZERO_DIGIT() {
            return getTokens(SkadiRegexParser.NON_ZERO_DIGIT);
        }

        public TerminalNode NON_ZERO_DIGIT(int i) {
            return getToken(SkadiRegexParser.NON_ZERO_DIGIT, i);
        }

        public Decimal_escapeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decimal_escape;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterDecimal_escape(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitDecimal_escape(this);
        }
    }

    public final Decimal_escapeContext decimal_escape() throws RecognitionException {
        Decimal_escapeContext _localctx = new Decimal_escapeContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_decimal_escape);
        int _la;
        try {
            int _alt;
            setState(177);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ZERO:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(169);
                    match(ZERO);
                }
                break;
                case NON_ZERO_DIGIT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(170);
                    match(NON_ZERO_DIGIT);
                    setState(174);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(171);
                                    _la = _input.LA(1);
                                    if (!(_la == ZERO || _la == NON_ZERO_DIGIT)) {
                                        _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                }
                            }
                        }
                        setState(176);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
                    }
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
    public static class Hex_escape_sequenceContext extends ParserRuleContext {
        public TerminalNode CH_x() {
            return getToken(SkadiRegexParser.CH_x, 0);
        }

        public List<Hex_digitContext> hex_digit() {
            return getRuleContexts(Hex_digitContext.class);
        }

        public Hex_digitContext hex_digit(int i) {
            return getRuleContext(Hex_digitContext.class, i);
        }

        public Hex_escape_sequenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_hex_escape_sequence;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterHex_escape_sequence(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitHex_escape_sequence(this);
        }
    }

    public final Hex_escape_sequenceContext hex_escape_sequence() throws RecognitionException {
        Hex_escape_sequenceContext _localctx = new Hex_escape_sequenceContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_hex_escape_sequence);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                match(CH_x);
                setState(180);
                hex_digit();
                setState(181);
                hex_digit();
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
    public static class Hex_digitContext extends ParserRuleContext {
        public DigitContext digit() {
            return getRuleContext(DigitContext.class, 0);
        }

        public TerminalNode CH_a() {
            return getToken(SkadiRegexParser.CH_a, 0);
        }

        public TerminalNode CH_b() {
            return getToken(SkadiRegexParser.CH_b, 0);
        }

        public TerminalNode CH_c() {
            return getToken(SkadiRegexParser.CH_c, 0);
        }

        public TerminalNode CH_d() {
            return getToken(SkadiRegexParser.CH_d, 0);
        }

        public TerminalNode CH_e() {
            return getToken(SkadiRegexParser.CH_e, 0);
        }

        public TerminalNode CH_f() {
            return getToken(SkadiRegexParser.CH_f, 0);
        }

        public TerminalNode CH_A() {
            return getToken(SkadiRegexParser.CH_A, 0);
        }

        public TerminalNode CH_B() {
            return getToken(SkadiRegexParser.CH_B, 0);
        }

        public TerminalNode CH_C() {
            return getToken(SkadiRegexParser.CH_C, 0);
        }

        public TerminalNode CH_D() {
            return getToken(SkadiRegexParser.CH_D, 0);
        }

        public TerminalNode CH_E() {
            return getToken(SkadiRegexParser.CH_E, 0);
        }

        public TerminalNode CH_F() {
            return getToken(SkadiRegexParser.CH_F, 0);
        }

        public Hex_digitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_hex_digit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterHex_digit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitHex_digit(this);
        }
    }

    public final Hex_digitContext hex_digit() throws RecognitionException {
        Hex_digitContext _localctx = new Hex_digitContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_hex_digit);
        try {
            setState(196);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ZERO:
                case NON_ZERO_DIGIT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(183);
                    digit();
                }
                break;
                case CH_a:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(184);
                    match(CH_a);
                }
                break;
                case CH_b:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(185);
                    match(CH_b);
                }
                break;
                case CH_c:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(186);
                    match(CH_c);
                }
                break;
                case CH_d:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(187);
                    match(CH_d);
                }
                break;
                case CH_e:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(188);
                    match(CH_e);
                }
                break;
                case CH_f:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(189);
                    match(CH_f);
                }
                break;
                case CH_A:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(190);
                    match(CH_A);
                }
                break;
                case CH_B:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(191);
                    match(CH_B);
                }
                break;
                case CH_C:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(192);
                    match(CH_C);
                }
                break;
                case CH_D:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(193);
                    match(CH_D);
                }
                break;
                case CH_E:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(194);
                    match(CH_E);
                }
                break;
                case CH_F:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(195);
                    match(CH_F);
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
    public static class Character_class_escapeContext extends ParserRuleContext {
        public TerminalNode CH_d() {
            return getToken(SkadiRegexParser.CH_d, 0);
        }

        public TerminalNode CH_D() {
            return getToken(SkadiRegexParser.CH_D, 0);
        }

        public TerminalNode CH_s() {
            return getToken(SkadiRegexParser.CH_s, 0);
        }

        public TerminalNode CH_S() {
            return getToken(SkadiRegexParser.CH_S, 0);
        }

        public TerminalNode CH_w() {
            return getToken(SkadiRegexParser.CH_w, 0);
        }

        public TerminalNode CH_W() {
            return getToken(SkadiRegexParser.CH_W, 0);
        }

        public Character_class_escapeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_character_class_escape;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener)
                ((SkadiRegexListener) listener).enterCharacter_class_escape(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener)
                ((SkadiRegexListener) listener).exitCharacter_class_escape(this);
        }
    }

    public final Character_class_escapeContext character_class_escape() throws RecognitionException {
        Character_class_escapeContext _localctx = new Character_class_escapeContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_character_class_escape);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(198);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 3281424L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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

    @SuppressWarnings("CheckReturnValue")
    public static class Character_classContext extends ParserRuleContext {
        public TerminalNode BRACKET_OPEN() {
            return getToken(SkadiRegexParser.BRACKET_OPEN, 0);
        }

        public Class_rangesContext class_ranges() {
            return getRuleContext(Class_rangesContext.class, 0);
        }

        public TerminalNode BRACKET_CLOSED() {
            return getToken(SkadiRegexParser.BRACKET_CLOSED, 0);
        }

        public TerminalNode CIRCUMFLEX() {
            return getToken(SkadiRegexParser.CIRCUMFLEX, 0);
        }

        public Character_classContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_character_class;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterCharacter_class(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitCharacter_class(this);
        }
    }

    public final Character_classContext character_class() throws RecognitionException {
        Character_classContext _localctx = new Character_classContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_character_class);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                match(BRACKET_OPEN);
                setState(202);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                    case 1: {
                        setState(201);
                        match(CIRCUMFLEX);
                    }
                    break;
                }
                setState(204);
                class_ranges();
                setState(205);
                match(BRACKET_CLOSED);
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
    public static class Class_rangesContext extends ParserRuleContext {
        public Non_empty_class_rangesContext non_empty_class_ranges() {
            return getRuleContext(Non_empty_class_rangesContext.class, 0);
        }

        public Class_rangesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_ranges;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterClass_ranges(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitClass_ranges(this);
        }
    }

    public final Class_rangesContext class_ranges() throws RecognitionException {
        Class_rangesContext _localctx = new Class_rangesContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_class_ranges);
        try {
            setState(209);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BRACKET_CLOSED:
                    enterOuterAlt(_localctx, 1);
                {
                }
                break;
                case CH_a:
                case CH_b:
                case CH_c:
                case CH_d:
                case CH_e:
                case CH_f:
                case CH_n:
                case CH_r:
                case CH_s:
                case CH_t:
                case CH_v:
                case CH_w:
                case CH_x:
                case CH_A:
                case CH_B:
                case CH_C:
                case CH_D:
                case CH_E:
                case CH_F:
                case CH_S:
                case CH_W:
                case ZERO:
                case NON_ZERO_DIGIT:
                case PAREN_OPEN:
                case PAREN_CLOSED:
                case CURLY_OPEN:
                case CURLY_CLOSED:
                case BRACKET_OPEN:
                case CIRCUMFLEX:
                case DASH:
                case UNDERSCORE:
                case STAR:
                case BACKSLASH:
                case PERIOD:
                case COMMA:
                case DOLLAR:
                case PLUS:
                case COLON:
                case QUESTION_MARK:
                case VERT_BAR:
                case CHAR:
                case PATTERN_CHAR:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(208);
                    non_empty_class_ranges();
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
    public static class Non_empty_class_rangesContext extends ParserRuleContext {
        public Class_atomContext from;
        public Class_atomContext to;

        public List<Class_atomContext> class_atom() {
            return getRuleContexts(Class_atomContext.class);
        }

        public Class_atomContext class_atom(int i) {
            return getRuleContext(Class_atomContext.class, i);
        }

        public Non_empty_class_ranges_no_dashContext non_empty_class_ranges_no_dash() {
            return getRuleContext(Non_empty_class_ranges_no_dashContext.class, 0);
        }

        public TerminalNode DASH() {
            return getToken(SkadiRegexParser.DASH, 0);
        }

        public Class_rangesContext class_ranges() {
            return getRuleContext(Class_rangesContext.class, 0);
        }

        public Non_empty_class_rangesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_non_empty_class_ranges;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener)
                ((SkadiRegexListener) listener).enterNon_empty_class_ranges(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener)
                ((SkadiRegexListener) listener).exitNon_empty_class_ranges(this);
        }
    }

    public final Non_empty_class_rangesContext non_empty_class_ranges() throws RecognitionException {
        Non_empty_class_rangesContext _localctx = new Non_empty_class_rangesContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_non_empty_class_ranges);
        try {
            setState(220);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(211);
                    class_atom();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(212);
                    class_atom();
                    setState(213);
                    non_empty_class_ranges_no_dash();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(215);
                    ((Non_empty_class_rangesContext) _localctx).from = class_atom();
                    setState(216);
                    match(DASH);
                    setState(217);
                    ((Non_empty_class_rangesContext) _localctx).to = class_atom();
                    setState(218);
                    class_ranges();
                }
                break;
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
    public static class Non_empty_class_ranges_no_dashContext extends ParserRuleContext {
        public Class_atom_no_dashContext from;
        public Class_atomContext to;

        public Class_atomContext class_atom() {
            return getRuleContext(Class_atomContext.class, 0);
        }

        public Class_atom_no_dashContext class_atom_no_dash() {
            return getRuleContext(Class_atom_no_dashContext.class, 0);
        }

        public Non_empty_class_ranges_no_dashContext non_empty_class_ranges_no_dash() {
            return getRuleContext(Non_empty_class_ranges_no_dashContext.class, 0);
        }

        public TerminalNode DASH() {
            return getToken(SkadiRegexParser.DASH, 0);
        }

        public Class_rangesContext class_ranges() {
            return getRuleContext(Class_rangesContext.class, 0);
        }

        public Non_empty_class_ranges_no_dashContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_non_empty_class_ranges_no_dash;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener)
                ((SkadiRegexListener) listener).enterNon_empty_class_ranges_no_dash(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener)
                ((SkadiRegexListener) listener).exitNon_empty_class_ranges_no_dash(this);
        }
    }

    public final Non_empty_class_ranges_no_dashContext non_empty_class_ranges_no_dash() throws RecognitionException {
        Non_empty_class_ranges_no_dashContext _localctx = new Non_empty_class_ranges_no_dashContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_non_empty_class_ranges_no_dash);
        try {
            setState(231);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(222);
                    class_atom();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(223);
                    class_atom_no_dash();
                    setState(224);
                    non_empty_class_ranges_no_dash();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(226);
                    ((Non_empty_class_ranges_no_dashContext) _localctx).from = class_atom_no_dash();
                    setState(227);
                    match(DASH);
                    setState(228);
                    ((Non_empty_class_ranges_no_dashContext) _localctx).to = class_atom();
                    setState(229);
                    class_ranges();
                }
                break;
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
    public static class Class_atomContext extends ParserRuleContext {
        public TerminalNode DASH() {
            return getToken(SkadiRegexParser.DASH, 0);
        }

        public Class_atom_no_dashContext class_atom_no_dash() {
            return getRuleContext(Class_atom_no_dashContext.class, 0);
        }

        public Class_atomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_atom;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterClass_atom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitClass_atom(this);
        }
    }

    public final Class_atomContext class_atom() throws RecognitionException {
        Class_atomContext _localctx = new Class_atomContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_class_atom);
        try {
            setState(235);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case DASH:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(233);
                    match(DASH);
                }
                break;
                case CH_a:
                case CH_b:
                case CH_c:
                case CH_d:
                case CH_e:
                case CH_f:
                case CH_n:
                case CH_r:
                case CH_s:
                case CH_t:
                case CH_v:
                case CH_w:
                case CH_x:
                case CH_A:
                case CH_B:
                case CH_C:
                case CH_D:
                case CH_E:
                case CH_F:
                case CH_S:
                case CH_W:
                case ZERO:
                case NON_ZERO_DIGIT:
                case PAREN_OPEN:
                case PAREN_CLOSED:
                case CURLY_OPEN:
                case CURLY_CLOSED:
                case BRACKET_OPEN:
                case CIRCUMFLEX:
                case UNDERSCORE:
                case STAR:
                case BACKSLASH:
                case PERIOD:
                case COMMA:
                case DOLLAR:
                case PLUS:
                case COLON:
                case QUESTION_MARK:
                case VERT_BAR:
                case CHAR:
                case PATTERN_CHAR:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(234);
                    class_atom_no_dash();
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
    public static class Class_atom_no_dashContext extends ParserRuleContext {
        public TerminalNode BACKSLASH() {
            return getToken(SkadiRegexParser.BACKSLASH, 0);
        }

        public Class_escapeContext class_escape() {
            return getRuleContext(Class_escapeContext.class, 0);
        }

        public DigitContext digit() {
            return getRuleContext(DigitContext.class, 0);
        }

        public CharContext char_() {
            return getRuleContext(CharContext.class, 0);
        }

        public TerminalNode PATTERN_CHAR() {
            return getToken(SkadiRegexParser.PATTERN_CHAR, 0);
        }

        public TerminalNode COMMA() {
            return getToken(SkadiRegexParser.COMMA, 0);
        }

        public TerminalNode CIRCUMFLEX() {
            return getToken(SkadiRegexParser.CIRCUMFLEX, 0);
        }

        public TerminalNode VERT_BAR() {
            return getToken(SkadiRegexParser.VERT_BAR, 0);
        }

        public TerminalNode DOLLAR() {
            return getToken(SkadiRegexParser.DOLLAR, 0);
        }

        public TerminalNode STAR() {
            return getToken(SkadiRegexParser.STAR, 0);
        }

        public TerminalNode PLUS() {
            return getToken(SkadiRegexParser.PLUS, 0);
        }

        public TerminalNode PERIOD() {
            return getToken(SkadiRegexParser.PERIOD, 0);
        }

        public TerminalNode QUESTION_MARK() {
            return getToken(SkadiRegexParser.QUESTION_MARK, 0);
        }

        public TerminalNode PAREN_OPEN() {
            return getToken(SkadiRegexParser.PAREN_OPEN, 0);
        }

        public TerminalNode PAREN_CLOSED() {
            return getToken(SkadiRegexParser.PAREN_CLOSED, 0);
        }

        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiRegexParser.CURLY_OPEN, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiRegexParser.CURLY_CLOSED, 0);
        }

        public TerminalNode COLON() {
            return getToken(SkadiRegexParser.COLON, 0);
        }

        public TerminalNode BRACKET_OPEN() {
            return getToken(SkadiRegexParser.BRACKET_OPEN, 0);
        }

        public TerminalNode UNDERSCORE() {
            return getToken(SkadiRegexParser.UNDERSCORE, 0);
        }

        public Class_atom_no_dashContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_atom_no_dash;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterClass_atom_no_dash(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitClass_atom_no_dash(this);
        }
    }

    public final Class_atom_no_dashContext class_atom_no_dash() throws RecognitionException {
        Class_atom_no_dashContext _localctx = new Class_atom_no_dashContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_class_atom_no_dash);
        try {
            setState(257);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BACKSLASH:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(237);
                    match(BACKSLASH);
                    setState(238);
                    class_escape();
                }
                break;
                case ZERO:
                case NON_ZERO_DIGIT:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(239);
                    digit();
                }
                break;
                case CH_a:
                case CH_b:
                case CH_c:
                case CH_d:
                case CH_e:
                case CH_f:
                case CH_n:
                case CH_r:
                case CH_s:
                case CH_t:
                case CH_v:
                case CH_w:
                case CH_x:
                case CH_A:
                case CH_B:
                case CH_C:
                case CH_D:
                case CH_E:
                case CH_F:
                case CH_S:
                case CH_W:
                case CHAR:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(240);
                    char_();
                }
                break;
                case PATTERN_CHAR:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(241);
                    match(PATTERN_CHAR);
                }
                break;
                case COMMA:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(242);
                    match(COMMA);
                }
                break;
                case CIRCUMFLEX:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(243);
                    match(CIRCUMFLEX);
                }
                break;
                case VERT_BAR:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(244);
                    match(VERT_BAR);
                }
                break;
                case DOLLAR:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(245);
                    match(DOLLAR);
                }
                break;
                case STAR:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(246);
                    match(STAR);
                }
                break;
                case PLUS:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(247);
                    match(PLUS);
                }
                break;
                case PERIOD:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(248);
                    match(PERIOD);
                }
                break;
                case QUESTION_MARK:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(249);
                    match(QUESTION_MARK);
                }
                break;
                case PAREN_OPEN:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(250);
                    match(PAREN_OPEN);
                }
                break;
                case PAREN_CLOSED:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(251);
                    match(PAREN_CLOSED);
                }
                break;
                case CURLY_OPEN:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(252);
                    match(CURLY_OPEN);
                }
                break;
                case CURLY_CLOSED:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(253);
                    match(CURLY_CLOSED);
                }
                break;
                case COLON:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(254);
                    match(COLON);
                }
                break;
                case BRACKET_OPEN:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(255);
                    match(BRACKET_OPEN);
                }
                break;
                case UNDERSCORE:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(256);
                    match(UNDERSCORE);
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
    public static class Class_escapeContext extends ParserRuleContext {
        public Decimal_escapeContext decimal_escape() {
            return getRuleContext(Decimal_escapeContext.class, 0);
        }

        public TerminalNode CH_b() {
            return getToken(SkadiRegexParser.CH_b, 0);
        }

        public Character_class_escapeContext character_class_escape() {
            return getRuleContext(Character_class_escapeContext.class, 0);
        }

        public Character_escapeContext character_escape() {
            return getRuleContext(Character_escapeContext.class, 0);
        }

        public Class_escapeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class_escape;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterClass_escape(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitClass_escape(this);
        }
    }

    public final Class_escapeContext class_escape() throws RecognitionException {
        Class_escapeContext _localctx = new Class_escapeContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_class_escape);
        try {
            setState(263);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(259);
                    decimal_escape();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(260);
                    match(CH_b);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(261);
                    character_class_escape();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(262);
                    character_escape();
                }
                break;
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
    public static class Rule_referenceContext extends ParserRuleContext {
        public TerminalNode CURLY_OPEN() {
            return getToken(SkadiRegexParser.CURLY_OPEN, 0);
        }

        public Rule_nameContext rule_name() {
            return getRuleContext(Rule_nameContext.class, 0);
        }

        public TerminalNode CURLY_CLOSED() {
            return getToken(SkadiRegexParser.CURLY_CLOSED, 0);
        }

        public Rule_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rule_reference;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterRule_reference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitRule_reference(this);
        }
    }

    public final Rule_referenceContext rule_reference() throws RecognitionException {
        Rule_referenceContext _localctx = new Rule_referenceContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_rule_reference);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(265);
                match(CURLY_OPEN);
                setState(266);
                rule_name();
                setState(267);
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
    public static class Rule_nameContext extends ParserRuleContext {
        public List<TerminalNode> UNDERSCORE() {
            return getTokens(SkadiRegexParser.UNDERSCORE);
        }

        public TerminalNode UNDERSCORE(int i) {
            return getToken(SkadiRegexParser.UNDERSCORE, i);
        }

        public List<CharContext> char_() {
            return getRuleContexts(CharContext.class);
        }

        public CharContext char_(int i) {
            return getRuleContext(CharContext.class, i);
        }

        public List<DigitContext> digit() {
            return getRuleContexts(DigitContext.class);
        }

        public DigitContext digit(int i) {
            return getRuleContext(DigitContext.class, i);
        }

        public List<TerminalNode> DASH() {
            return getTokens(SkadiRegexParser.DASH);
        }

        public TerminalNode DASH(int i) {
            return getToken(SkadiRegexParser.DASH, i);
        }

        public Rule_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rule_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterRule_name(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitRule_name(this);
        }
    }

    public final Rule_nameContext rule_name() throws RecognitionException {
        Rule_nameContext _localctx = new Rule_nameContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_rule_name);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case UNDERSCORE: {
                        setState(269);
                        match(UNDERSCORE);
                    }
                    break;
                    case CH_a:
                    case CH_b:
                    case CH_c:
                    case CH_d:
                    case CH_e:
                    case CH_f:
                    case CH_n:
                    case CH_r:
                    case CH_s:
                    case CH_t:
                    case CH_v:
                    case CH_w:
                    case CH_x:
                    case CH_A:
                    case CH_B:
                    case CH_C:
                    case CH_D:
                    case CH_E:
                    case CH_F:
                    case CH_S:
                    case CH_W:
                    case CHAR: {
                        setState(270);
                        char_();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(279);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4404505739262L) != 0)) {
                    {
                        setState(277);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case CH_a:
                            case CH_b:
                            case CH_c:
                            case CH_d:
                            case CH_e:
                            case CH_f:
                            case CH_n:
                            case CH_r:
                            case CH_s:
                            case CH_t:
                            case CH_v:
                            case CH_w:
                            case CH_x:
                            case CH_A:
                            case CH_B:
                            case CH_C:
                            case CH_D:
                            case CH_E:
                            case CH_F:
                            case CH_S:
                            case CH_W:
                            case CHAR: {
                                setState(273);
                                char_();
                            }
                            break;
                            case ZERO:
                            case NON_ZERO_DIGIT: {
                                setState(274);
                                digit();
                            }
                            break;
                            case UNDERSCORE: {
                                setState(275);
                                match(UNDERSCORE);
                            }
                            break;
                            case DASH: {
                                setState(276);
                                match(DASH);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(281);
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

    @SuppressWarnings("CheckReturnValue")
    public static class Pattern_charContext extends ParserRuleContext {
        public DigitContext digit() {
            return getRuleContext(DigitContext.class, 0);
        }

        public CharContext char_() {
            return getRuleContext(CharContext.class, 0);
        }

        public TerminalNode PATTERN_CHAR() {
            return getToken(SkadiRegexParser.PATTERN_CHAR, 0);
        }

        public TerminalNode COMMA() {
            return getToken(SkadiRegexParser.COMMA, 0);
        }

        public TerminalNode COLON() {
            return getToken(SkadiRegexParser.COLON, 0);
        }

        public Pattern_charContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pattern_char;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterPattern_char(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitPattern_char(this);
        }
    }

    public final Pattern_charContext pattern_char() throws RecognitionException {
        Pattern_charContext _localctx = new Pattern_charContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_pattern_char);
        try {
            setState(287);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ZERO:
                case NON_ZERO_DIGIT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(282);
                    digit();
                }
                break;
                case CH_a:
                case CH_b:
                case CH_c:
                case CH_d:
                case CH_e:
                case CH_f:
                case CH_n:
                case CH_r:
                case CH_s:
                case CH_t:
                case CH_v:
                case CH_w:
                case CH_x:
                case CH_A:
                case CH_B:
                case CH_C:
                case CH_D:
                case CH_E:
                case CH_F:
                case CH_S:
                case CH_W:
                case CHAR:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(283);
                    char_();
                }
                break;
                case PATTERN_CHAR:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(284);
                    match(PATTERN_CHAR);
                }
                break;
                case COMMA:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(285);
                    match(COMMA);
                }
                break;
                case COLON:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(286);
                    match(COLON);
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
    public static class DigitContext extends ParserRuleContext {
        public TerminalNode ZERO() {
            return getToken(SkadiRegexParser.ZERO, 0);
        }

        public TerminalNode NON_ZERO_DIGIT() {
            return getToken(SkadiRegexParser.NON_ZERO_DIGIT, 0);
        }

        public DigitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_digit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterDigit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitDigit(this);
        }
    }

    public final DigitContext digit() throws RecognitionException {
        DigitContext _localctx = new DigitContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_digit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(289);
                _la = _input.LA(1);
                if (!(_la == ZERO || _la == NON_ZERO_DIGIT)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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

    @SuppressWarnings("CheckReturnValue")
    public static class CharContext extends ParserRuleContext {
        public TerminalNode CH_a() {
            return getToken(SkadiRegexParser.CH_a, 0);
        }

        public TerminalNode CH_b() {
            return getToken(SkadiRegexParser.CH_b, 0);
        }

        public TerminalNode CH_c() {
            return getToken(SkadiRegexParser.CH_c, 0);
        }

        public TerminalNode CH_d() {
            return getToken(SkadiRegexParser.CH_d, 0);
        }

        public TerminalNode CH_e() {
            return getToken(SkadiRegexParser.CH_e, 0);
        }

        public TerminalNode CH_f() {
            return getToken(SkadiRegexParser.CH_f, 0);
        }

        public TerminalNode CH_n() {
            return getToken(SkadiRegexParser.CH_n, 0);
        }

        public TerminalNode CH_r() {
            return getToken(SkadiRegexParser.CH_r, 0);
        }

        public TerminalNode CH_s() {
            return getToken(SkadiRegexParser.CH_s, 0);
        }

        public TerminalNode CH_t() {
            return getToken(SkadiRegexParser.CH_t, 0);
        }

        public TerminalNode CH_v() {
            return getToken(SkadiRegexParser.CH_v, 0);
        }

        public TerminalNode CH_w() {
            return getToken(SkadiRegexParser.CH_w, 0);
        }

        public TerminalNode CH_x() {
            return getToken(SkadiRegexParser.CH_x, 0);
        }

        public TerminalNode CH_A() {
            return getToken(SkadiRegexParser.CH_A, 0);
        }

        public TerminalNode CH_B() {
            return getToken(SkadiRegexParser.CH_B, 0);
        }

        public TerminalNode CH_C() {
            return getToken(SkadiRegexParser.CH_C, 0);
        }

        public TerminalNode CH_D() {
            return getToken(SkadiRegexParser.CH_D, 0);
        }

        public TerminalNode CH_E() {
            return getToken(SkadiRegexParser.CH_E, 0);
        }

        public TerminalNode CH_F() {
            return getToken(SkadiRegexParser.CH_F, 0);
        }

        public TerminalNode CH_S() {
            return getToken(SkadiRegexParser.CH_S, 0);
        }

        public TerminalNode CH_W() {
            return getToken(SkadiRegexParser.CH_W, 0);
        }

        public TerminalNode CHAR() {
            return getToken(SkadiRegexParser.CHAR, 0);
        }

        public CharContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_char;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).enterChar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof SkadiRegexListener) ((SkadiRegexListener) listener).exitChar(this);
        }
    }

    public final CharContext char_() throws RecognitionException {
        CharContext _localctx = new CharContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_char);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(291);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398050705406L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
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
            "\u0004\u0001+\u0126\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
                    "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
                    "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
                    "\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b" +
                    "\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000" +
                    ">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0005\u0001H\b\u0001\n\u0001\f\u0001K\t\u0001" +
                    "\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002Q\t\u0002\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003X\b\u0003" +
                    "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0003\u0004`\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006i\b\u0006\u000b\u0006" +
                    "\f\u0006j\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006" +
                    "q\b\u0006\u000b\u0006\f\u0006r\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0004\u0006z\b\u0006\u000b\u0006\f\u0006{\u0001\u0006" +
                    "\u0001\u0006\u0004\u0006\u0080\b\u0006\u000b\u0006\f\u0006\u0081\u0001" +
                    "\u0006\u0001\u0006\u0003\u0006\u0086\b\u0006\u0001\u0007\u0001\u0007\u0001" +
                    "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003" +
                    "\u0007\u0090\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003" +
                    "\u0007\u0096\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u009b\b\b\u0001\t" +
                    "\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a2\b\t\u0001\n\u0001\n\u0001" +
                    "\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00ad" +
                    "\b\r\n\r\f\r\u00b0\t\r\u0003\r\u00b2\b\r\u0001\u000e\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001" +
                    "\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001" +
                    "\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c5\b\u000f\u0001\u0010\u0001" +
                    "\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00cb\b\u0011\u0001\u0011\u0001" +
                    "\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00d2\b\u0012\u0001" +
                    "\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001" +
                    "\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00dd\b\u0013\u0001\u0014\u0001" +
                    "\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001" +
                    "\u0014\u0001\u0014\u0003\u0014\u00e8\b\u0014\u0001\u0015\u0001\u0015\u0003" +
                    "\u0015\u00ec\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001" +
                    "\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001" +
                    "\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001" +
                    "\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0102\b\u0016\u0001" +
                    "\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0108\b\u0017\u0001" +
                    "\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003" +
                    "\u0019\u0110\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005" +
                    "\u0019\u0116\b\u0019\n\u0019\f\u0019\u0119\t\u0019\u0001\u001a\u0001\u001a" +
                    "\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0120\b\u001a\u0001\u001b" +
                    "\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0000" +
                    "\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c" +
                    "\u001e \"$&(*,.02468\u0000\u0004\u0002\u0000\u0006\b\n\u000b\u0001\u0000" +
                    "\u0016\u0017\u0005\u0000\u0004\u0004\t\t\f\f\u0011\u0011\u0014\u0015\u0002" +
                    "\u0000\u0001\u0015**\u0157\u0000:\u0001\u0000\u0000\u0000\u0002D\u0001" +
                    "\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000" +
                    "\u0000\b_\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\f\u0085\u0001" +
                    "\u0000\u0000\u0000\u000e\u0095\u0001\u0000\u0000\u0000\u0010\u009a\u0001" +
                    "\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00a3\u0001" +
                    "\u0000\u0000\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00a7\u0001" +
                    "\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00b3\u0001" +
                    "\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000" +
                    "\u0000\u0000\"\u00c8\u0001\u0000\u0000\u0000$\u00d1\u0001\u0000\u0000" +
                    "\u0000&\u00dc\u0001\u0000\u0000\u0000(\u00e7\u0001\u0000\u0000\u0000*" +
                    "\u00eb\u0001\u0000\u0000\u0000,\u0101\u0001\u0000\u0000\u0000.\u0107\u0001" +
                    "\u0000\u0000\u00000\u0109\u0001\u0000\u0000\u00002\u010f\u0001\u0000\u0000" +
                    "\u00004\u011f\u0001\u0000\u0000\u00006\u0121\u0001\u0000\u0000\u00008" +
                    "\u0123\u0001\u0000\u0000\u0000:?\u0003\u0004\u0002\u0000;<\u0005)\u0000" +
                    "\u0000<>\u0003\u0004\u0002\u0000=;\u0001\u0000\u0000\u0000>A\u0001\u0000" +
                    "\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001" +
                    "\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005\u0000\u0000\u0001" +
                    "C\u0001\u0001\u0000\u0000\u0000DI\u0003\u0004\u0002\u0000EF\u0005)\u0000" +
                    "\u0000FH\u0003\u0004\u0002\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000" +
                    "\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0003" +
                    "\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0003\u0006\u0003" +
                    "\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000" +
                    "\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000" +
                    "QO\u0001\u0000\u0000\u0000RX\u0003\u000e\u0007\u0000ST\u0003\u000e\u0007" +
                    "\u0000TU\u0003\n\u0005\u0000UX\u0001\u0000\u0000\u0000VX\u0003\b\u0004" +
                    "\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000WV\u0001\u0000" +
                    "\u0000\u0000X\u0007\u0001\u0000\u0000\u0000Y`\u0005\u001e\u0000\u0000" +
                    "Z`\u0005%\u0000\u0000[\\\u0005\"\u0000\u0000\\`\u0005\u0002\u0000\u0000" +
                    "]^\u0005\"\u0000\u0000^`\u0005\u000f\u0000\u0000_Y\u0001\u0000\u0000\u0000" +
                    "_Z\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000" +
                    "\u0000`\t\u0001\u0000\u0000\u0000ab\u0003\f\u0006\u0000b\u000b\u0001\u0000" +
                    "\u0000\u0000c\u0086\u0005!\u0000\u0000d\u0086\u0005&\u0000\u0000e\u0086" +
                    "\u0005(\u0000\u0000fh\u0005\u001a\u0000\u0000gi\u00036\u001b\u0000hg\u0001" +
                    "\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000" +
                    "jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005\u001b\u0000" +
                    "\u0000m\u0086\u0001\u0000\u0000\u0000np\u0005\u001a\u0000\u0000oq\u0003" +
                    "6\u001b\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001" +
                    "\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000" +
                    "tu\u0005$\u0000\u0000uv\u0005\u001b\u0000\u0000v\u0086\u0001\u0000\u0000" +
                    "\u0000wy\u0005\u001a\u0000\u0000xz\u00036\u001b\u0000yx\u0001\u0000\u0000" +
                    "\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000" +
                    "\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0005$\u0000\u0000~\u0080" +
                    "\u00036\u001b\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000" +
                    "\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000" +
                    "\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u001b" +
                    "\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085c\u0001\u0000\u0000" +
                    "\u0000\u0085d\u0001\u0000\u0000\u0000\u0085e\u0001\u0000\u0000\u0000\u0085" +
                    "f\u0001\u0000\u0000\u0000\u0085n\u0001\u0000\u0000\u0000\u0085w\u0001" +
                    "\u0000\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000\u0087\u0096\u00034" +
                    "\u001a\u0000\u0088\u0096\u0005#\u0000\u0000\u0089\u008a\u0005\"\u0000" +
                    "\u0000\u008a\u0096\u0003\u0010\b\u0000\u008b\u0096\u0003\"\u0011\u0000" +
                    "\u008c\u008f\u0005\u0018\u0000\u0000\u008d\u008e\u0005(\u0000\u0000\u008e" +
                    "\u0090\u0005\'\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090" +
                    "\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092" +
                    "\u0003\u0002\u0001\u0000\u0092\u0093\u0005\u0019\u0000\u0000\u0093\u0096" +
                    "\u0001\u0000\u0000\u0000\u0094\u0096\u00030\u0018\u0000\u0095\u0087\u0001" +
                    "\u0000\u0000\u0000\u0095\u0088\u0001\u0000\u0000\u0000\u0095\u0089\u0001" +
                    "\u0000\u0000\u0000\u0095\u008b\u0001\u0000\u0000\u0000\u0095\u008c\u0001" +
                    "\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u000f\u0001" +
                    "\u0000\u0000\u0000\u0097\u009b\u0003\u001a\r\u0000\u0098\u009b\u0003 " +
                    "\u0010\u0000\u0099\u009b\u0003\u0012\t\u0000\u009a\u0097\u0001\u0000\u0000" +
                    "\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000" +
                    "\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c\u00a2\u0003\u0014\n\u0000" +
                    "\u009d\u009e\u0005\u0003\u0000\u0000\u009e\u00a2\u0003\u0016\u000b\u0000" +
                    "\u009f\u00a2\u0003\u001c\u000e\u0000\u00a0\u00a2\u0003\u0018\f\u0000\u00a1" +
                    "\u009c\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1" +
                    "\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2" +
                    "\u0013\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u0000\u0000\u0000\u00a4" +
                    "\u0015\u0001\u0000\u0000\u0000\u00a5\u00a6\u00038\u001c\u0000\u00a6\u0017" +
                    "\u0001\u0000\u0000\u0000\u00a7\u00a8\t\u0000\u0000\u0000\u00a8\u0019\u0001" +
                    "\u0000\u0000\u0000\u00a9\u00b2\u0005\u0016\u0000\u0000\u00aa\u00ae\u0005" +
                    "\u0017\u0000\u0000\u00ab\u00ad\u0007\u0001\u0000\u0000\u00ac\u00ab\u0001" +
                    "\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001" +
                    "\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b2\u0001" +
                    "\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001" +
                    "\u0000\u0000\u0000\u00b1\u00aa\u0001\u0000\u0000\u0000\u00b2\u001b\u0001" +
                    "\u0000\u0000\u0000\u00b3\u00b4\u0005\r\u0000\u0000\u00b4\u00b5\u0003\u001e" +
                    "\u000f\u0000\u00b5\u00b6\u0003\u001e\u000f\u0000\u00b6\u001d\u0001\u0000" +
                    "\u0000\u0000\u00b7\u00c5\u00036\u001b\u0000\u00b8\u00c5\u0005\u0001\u0000" +
                    "\u0000\u00b9\u00c5\u0005\u0002\u0000\u0000\u00ba\u00c5\u0005\u0003\u0000" +
                    "\u0000\u00bb\u00c5\u0005\u0004\u0000\u0000\u00bc\u00c5\u0005\u0005\u0000" +
                    "\u0000\u00bd\u00c5\u0005\u0006\u0000\u0000\u00be\u00c5\u0005\u000e\u0000" +
                    "\u0000\u00bf\u00c5\u0005\u000f\u0000\u0000\u00c0\u00c5\u0005\u0010\u0000" +
                    "\u0000\u00c1\u00c5\u0005\u0011\u0000\u0000\u00c2\u00c5\u0005\u0012\u0000" +
                    "\u0000\u00c3\u00c5\u0005\u0013\u0000\u0000\u00c4\u00b7\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00b8\u0001\u0000\u0000\u0000\u00c4\u00b9\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00ba\u0001\u0000\u0000\u0000\u00c4\u00bb\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c4\u00bd\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00be\u0001\u0000\u0000\u0000\u00c4\u00bf\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000" +
                    "\u0000\u00c5\u001f\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007\u0002\u0000" +
                    "\u0000\u00c7!\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\u001c\u0000\u0000" +
                    "\u00c9\u00cb\u0005\u001e\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000" +
                    "\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000" +
                    "\u00cc\u00cd\u0003$\u0012\u0000\u00cd\u00ce\u0005\u001d\u0000\u0000\u00ce" +
                    "#\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00d2" +
                    "\u0003&\u0013\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001" +
                    "\u0000\u0000\u0000\u00d2%\u0001\u0000\u0000\u0000\u00d3\u00dd\u0003*\u0015" +
                    "\u0000\u00d4\u00d5\u0003*\u0015\u0000\u00d5\u00d6\u0003(\u0014\u0000\u00d6" +
                    "\u00dd\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003*\u0015\u0000\u00d8\u00d9" +
                    "\u0005\u001f\u0000\u0000\u00d9\u00da\u0003*\u0015\u0000\u00da\u00db\u0003" +
                    "$\u0012\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00d3\u0001\u0000" +
                    "\u0000\u0000\u00dc\u00d4\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000" +
                    "\u0000\u0000\u00dd\'\u0001\u0000\u0000\u0000\u00de\u00e8\u0003*\u0015" +
                    "\u0000\u00df\u00e0\u0003,\u0016\u0000\u00e0\u00e1\u0003(\u0014\u0000\u00e1" +
                    "\u00e8\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003,\u0016\u0000\u00e3\u00e4" +
                    "\u0005\u001f\u0000\u0000\u00e4\u00e5\u0003*\u0015\u0000\u00e5\u00e6\u0003" +
                    "$\u0012\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00de\u0001\u0000" +
                    "\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000" +
                    "\u0000\u0000\u00e8)\u0001\u0000\u0000\u0000\u00e9\u00ec\u0005\u001f\u0000" +
                    "\u0000\u00ea\u00ec\u0003,\u0016\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000" +
                    "\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec+\u0001\u0000\u0000\u0000\u00ed" +
                    "\u00ee\u0005\"\u0000\u0000\u00ee\u0102\u0003.\u0017\u0000\u00ef\u0102" +
                    "\u00036\u001b\u0000\u00f0\u0102\u00038\u001c\u0000\u00f1\u0102\u0005+" +
                    "\u0000\u0000\u00f2\u0102\u0005$\u0000\u0000\u00f3\u0102\u0005\u001e\u0000" +
                    "\u0000\u00f4\u0102\u0005)\u0000\u0000\u00f5\u0102\u0005%\u0000\u0000\u00f6" +
                    "\u0102\u0005!\u0000\u0000\u00f7\u0102\u0005&\u0000\u0000\u00f8\u0102\u0005" +
                    "#\u0000\u0000\u00f9\u0102\u0005(\u0000\u0000\u00fa\u0102\u0005\u0018\u0000" +
                    "\u0000\u00fb\u0102\u0005\u0019\u0000\u0000\u00fc\u0102\u0005\u001a\u0000" +
                    "\u0000\u00fd\u0102\u0005\u001b\u0000\u0000\u00fe\u0102\u0005\'\u0000\u0000" +
                    "\u00ff\u0102\u0005\u001c\u0000\u0000\u0100\u0102\u0005 \u0000\u0000\u0101" +
                    "\u00ed\u0001\u0000\u0000\u0000\u0101\u00ef\u0001\u0000\u0000\u0000\u0101" +
                    "\u00f0\u0001\u0000\u0000\u0000\u0101\u00f1\u0001\u0000\u0000\u0000\u0101" +
                    "\u00f2\u0001\u0000\u0000\u0000\u0101\u00f3\u0001\u0000\u0000\u0000\u0101" +
                    "\u00f4\u0001\u0000\u0000\u0000\u0101\u00f5\u0001\u0000\u0000\u0000\u0101" +
                    "\u00f6\u0001\u0000\u0000\u0000\u0101\u00f7\u0001\u0000\u0000\u0000\u0101" +
                    "\u00f8\u0001\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0101" +
                    "\u00fa\u0001\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000\u0000\u0101" +
                    "\u00fc\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0101" +
                    "\u00fe\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101" +
                    "\u0100\u0001\u0000\u0000\u0000\u0102-\u0001\u0000\u0000\u0000\u0103\u0108" +
                    "\u0003\u001a\r\u0000\u0104\u0108\u0005\u0002\u0000\u0000\u0105\u0108\u0003" +
                    " \u0010\u0000\u0106\u0108\u0003\u0012\t\u0000\u0107\u0103\u0001\u0000" +
                    "\u0000\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000" +
                    "\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108/\u0001\u0000\u0000" +
                    "\u0000\u0109\u010a\u0005\u001a\u0000\u0000\u010a\u010b\u00032\u0019\u0000" +
                    "\u010b\u010c\u0005\u001b\u0000\u0000\u010c1\u0001\u0000\u0000\u0000\u010d" +
                    "\u0110\u0005 \u0000\u0000\u010e\u0110\u00038\u001c\u0000\u010f\u010d\u0001" +
                    "\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0117\u0001" +
                    "\u0000\u0000\u0000\u0111\u0116\u00038\u001c\u0000\u0112\u0116\u00036\u001b" +
                    "\u0000\u0113\u0116\u0005 \u0000\u0000\u0114\u0116\u0005\u001f\u0000\u0000" +
                    "\u0115\u0111\u0001\u0000\u0000\u0000\u0115\u0112\u0001\u0000\u0000\u0000" +
                    "\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000" +
                    "\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000" +
                    "\u0117\u0118\u0001\u0000\u0000\u0000\u01183\u0001\u0000\u0000\u0000\u0119" +
                    "\u0117\u0001\u0000\u0000\u0000\u011a\u0120\u00036\u001b\u0000\u011b\u0120" +
                    "\u00038\u001c\u0000\u011c\u0120\u0005+\u0000\u0000\u011d\u0120\u0005$" +
                    "\u0000\u0000\u011e\u0120\u0005\'\u0000\u0000\u011f\u011a\u0001\u0000\u0000" +
                    "\u0000\u011f\u011b\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000" +
                    "\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000" +
                    "\u0000\u01205\u0001\u0000\u0000\u0000\u0121\u0122\u0007\u0001\u0000\u0000" +
                    "\u01227\u0001\u0000\u0000\u0000\u0123\u0124\u0007\u0003\u0000\u0000\u0124" +
                    "9\u0001\u0000\u0000\u0000\u001c?IOW_jr{\u0081\u0085\u008f\u0095\u009a" +
                    "\u00a1\u00ae\u00b1\u00c4\u00ca\u00d1\u00dc\u00e7\u00eb\u0101\u0107\u010f" +
                    "\u0115\u0117\u011f";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}