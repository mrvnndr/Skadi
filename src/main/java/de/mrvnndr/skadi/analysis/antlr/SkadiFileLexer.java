package de.mrvnndr.skadi.analysis.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SkadiFileLexer extends Lexer {
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
            CODE = 1, NESTED_CURLY_CODE = 2;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE", "CODE", "NESTED_CURLY_CODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "REGEX", "COPY", "FRAGMENT", "AUTOMATON", "ENTER", "PROGRESS", "FINISH",
                "EMBED", "EMBEDDING", "AT", "IN", "CURLY_OPEN", "PAREN_OPEN", "PAREN_CLOSE",
                "EQUAL", "PERIOD", "COMMA", "COLON", "ID", "WS", "CODE_COMMENT", "CODE_BLOCK_COMMENT",
                "CODE_STRING", "CODE_CURLY", "CODE_END", "CODE_ACTION_CODE", "CODE_SINGLE_CHAR",
                "NC_COMMENT", "NC_BLOCK_COMMENT", "NC_STRING", "NC_NEW", "NC_END", "NC_ACTION_CODE",
                "NC_SINGLE_CHAR", "LINEBREAK", "VHDL_COMMENT", "C_COMMENT", "WS_NO_BREAK",
                "BASIC_STRING", "STRING"
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


    public SkadiFileLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "SkadiFileLexer.g4";
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
            "\u0004\u0000\u0017\u013c\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff" +
                    "\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007" +
                    "\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007" +
                    "\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b" +
                    "\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007" +
                    "\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002" +
                    "\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002" +
                    "\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002" +
                    "\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002" +
                    "\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002" +
                    "\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002" +
                    "\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002#" +
                    "\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001" +
                    "\u0000\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000Y\t\u0000\u0001" +
                    "\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000`\t\u0000\u0001" +
                    "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b" +
                    "\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001" +
                    "\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001" +
                    "\u0011\u0001\u0012\u0004\u0012\u00b9\b\u0012\u000b\u0012\f\u0012\u00ba" +
                    "\u0001\u0013\u0004\u0013\u00be\b\u0013\u000b\u0013\f\u0013\u00bf\u0001" +
                    "\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001" +
                    "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001" +
                    "\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001" +
                    "\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001" +
                    "\u0019\u0004\u0019\u00db\b\u0019\u000b\u0019\f\u0019\u00dc\u0001\u0019" +
                    "\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b" +
                    "\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c" +
                    "\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e" +
                    "\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f" +
                    "\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0004 \u00fc\b \u000b \f " +
                    "\u00fd\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001" +
                    "\"\u0003\"\u0109\b\"\u0001#\u0001#\u0001#\u0001#\u0005#\u010f\b#\n#\f" +
                    "#\u0112\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u011a\b$\n" +
                    "$\f$\u011d\t$\u0001$\u0001$\u0001$\u0001%\u0004%\u0123\b%\u000b%\f%\u0124" +
                    "\u0001&\u0001&\u0005&\u0129\b&\n&\f&\u012c\t&\u0001&\u0001&\u0001\'\u0001" +
                    "\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0138\b\'\n" +
                    "\'\f\'\u013b\t\'\u0004W\u0110\u011b\u012a\u0000(\u0003\u0003\u0005\u0004" +
                    "\u0007\u0005\t\u0006\u000b\u0007\r\b\u000f\t\u0011\n\u0013\u000b\u0015" +
                    "\f\u0017\r\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011!\u0012#\u0013" +
                    "%\u0014\'\u0015)\u0016+\u0000-\u0000/\u00001\u00003\u00175\u00007\u0000" +
                    "9\u0000;\u0000=\u0000?\u0000A\u0000C\u0000E\u0000G\u0000I\u0000K\u0000" +
                    "M\u0000O\u0000Q\u0000\u0003\u0000\u0001\u0002\u0006\u0002\u0000\n\n\r" +
                    "\r\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0005\u0000\"\"--//{{}}\u0002" +
                    "\u0000--//\u0002\u0000\t\t  \u013f\u0000\u0003\u0001\u0000\u0000\u0000" +
                    "\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000" +
                    "\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000" +
                    "\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011" +
                    "\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015" +
                    "\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019" +
                    "\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d" +
                    "\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001" +
                    "\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000" +
                    "\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000" +
                    "\u0001+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0001/" +
                    "\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00013\u0001\u0000" +
                    "\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000" +
                    "\u00029\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0002=" +
                    "\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0002A\u0001\u0000" +
                    "\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0002E\u0001\u0000\u0000\u0000" +
                    "\u0003S\u0001\u0000\u0000\u0000\u0005c\u0001\u0000\u0000\u0000\u0007h" +
                    "\u0001\u0000\u0000\u0000\tq\u0001\u0000\u0000\u0000\u000b{\u0001\u0000" +
                    "\u0000\u0000\r\u0081\u0001\u0000\u0000\u0000\u000f\u008a\u0001\u0000\u0000" +
                    "\u0000\u0011\u0091\u0001\u0000\u0000\u0000\u0013\u0097\u0001\u0000\u0000" +
                    "\u0000\u0015\u00a1\u0001\u0000\u0000\u0000\u0017\u00a4\u0001\u0000\u0000" +
                    "\u0000\u0019\u00a7\u0001\u0000\u0000\u0000\u001b\u00ab\u0001\u0000\u0000" +
                    "\u0000\u001d\u00ad\u0001\u0000\u0000\u0000\u001f\u00af\u0001\u0000\u0000" +
                    "\u0000!\u00b1\u0001\u0000\u0000\u0000#\u00b3\u0001\u0000\u0000\u0000%" +
                    "\u00b5\u0001\u0000\u0000\u0000\'\u00b8\u0001\u0000\u0000\u0000)\u00bd" +
                    "\u0001\u0000\u0000\u0000+\u00c3\u0001\u0000\u0000\u0000-\u00c7\u0001\u0000" +
                    "\u0000\u0000/\u00cb\u0001\u0000\u0000\u00001\u00cf\u0001\u0000\u0000\u0000" +
                    "3\u00d4\u0001\u0000\u0000\u00005\u00da\u0001\u0000\u0000\u00007\u00e0" +
                    "\u0001\u0000\u0000\u00009\u00e4\u0001\u0000\u0000\u0000;\u00e8\u0001\u0000" +
                    "\u0000\u0000=\u00ec\u0001\u0000\u0000\u0000?\u00f0\u0001\u0000\u0000\u0000" +
                    "A\u00f5\u0001\u0000\u0000\u0000C\u00fb\u0001\u0000\u0000\u0000E\u0101" +
                    "\u0001\u0000\u0000\u0000G\u0108\u0001\u0000\u0000\u0000I\u010a\u0001\u0000" +
                    "\u0000\u0000K\u0115\u0001\u0000\u0000\u0000M\u0122\u0001\u0000\u0000\u0000" +
                    "O\u0126\u0001\u0000\u0000\u0000Q\u012f\u0001\u0000\u0000\u0000SW\u0005" +
                    "\"\u0000\u0000TV\b\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001" +
                    "\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000" +
                    "XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z^\u0005\"\u0000\u0000" +
                    "[]\u0003M%\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000" +
                    "^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000" +
                    "\u0000`^\u0001\u0000\u0000\u0000ab\u0003G\"\u0000b\u0004\u0001\u0000\u0000" +
                    "\u0000cd\u0005c\u0000\u0000de\u0005o\u0000\u0000ef\u0005p\u0000\u0000" +
                    "fg\u0005y\u0000\u0000g\u0006\u0001\u0000\u0000\u0000hi\u0005f\u0000\u0000" +
                    "ij\u0005r\u0000\u0000jk\u0005a\u0000\u0000kl\u0005g\u0000\u0000lm\u0005" +
                    "m\u0000\u0000mn\u0005e\u0000\u0000no\u0005n\u0000\u0000op\u0005t\u0000" +
                    "\u0000p\b\u0001\u0000\u0000\u0000qr\u0005a\u0000\u0000rs\u0005u\u0000" +
                    "\u0000st\u0005t\u0000\u0000tu\u0005o\u0000\u0000uv\u0005m\u0000\u0000" +
                    "vw\u0005a\u0000\u0000wx\u0005t\u0000\u0000xy\u0005o\u0000\u0000yz\u0005" +
                    "n\u0000\u0000z\n\u0001\u0000\u0000\u0000{|\u0005e\u0000\u0000|}\u0005" +
                    "n\u0000\u0000}~\u0005t\u0000\u0000~\u007f\u0005e\u0000\u0000\u007f\u0080" +
                    "\u0005r\u0000\u0000\u0080\f\u0001\u0000\u0000\u0000\u0081\u0082\u0005" +
                    "p\u0000\u0000\u0082\u0083\u0005r\u0000\u0000\u0083\u0084\u0005o\u0000" +
                    "\u0000\u0084\u0085\u0005g\u0000\u0000\u0085\u0086\u0005r\u0000\u0000\u0086" +
                    "\u0087\u0005e\u0000\u0000\u0087\u0088\u0005s\u0000\u0000\u0088\u0089\u0005" +
                    "s\u0000\u0000\u0089\u000e\u0001\u0000\u0000\u0000\u008a\u008b\u0005f\u0000" +
                    "\u0000\u008b\u008c\u0005i\u0000\u0000\u008c\u008d\u0005n\u0000\u0000\u008d" +
                    "\u008e\u0005i\u0000\u0000\u008e\u008f\u0005s\u0000\u0000\u008f\u0090\u0005" +
                    "h\u0000\u0000\u0090\u0010\u0001\u0000\u0000\u0000\u0091\u0092\u0005e\u0000" +
                    "\u0000\u0092\u0093\u0005m\u0000\u0000\u0093\u0094\u0005b\u0000\u0000\u0094" +
                    "\u0095\u0005e\u0000\u0000\u0095\u0096\u0005d\u0000\u0000\u0096\u0012\u0001" +
                    "\u0000\u0000\u0000\u0097\u0098\u0005e\u0000\u0000\u0098\u0099\u0005m\u0000" +
                    "\u0000\u0099\u009a\u0005b\u0000\u0000\u009a\u009b\u0005e\u0000\u0000\u009b" +
                    "\u009c\u0005d\u0000\u0000\u009c\u009d\u0005d\u0000\u0000\u009d\u009e\u0005" +
                    "i\u0000\u0000\u009e\u009f\u0005n\u0000\u0000\u009f\u00a0\u0005g\u0000" +
                    "\u0000\u00a0\u0014\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000" +
                    "\u00a2\u00a3\u0005t\u0000\u0000\u00a3\u0016\u0001\u0000\u0000\u0000\u00a4" +
                    "\u00a5\u0005i\u0000\u0000\u00a5\u00a6\u0005n\u0000\u0000\u00a6\u0018\u0001" +
                    "\u0000\u0000\u0000\u00a7\u00a8\u0005{\u0000\u0000\u00a8\u00a9\u0001\u0000" +
                    "\u0000\u0000\u00a9\u00aa\u0006\u000b\u0000\u0000\u00aa\u001a\u0001\u0000" +
                    "\u0000\u0000\u00ab\u00ac\u0005(\u0000\u0000\u00ac\u001c\u0001\u0000\u0000" +
                    "\u0000\u00ad\u00ae\u0005)\u0000\u0000\u00ae\u001e\u0001\u0000\u0000\u0000" +
                    "\u00af\u00b0\u0005=\u0000\u0000\u00b0 \u0001\u0000\u0000\u0000\u00b1\u00b2" +
                    "\u0005.\u0000\u0000\u00b2\"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005" +
                    ",\u0000\u0000\u00b4$\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005:\u0000" +
                    "\u0000\u00b6&\u0001\u0000\u0000\u0000\u00b7\u00b9\u0007\u0001\u0000\u0000" +
                    "\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000" +
                    "\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000" +
                    "\u00bb(\u0001\u0000\u0000\u0000\u00bc\u00be\u0007\u0002\u0000\u0000\u00bd" +
                    "\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf" +
                    "\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0" +
                    "\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u0013\u0001\u0000\u00c2" +
                    "*\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003I#\u0000\u00c4\u00c5\u0001" +
                    "\u0000\u0000\u0000\u00c5\u00c6\u0006\u0014\u0002\u0000\u00c6,\u0001\u0000" +
                    "\u0000\u0000\u00c7\u00c8\u0003K$\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000" +
                    "\u00c9\u00ca\u0006\u0015\u0002\u0000\u00ca.\u0001\u0000\u0000\u0000\u00cb" +
                    "\u00cc\u0003Q\'\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce" +
                    "\u0006\u0016\u0002\u0000\u00ce0\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005" +
                    "{\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0006\u0017" +
                    "\u0002\u0000\u00d2\u00d3\u0006\u0017\u0003\u0000\u00d32\u0001\u0000\u0000" +
                    "\u0000\u00d4\u00d5\u0005}\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000" +
                    "\u00d6\u00d7\u0006\u0018\u0004\u0000\u00d7\u00d8\u0006\u0018\u0005\u0000" +
                    "\u00d84\u0001\u0000\u0000\u0000\u00d9\u00db\b\u0003\u0000\u0000\u00da" +
                    "\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc" +
                    "\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd" +
                    "\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0006\u0019\u0002\u0000\u00df" +
                    "6\u0001\u0000\u0000\u0000\u00e0\u00e1\u0007\u0004\u0000\u0000\u00e1\u00e2" +
                    "\u0001\u0000\u0000\u0000\u00e2\u00e3\u0006\u001a\u0002\u0000\u00e38\u0001" +
                    "\u0000\u0000\u0000\u00e4\u00e5\u0003I#\u0000\u00e5\u00e6\u0001\u0000\u0000" +
                    "\u0000\u00e6\u00e7\u0006\u001b\u0002\u0000\u00e7:\u0001\u0000\u0000\u0000" +
                    "\u00e8\u00e9\u0003K$\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb" +
                    "\u0006\u001c\u0002\u0000\u00eb<\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003" +
                    "Q\'\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0006\u001d" +
                    "\u0002\u0000\u00ef>\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005{\u0000\u0000" +
                    "\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0006\u001e\u0003\u0000" +
                    "\u00f3\u00f4\u0006\u001e\u0002\u0000\u00f4@\u0001\u0000\u0000\u0000\u00f5" +
                    "\u00f6\u0005}\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8" +
                    "\u0006\u001f\u0005\u0000\u00f8\u00f9\u0006\u001f\u0002\u0000\u00f9B\u0001" +
                    "\u0000\u0000\u0000\u00fa\u00fc\b\u0003\u0000\u0000\u00fb\u00fa\u0001\u0000" +
                    "\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000" +
                    "\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000" +
                    "\u0000\u0000\u00ff\u0100\u0006 \u0002\u0000\u0100D\u0001\u0000\u0000\u0000" +
                    "\u0101\u0102\u0007\u0004\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000" +
                    "\u0103\u0104\u0006!\u0002\u0000\u0104F\u0001\u0000\u0000\u0000\u0105\u0109" +
                    "\u0005\n\u0000\u0000\u0106\u0107\u0005\r\u0000\u0000\u0107\u0109\u0005" +
                    "\n\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000" +
                    "\u0000\u0000\u0109H\u0001\u0000\u0000\u0000\u010a\u010b\u0005-\u0000\u0000" +
                    "\u010b\u010c\u0005-\u0000\u0000\u010c\u0110\u0001\u0000\u0000\u0000\u010d" +
                    "\u010f\t\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112" +
                    "\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0110\u010e" +
                    "\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0110" +
                    "\u0001\u0000\u0000\u0000\u0113\u0114\u0003G\"\u0000\u0114J\u0001\u0000" +
                    "\u0000\u0000\u0115\u0116\u0005/\u0000\u0000\u0116\u0117\u0005*\u0000\u0000" +
                    "\u0117\u011b\u0001\u0000\u0000\u0000\u0118\u011a\t\u0000\u0000\u0000\u0119" +
                    "\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b" +
                    "\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c" +
                    "\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e" +
                    "\u011f\u0005*\u0000\u0000\u011f\u0120\u0005/\u0000\u0000\u0120L\u0001" +
                    "\u0000\u0000\u0000\u0121\u0123\u0007\u0005\u0000\u0000\u0122\u0121\u0001" +
                    "\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0122\u0001" +
                    "\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125N\u0001\u0000" +
                    "\u0000\u0000\u0126\u012a\u0005\"\u0000\u0000\u0127\u0129\t\u0000\u0000" +
                    "\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000" +
                    "\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000" +
                    "\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000" +
                    "\u0000\u012d\u012e\u0005\"\u0000\u0000\u012eP\u0001\u0000\u0000\u0000" +
                    "\u012f\u0139\u0003O&\u0000\u0130\u0131\u0003M%\u0000\u0131\u0132\u0005" +
                    "&\u0000\u0000\u0132\u0133\u0003M%\u0000\u0133\u0134\u0003G\"\u0000\u0134" +
                    "\u0135\u0003M%\u0000\u0135\u0136\u0003O&\u0000\u0136\u0138\u0001\u0000" +
                    "\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000" +
                    "\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000" +
                    "\u0000\u0000\u013aR\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000" +
                    "\u0000\u000f\u0000\u0001\u0002W^\u00ba\u00bf\u00dc\u00fd\u0108\u0110\u011b" +
                    "\u0124\u012a\u0139\u0006\u0005\u0001\u0000\u0006\u0000\u0000\u0007\u0001" +
                    "\u0000\u0005\u0002\u0000\u0007\u0002\u0000\u0004\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}