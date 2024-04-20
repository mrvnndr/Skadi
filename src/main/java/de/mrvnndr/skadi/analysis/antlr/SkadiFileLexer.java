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
            ENTER = 7, PROGRESS = 8, FINISH = 9, EMBED = 10, AT = 11, IN = 12, CURLY_OPEN = 13,
            EQUAL = 14, PERIOD = 15, COMMA = 16, ID = 17, WS = 18, CODE_END = 19;
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
                "EMBED", "AT", "IN", "CURLY_OPEN", "EQUAL", "PERIOD", "COMMA", "ID",
                "WS", "CODE_COMMENT", "CODE_BLOCK_COMMENT", "CODE_STRING", "CODE_CURLY",
                "CODE_END", "CODE_ACTION_CODE", "CODE_SINGLE_CHAR", "NC_COMMENT", "NC_BLOCK_COMMENT",
                "NC_STRING", "NC_NEW", "NC_END", "NC_ACTION_CODE", "NC_SINGLE_CHAR",
                "LINEBREAK", "VHDL_COMMENT", "C_COMMENT", "WS_NO_BREAK", "BASIC_STRING",
                "STRING"
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
            "\u0004\u0000\u0013\u0126\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff" +
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
                    "\u0007#\u0001\u0000\u0001\u0000\u0005\u0000N\b\u0000\n\u0000\f\u0000Q" +
                    "\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000U\b\u0000\n\u0000\f\u0000" +
                    "X\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001" +
                    "\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001" +
                    "\r\u0001\u000e\u0001\u000e\u0005\u000e\u00a2\b\u000e\n\u000e\f\u000e\u00a5" +
                    "\t\u000e\u0001\u000f\u0004\u000f\u00a8\b\u000f\u000b\u000f\f\u000f\u00a9" +
                    "\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010" +
                    "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012" +
                    "\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014" +
                    "\u0001\u0015\u0004\u0015\u00c5\b\u0015\u000b\u0015\f\u0015\u00c6\u0001" +
                    "\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001" +
                    "\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001" +
                    "\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001" +
                    "\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001" +
                    "\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u00e6" +
                    "\b\u001c\u000b\u001c\f\u001c\u00e7\u0001\u001c\u0001\u001c\u0001\u001d" +
                    "\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e" +
                    "\u0003\u001e\u00f3\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f" +
                    "\u0005\u001f\u00f9\b\u001f\n\u001f\f\u001f\u00fc\t\u001f\u0001\u001f\u0001" +
                    "\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u0104\b \n \f \u0107\t \u0001" +
                    " \u0001 \u0001 \u0001!\u0004!\u010d\b!\u000b!\f!\u010e\u0001\"\u0001\"" +
                    "\u0005\"\u0113\b\"\n\"\f\"\u0116\t\"\u0001\"\u0001\"\u0001#\u0001#\u0001" +
                    "#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0122\b#\n#\f#\u0125\t#\u0004" +
                    "O\u00fa\u0105\u0114\u0000$\u0003\u0003\u0005\u0004\u0007\u0005\t\u0006" +
                    "\u000b\u0007\r\b\u000f\t\u0011\n\u0013\u000b\u0015\f\u0017\r\u0019\u000e" +
                    "\u001b\u000f\u001d\u0010\u001f\u0011!\u0012#\u0000%\u0000\'\u0000)\u0000" +
                    "+\u0013-\u0000/\u00001\u00003\u00005\u00007\u00009\u0000;\u0000=\u0000" +
                    "?\u0000A\u0000C\u0000E\u0000G\u0000I\u0000\u0003\u0000\u0001\u0002\u0007" +
                    "\u0002\u0000\n\n\r\r\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000" +
                    "\t\n\r\r  \u0005\u0000\"\"--//{{}}\u0002\u0000--//\u0002\u0000\t\t  \u0129" +
                    "\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000" +
                    "\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000" +
                    "\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f" +
                    "\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013" +
                    "\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017" +
                    "\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b" +
                    "\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f" +
                    "\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000" +
                    "\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000" +
                    "\u0000\u0001)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0001" +
                    "-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00021\u0001" +
                    "\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000" +
                    "\u0000\u00027\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0002" +
                    ";\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0003K\u0001" +
                    "\u0000\u0000\u0000\u0005[\u0001\u0000\u0000\u0000\u0007`\u0001\u0000\u0000" +
                    "\u0000\ti\u0001\u0000\u0000\u0000\u000bs\u0001\u0000\u0000\u0000\ry\u0001" +
                    "\u0000\u0000\u0000\u000f\u0082\u0001\u0000\u0000\u0000\u0011\u0089\u0001" +
                    "\u0000\u0000\u0000\u0013\u008f\u0001\u0000\u0000\u0000\u0015\u0092\u0001" +
                    "\u0000\u0000\u0000\u0017\u0095\u0001\u0000\u0000\u0000\u0019\u0099\u0001" +
                    "\u0000\u0000\u0000\u001b\u009b\u0001\u0000\u0000\u0000\u001d\u009d\u0001" +
                    "\u0000\u0000\u0000\u001f\u009f\u0001\u0000\u0000\u0000!\u00a7\u0001\u0000" +
                    "\u0000\u0000#\u00ad\u0001\u0000\u0000\u0000%\u00b1\u0001\u0000\u0000\u0000" +
                    "\'\u00b5\u0001\u0000\u0000\u0000)\u00b9\u0001\u0000\u0000\u0000+\u00be" +
                    "\u0001\u0000\u0000\u0000-\u00c4\u0001\u0000\u0000\u0000/\u00ca\u0001\u0000" +
                    "\u0000\u00001\u00ce\u0001\u0000\u0000\u00003\u00d2\u0001\u0000\u0000\u0000" +
                    "5\u00d6\u0001\u0000\u0000\u00007\u00da\u0001\u0000\u0000\u00009\u00df" +
                    "\u0001\u0000\u0000\u0000;\u00e5\u0001\u0000\u0000\u0000=\u00eb\u0001\u0000" +
                    "\u0000\u0000?\u00f2\u0001\u0000\u0000\u0000A\u00f4\u0001\u0000\u0000\u0000" +
                    "C\u00ff\u0001\u0000\u0000\u0000E\u010c\u0001\u0000\u0000\u0000G\u0110" +
                    "\u0001\u0000\u0000\u0000I\u0119\u0001\u0000\u0000\u0000KO\u0005\"\u0000" +
                    "\u0000LN\b\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000" +
                    "\u0000OP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PR\u0001\u0000" +
                    "\u0000\u0000QO\u0001\u0000\u0000\u0000RV\u0005\"\u0000\u0000SU\u0003E" +
                    "!\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000" +
                    "\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001" +
                    "\u0000\u0000\u0000YZ\u0003?\u001e\u0000Z\u0004\u0001\u0000\u0000\u0000" +
                    "[\\\u0005c\u0000\u0000\\]\u0005o\u0000\u0000]^\u0005p\u0000\u0000^_\u0005" +
                    "y\u0000\u0000_\u0006\u0001\u0000\u0000\u0000`a\u0005f\u0000\u0000ab\u0005" +
                    "r\u0000\u0000bc\u0005a\u0000\u0000cd\u0005g\u0000\u0000de\u0005m\u0000" +
                    "\u0000ef\u0005e\u0000\u0000fg\u0005n\u0000\u0000gh\u0005t\u0000\u0000" +
                    "h\b\u0001\u0000\u0000\u0000ij\u0005a\u0000\u0000jk\u0005u\u0000\u0000" +
                    "kl\u0005t\u0000\u0000lm\u0005o\u0000\u0000mn\u0005m\u0000\u0000no\u0005" +
                    "a\u0000\u0000op\u0005t\u0000\u0000pq\u0005o\u0000\u0000qr\u0005n\u0000" +
                    "\u0000r\n\u0001\u0000\u0000\u0000st\u0005e\u0000\u0000tu\u0005n\u0000" +
                    "\u0000uv\u0005t\u0000\u0000vw\u0005e\u0000\u0000wx\u0005r\u0000\u0000" +
                    "x\f\u0001\u0000\u0000\u0000yz\u0005p\u0000\u0000z{\u0005r\u0000\u0000" +
                    "{|\u0005o\u0000\u0000|}\u0005g\u0000\u0000}~\u0005r\u0000\u0000~\u007f" +
                    "\u0005e\u0000\u0000\u007f\u0080\u0005s\u0000\u0000\u0080\u0081\u0005s" +
                    "\u0000\u0000\u0081\u000e\u0001\u0000\u0000\u0000\u0082\u0083\u0005f\u0000" +
                    "\u0000\u0083\u0084\u0005i\u0000\u0000\u0084\u0085\u0005n\u0000\u0000\u0085" +
                    "\u0086\u0005i\u0000\u0000\u0086\u0087\u0005s\u0000\u0000\u0087\u0088\u0005" +
                    "h\u0000\u0000\u0088\u0010\u0001\u0000\u0000\u0000\u0089\u008a\u0005e\u0000" +
                    "\u0000\u008a\u008b\u0005m\u0000\u0000\u008b\u008c\u0005b\u0000\u0000\u008c" +
                    "\u008d\u0005e\u0000\u0000\u008d\u008e\u0005d\u0000\u0000\u008e\u0012\u0001" +
                    "\u0000\u0000\u0000\u008f\u0090\u0005a\u0000\u0000\u0090\u0091\u0005t\u0000" +
                    "\u0000\u0091\u0014\u0001\u0000\u0000\u0000\u0092\u0093\u0005i\u0000\u0000" +
                    "\u0093\u0094\u0005n\u0000\u0000\u0094\u0016\u0001\u0000\u0000\u0000\u0095" +
                    "\u0096\u0005{\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098" +
                    "\u0006\n\u0000\u0000\u0098\u0018\u0001\u0000\u0000\u0000\u0099\u009a\u0005" +
                    "=\u0000\u0000\u009a\u001a\u0001\u0000\u0000\u0000\u009b\u009c\u0005.\u0000" +
                    "\u0000\u009c\u001c\u0001\u0000\u0000\u0000\u009d\u009e\u0005,\u0000\u0000" +
                    "\u009e\u001e\u0001\u0000\u0000\u0000\u009f\u00a3\u0007\u0001\u0000\u0000" +
                    "\u00a0\u00a2\u0007\u0002\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000" +
                    "\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000" +
                    "\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4 \u0001\u0000\u0000\u0000\u00a5" +
                    "\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0007\u0003\u0000\u0000\u00a7" +
                    "\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9" +
                    "\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa" +
                    "\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006\u000f\u0001\u0000\u00ac" +
                    "\"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003A\u001f\u0000\u00ae\u00af" +
                    "\u0001\u0000\u0000\u0000\u00af\u00b0\u0006\u0010\u0002\u0000\u00b0$\u0001" +
                    "\u0000\u0000\u0000\u00b1\u00b2\u0003C \u0000\u00b2\u00b3\u0001\u0000\u0000" +
                    "\u0000\u00b3\u00b4\u0006\u0011\u0002\u0000\u00b4&\u0001\u0000\u0000\u0000" +
                    "\u00b5\u00b6\u0003I#\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8" +
                    "\u0006\u0012\u0002\u0000\u00b8(\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005" +
                    "{\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0006\u0013" +
                    "\u0002\u0000\u00bc\u00bd\u0006\u0013\u0003\u0000\u00bd*\u0001\u0000\u0000" +
                    "\u0000\u00be\u00bf\u0005}\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000" +
                    "\u00c0\u00c1\u0006\u0014\u0004\u0000\u00c1\u00c2\u0006\u0014\u0005\u0000" +
                    "\u00c2,\u0001\u0000\u0000\u0000\u00c3\u00c5\b\u0004\u0000\u0000\u00c4" +
                    "\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6" +
                    "\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7" +
                    "\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006\u0015\u0002\u0000\u00c9" +
                    ".\u0001\u0000\u0000\u0000\u00ca\u00cb\u0007\u0005\u0000\u0000\u00cb\u00cc" +
                    "\u0001\u0000\u0000\u0000\u00cc\u00cd\u0006\u0016\u0002\u0000\u00cd0\u0001" +
                    "\u0000\u0000\u0000\u00ce\u00cf\u0003A\u001f\u0000\u00cf\u00d0\u0001\u0000" +
                    "\u0000\u0000\u00d0\u00d1\u0006\u0017\u0002\u0000\u00d12\u0001\u0000\u0000" +
                    "\u0000\u00d2\u00d3\u0003C \u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4" +
                    "\u00d5\u0006\u0018\u0002\u0000\u00d54\u0001\u0000\u0000\u0000\u00d6\u00d7" +
                    "\u0003I#\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0006\u0019" +
                    "\u0002\u0000\u00d96\u0001\u0000\u0000\u0000\u00da\u00db\u0005{\u0000\u0000" +
                    "\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0006\u001a\u0003\u0000" +
                    "\u00dd\u00de\u0006\u001a\u0002\u0000\u00de8\u0001\u0000\u0000\u0000\u00df" +
                    "\u00e0\u0005}\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2" +
                    "\u0006\u001b\u0005\u0000\u00e2\u00e3\u0006\u001b\u0002\u0000\u00e3:\u0001" +
                    "\u0000\u0000\u0000\u00e4\u00e6\b\u0004\u0000\u0000\u00e5\u00e4\u0001\u0000" +
                    "\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000" +
                    "\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000" +
                    "\u0000\u0000\u00e9\u00ea\u0006\u001c\u0002\u0000\u00ea<\u0001\u0000\u0000" +
                    "\u0000\u00eb\u00ec\u0007\u0005\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000" +
                    "\u0000\u00ed\u00ee\u0006\u001d\u0002\u0000\u00ee>\u0001\u0000\u0000\u0000" +
                    "\u00ef\u00f3\u0005\n\u0000\u0000\u00f0\u00f1\u0005\r\u0000\u0000\u00f1" +
                    "\u00f3\u0005\n\u0000\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f0" +
                    "\u0001\u0000\u0000\u0000\u00f3@\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005" +
                    "-\u0000\u0000\u00f5\u00f6\u0005-\u0000\u0000\u00f6\u00fa\u0001\u0000\u0000" +
                    "\u0000\u00f7\u00f9\t\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000" +
                    "\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000" +
                    "\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000" +
                    "\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003?\u001e\u0000\u00fe" +
                    "B\u0001\u0000\u0000\u0000\u00ff\u0100\u0005/\u0000\u0000\u0100\u0101\u0005" +
                    "*\u0000\u0000\u0101\u0105\u0001\u0000\u0000\u0000\u0102\u0104\t\u0000" +
                    "\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000" +
                    "\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000" +
                    "\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000" +
                    "\u0000\u0000\u0108\u0109\u0005*\u0000\u0000\u0109\u010a\u0005/\u0000\u0000" +
                    "\u010aD\u0001\u0000\u0000\u0000\u010b\u010d\u0007\u0006\u0000\u0000\u010c" +
                    "\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e" +
                    "\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f" +
                    "F\u0001\u0000\u0000\u0000\u0110\u0114\u0005\"\u0000\u0000\u0111\u0113" +
                    "\t\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001" +
                    "\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0114\u0112\u0001" +
                    "\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001" +
                    "\u0000\u0000\u0000\u0117\u0118\u0005\"\u0000\u0000\u0118H\u0001\u0000" +
                    "\u0000\u0000\u0119\u0123\u0003G\"\u0000\u011a\u011b\u0003E!\u0000\u011b" +
                    "\u011c\u0005&\u0000\u0000\u011c\u011d\u0003E!\u0000\u011d\u011e\u0003" +
                    "?\u001e\u0000\u011e\u011f\u0003E!\u0000\u011f\u0120\u0003G\"\u0000\u0120" +
                    "\u0122\u0001\u0000\u0000\u0000\u0121\u011a\u0001\u0000\u0000\u0000\u0122" +
                    "\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123" +
                    "\u0124\u0001\u0000\u0000\u0000\u0124J\u0001\u0000\u0000\u0000\u0125\u0123" +
                    "\u0001\u0000\u0000\u0000\u000f\u0000\u0001\u0002OV\u00a3\u00a9\u00c6\u00e7" +
                    "\u00f2\u00fa\u0105\u010e\u0114\u0123\u0006\u0005\u0001\u0000\u0006\u0000" +
                    "\u0000\u0007\u0001\u0000\u0005\u0002\u0000\u0007\u0002\u0000\u0004\u0000" +
                    "\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}