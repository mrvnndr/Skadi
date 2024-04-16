package de.mrvnndr.skadi.analysis.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SkadiRegexLexer extends Lexer {
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
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "CH_a", "CH_b", "CH_c", "CH_d", "CH_e", "CH_f", "CH_n", "CH_r", "CH_s",
                "CH_t", "CH_v", "CH_w", "CH_x", "CH_A", "CH_B", "CH_C", "CH_D", "CH_E",
                "CH_F", "CH_S", "CH_W", "ZERO", "NON_ZERO_DIGIT", "PAREN_OPEN", "PAREN_CLOSED",
                "CURLY_OPEN", "CURLY_CLOSED", "BRACKET_OPEN", "BRACKET_CLOSED", "CIRCUMFLEX",
                "DASH", "UNDERSCORE", "STAR", "BACKSLASH", "PERIOD", "COMMA", "DOLLAR",
                "PLUS", "COLON", "QUESTION_MARK", "VERT_BAR", "CHAR", "PATTERN_CHAR"
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


    public SkadiRegexLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\u0004\u0000+\u00ad\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
                    "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002" +
                    "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002" +
                    "\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002" +
                    "\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002" +
                    "\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002" +
                    "\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007" +
                    "!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007" +
                    "&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000" +
                    "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003" +
                    "\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006" +
                    "\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001" +
                    "\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001" +
                    "\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001" +
                    "\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001" +
                    "\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001" +
                    "\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001" +
                    "\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001" +
                    "\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001" +
                    " \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001" +
                    "%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001" +
                    "*\u0001*\u0000\u0000+\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004" +
                    "\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017" +
                    "\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'" +
                    "\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d" +
                    ";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+\u0001\u0000\u0003\u0001\u0000" +
                    "19\u0002\u0000AZaz\u0006\u0000$$(+..??[^{}\u00ac\u0000\u0001\u0001\u0000" +
                    "\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000" +
                    "\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000" +
                    "\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000" +
                    "\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000" +
                    "\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000" +
                    "\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000" +
                    "\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000" +
                    "\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000" +
                    "#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001" +
                    "\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000" +
                    "\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000" +
                    "1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001" +
                    "\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000" +
                    "\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000" +
                    "?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001" +
                    "\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000" +
                    "\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000" +
                    "M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001" +
                    "\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000" +
                    "\u0000\u0001W\u0001\u0000\u0000\u0000\u0003Y\u0001\u0000\u0000\u0000\u0005" +
                    "[\u0001\u0000\u0000\u0000\u0007]\u0001\u0000\u0000\u0000\t_\u0001\u0000" +
                    "\u0000\u0000\u000ba\u0001\u0000\u0000\u0000\rc\u0001\u0000\u0000\u0000" +
                    "\u000fe\u0001\u0000\u0000\u0000\u0011g\u0001\u0000\u0000\u0000\u0013i" +
                    "\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017m\u0001\u0000" +
                    "\u0000\u0000\u0019o\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000" +
                    "\u001ds\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000!w\u0001" +
                    "\u0000\u0000\u0000#y\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000\u0000" +
                    "\'}\u0001\u0000\u0000\u0000)\u007f\u0001\u0000\u0000\u0000+\u0081\u0001" +
                    "\u0000\u0000\u0000-\u0083\u0001\u0000\u0000\u0000/\u0085\u0001\u0000\u0000" +
                    "\u00001\u0087\u0001\u0000\u0000\u00003\u0089\u0001\u0000\u0000\u00005" +
                    "\u008b\u0001\u0000\u0000\u00007\u008d\u0001\u0000\u0000\u00009\u008f\u0001" +
                    "\u0000\u0000\u0000;\u0091\u0001\u0000\u0000\u0000=\u0093\u0001\u0000\u0000" +
                    "\u0000?\u0095\u0001\u0000\u0000\u0000A\u0097\u0001\u0000\u0000\u0000C" +
                    "\u0099\u0001\u0000\u0000\u0000E\u009b\u0001\u0000\u0000\u0000G\u009d\u0001" +
                    "\u0000\u0000\u0000I\u009f\u0001\u0000\u0000\u0000K\u00a1\u0001\u0000\u0000" +
                    "\u0000M\u00a3\u0001\u0000\u0000\u0000O\u00a5\u0001\u0000\u0000\u0000Q" +
                    "\u00a7\u0001\u0000\u0000\u0000S\u00a9\u0001\u0000\u0000\u0000U\u00ab\u0001" +
                    "\u0000\u0000\u0000WX\u0005a\u0000\u0000X\u0002\u0001\u0000\u0000\u0000" +
                    "YZ\u0005b\u0000\u0000Z\u0004\u0001\u0000\u0000\u0000[\\\u0005c\u0000\u0000" +
                    "\\\u0006\u0001\u0000\u0000\u0000]^\u0005d\u0000\u0000^\b\u0001\u0000\u0000" +
                    "\u0000_`\u0005e\u0000\u0000`\n\u0001\u0000\u0000\u0000ab\u0005f\u0000" +
                    "\u0000b\f\u0001\u0000\u0000\u0000cd\u0005n\u0000\u0000d\u000e\u0001\u0000" +
                    "\u0000\u0000ef\u0005r\u0000\u0000f\u0010\u0001\u0000\u0000\u0000gh\u0005" +
                    "s\u0000\u0000h\u0012\u0001\u0000\u0000\u0000ij\u0005t\u0000\u0000j\u0014" +
                    "\u0001\u0000\u0000\u0000kl\u0005v\u0000\u0000l\u0016\u0001\u0000\u0000" +
                    "\u0000mn\u0005w\u0000\u0000n\u0018\u0001\u0000\u0000\u0000op\u0005x\u0000" +
                    "\u0000p\u001a\u0001\u0000\u0000\u0000qr\u0005A\u0000\u0000r\u001c\u0001" +
                    "\u0000\u0000\u0000st\u0005B\u0000\u0000t\u001e\u0001\u0000\u0000\u0000" +
                    "uv\u0005C\u0000\u0000v \u0001\u0000\u0000\u0000wx\u0005D\u0000\u0000x" +
                    "\"\u0001\u0000\u0000\u0000yz\u0005E\u0000\u0000z$\u0001\u0000\u0000\u0000" +
                    "{|\u0005F\u0000\u0000|&\u0001\u0000\u0000\u0000}~\u0005S\u0000\u0000~" +
                    "(\u0001\u0000\u0000\u0000\u007f\u0080\u0005W\u0000\u0000\u0080*\u0001" +
                    "\u0000\u0000\u0000\u0081\u0082\u00050\u0000\u0000\u0082,\u0001\u0000\u0000" +
                    "\u0000\u0083\u0084\u0007\u0000\u0000\u0000\u0084.\u0001\u0000\u0000\u0000" +
                    "\u0085\u0086\u0005(\u0000\u0000\u00860\u0001\u0000\u0000\u0000\u0087\u0088" +
                    "\u0005)\u0000\u0000\u00882\u0001\u0000\u0000\u0000\u0089\u008a\u0005{" +
                    "\u0000\u0000\u008a4\u0001\u0000\u0000\u0000\u008b\u008c\u0005}\u0000\u0000" +
                    "\u008c6\u0001\u0000\u0000\u0000\u008d\u008e\u0005[\u0000\u0000\u008e8" +
                    "\u0001\u0000\u0000\u0000\u008f\u0090\u0005]\u0000\u0000\u0090:\u0001\u0000" +
                    "\u0000\u0000\u0091\u0092\u0005^\u0000\u0000\u0092<\u0001\u0000\u0000\u0000" +
                    "\u0093\u0094\u0005-\u0000\u0000\u0094>\u0001\u0000\u0000\u0000\u0095\u0096" +
                    "\u0005_\u0000\u0000\u0096@\u0001\u0000\u0000\u0000\u0097\u0098\u0005*" +
                    "\u0000\u0000\u0098B\u0001\u0000\u0000\u0000\u0099\u009a\u0005\\\u0000" +
                    "\u0000\u009aD\u0001\u0000\u0000\u0000\u009b\u009c\u0005.\u0000\u0000\u009c" +
                    "F\u0001\u0000\u0000\u0000\u009d\u009e\u0005,\u0000\u0000\u009eH\u0001" +
                    "\u0000\u0000\u0000\u009f\u00a0\u0005$\u0000\u0000\u00a0J\u0001\u0000\u0000" +
                    "\u0000\u00a1\u00a2\u0005+\u0000\u0000\u00a2L\u0001\u0000\u0000\u0000\u00a3" +
                    "\u00a4\u0005:\u0000\u0000\u00a4N\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005" +
                    "?\u0000\u0000\u00a6P\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005|\u0000" +
                    "\u0000\u00a8R\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0001\u0000\u0000" +
                    "\u00aaT\u0001\u0000\u0000\u0000\u00ab\u00ac\b\u0002\u0000\u0000\u00ac" +
                    "V\u0001\u0000\u0000\u0000\u0001\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}