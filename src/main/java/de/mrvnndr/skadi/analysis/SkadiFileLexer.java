package de.mrvnndr.skadi.analysis;

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
            ENTER = 7, PROGRESS = 8, FINISH = 9, CURLY_OPEN = 10, EQUAL = 11, PERIOD = 12, ID = 13,
            WS = 14, CODE_END = 15;
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
                "CURLY_OPEN", "EQUAL", "PERIOD", "ID", "WS", "CODE_COMMENT", "CODE_BLOCK_COMMENT",
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
            "\u0004\u0000\u000f\u0110\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff" +
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
                    "\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0005\u0000F\b\u0000\n\u0000" +
                    "\f\u0000I\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000M\b\u0000\n\u0000" +
                    "\f\u0000P\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
                    "\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u008c\b\n\n\n\f\n\u008f" +
                    "\t\n\u0001\u000b\u0004\u000b\u0092\b\u000b\u000b\u000b\f\u000b\u0093\u0001" +
                    "\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001" +
                    "\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f" +
                    "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010" +
                    "\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u00af\b\u0011" +
                    "\u000b\u0011\f\u0011\u00b0\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012" +
                    "\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015" +
                    "\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016" +
                    "\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017" +
                    "\u0001\u0018\u0004\u0018\u00d0\b\u0018\u000b\u0018\f\u0018\u00d1\u0001" +
                    "\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001" +
                    "\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00dd\b\u001a\u0001\u001b\u0001" +
                    "\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00e3\b\u001b\n\u001b\f\u001b" +
                    "\u00e6\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c" +
                    "\u0001\u001c\u0005\u001c\u00ee\b\u001c\n\u001c\f\u001c\u00f1\t\u001c\u0001" +
                    "\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u00f7\b\u001d\u000b" +
                    "\u001d\f\u001d\u00f8\u0001\u001e\u0001\u001e\u0005\u001e\u00fd\b\u001e" +
                    "\n\u001e\f\u001e\u0100\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001" +
                    "\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001" +
                    "\u001f\u0005\u001f\u010c\b\u001f\n\u001f\f\u001f\u010f\t\u001f\u0004G" +
                    "\u00e4\u00ef\u00fe\u0000 \u0003\u0003\u0005\u0004\u0007\u0005\t\u0006" +
                    "\u000b\u0007\r\b\u000f\t\u0011\n\u0013\u000b\u0015\f\u0017\r\u0019\u000e" +
                    "\u001b\u0000\u001d\u0000\u001f\u0000!\u0000#\u000f%\u0000\'\u0000)\u0000" +
                    "+\u0000-\u0000/\u00001\u00003\u00005\u00007\u00009\u0000;\u0000=\u0000" +
                    "?\u0000A\u0000\u0003\u0000\u0001\u0002\u0007\u0002\u0000\n\n\r\r\u0003" +
                    "\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0005\u0000\"\"" +
                    "--//{{}}\u0002\u0000--//\u0002\u0000\t\t  \u0113\u0000\u0003\u0001\u0000" +
                    "\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000" +
                    "\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000" +
                    "\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000" +
                    "\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000" +
                    "\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000" +
                    "\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000" +
                    "\u0001\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000" +
                    "\u0001!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0001%" +
                    "\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0002)\u0001" +
                    "\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000" +
                    "\u0000\u0002/\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0002" +
                    "3\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0003C\u0001" +
                    "\u0000\u0000\u0000\u0005S\u0001\u0000\u0000\u0000\u0007X\u0001\u0000\u0000" +
                    "\u0000\ta\u0001\u0000\u0000\u0000\u000bk\u0001\u0000\u0000\u0000\rq\u0001" +
                    "\u0000\u0000\u0000\u000fz\u0001\u0000\u0000\u0000\u0011\u0081\u0001\u0000" +
                    "\u0000\u0000\u0013\u0085\u0001\u0000\u0000\u0000\u0015\u0087\u0001\u0000" +
                    "\u0000\u0000\u0017\u0089\u0001\u0000\u0000\u0000\u0019\u0091\u0001\u0000" +
                    "\u0000\u0000\u001b\u0097\u0001\u0000\u0000\u0000\u001d\u009b\u0001\u0000" +
                    "\u0000\u0000\u001f\u009f\u0001\u0000\u0000\u0000!\u00a3\u0001\u0000\u0000" +
                    "\u0000#\u00a8\u0001\u0000\u0000\u0000%\u00ae\u0001\u0000\u0000\u0000\'" +
                    "\u00b4\u0001\u0000\u0000\u0000)\u00b8\u0001\u0000\u0000\u0000+\u00bc\u0001" +
                    "\u0000\u0000\u0000-\u00c0\u0001\u0000\u0000\u0000/\u00c4\u0001\u0000\u0000" +
                    "\u00001\u00c9\u0001\u0000\u0000\u00003\u00cf\u0001\u0000\u0000\u00005" +
                    "\u00d5\u0001\u0000\u0000\u00007\u00dc\u0001\u0000\u0000\u00009\u00de\u0001" +
                    "\u0000\u0000\u0000;\u00e9\u0001\u0000\u0000\u0000=\u00f6\u0001\u0000\u0000" +
                    "\u0000?\u00fa\u0001\u0000\u0000\u0000A\u0103\u0001\u0000\u0000\u0000C" +
                    "G\u0005\"\u0000\u0000DF\b\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000" +
                    "FI\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000" +
                    "\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JN\u0005\"\u0000" +
                    "\u0000KM\u0003=\u001d\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000" +
                    "\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000" +
                    "\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u00037\u001a\u0000R\u0004\u0001" +
                    "\u0000\u0000\u0000ST\u0005c\u0000\u0000TU\u0005o\u0000\u0000UV\u0005p" +
                    "\u0000\u0000VW\u0005y\u0000\u0000W\u0006\u0001\u0000\u0000\u0000XY\u0005" +
                    "f\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005a\u0000\u0000[\\\u0005g\u0000" +
                    "\u0000\\]\u0005m\u0000\u0000]^\u0005e\u0000\u0000^_\u0005n\u0000\u0000" +
                    "_`\u0005t\u0000\u0000`\b\u0001\u0000\u0000\u0000ab\u0005a\u0000\u0000" +
                    "bc\u0005u\u0000\u0000cd\u0005t\u0000\u0000de\u0005o\u0000\u0000ef\u0005" +
                    "m\u0000\u0000fg\u0005a\u0000\u0000gh\u0005t\u0000\u0000hi\u0005o\u0000" +
                    "\u0000ij\u0005n\u0000\u0000j\n\u0001\u0000\u0000\u0000kl\u0005e\u0000" +
                    "\u0000lm\u0005n\u0000\u0000mn\u0005t\u0000\u0000no\u0005e\u0000\u0000" +
                    "op\u0005r\u0000\u0000p\f\u0001\u0000\u0000\u0000qr\u0005p\u0000\u0000" +
                    "rs\u0005r\u0000\u0000st\u0005o\u0000\u0000tu\u0005g\u0000\u0000uv\u0005" +
                    "r\u0000\u0000vw\u0005e\u0000\u0000wx\u0005s\u0000\u0000xy\u0005s\u0000" +
                    "\u0000y\u000e\u0001\u0000\u0000\u0000z{\u0005f\u0000\u0000{|\u0005i\u0000" +
                    "\u0000|}\u0005n\u0000\u0000}~\u0005i\u0000\u0000~\u007f\u0005s\u0000\u0000" +
                    "\u007f\u0080\u0005h\u0000\u0000\u0080\u0010\u0001\u0000\u0000\u0000\u0081" +
                    "\u0082\u0005{\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084" +
                    "\u0006\u0007\u0000\u0000\u0084\u0012\u0001\u0000\u0000\u0000\u0085\u0086" +
                    "\u0005=\u0000\u0000\u0086\u0014\u0001\u0000\u0000\u0000\u0087\u0088\u0005" +
                    ".\u0000\u0000\u0088\u0016\u0001\u0000\u0000\u0000\u0089\u008d\u0007\u0001" +
                    "\u0000\u0000\u008a\u008c\u0007\u0002\u0000\u0000\u008b\u008a\u0001\u0000" +
                    "\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000" +
                    "\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0018\u0001\u0000" +
                    "\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0003" +
                    "\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000" +
                    "\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000" +
                    "\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u000b" +
                    "\u0001\u0000\u0096\u001a\u0001\u0000\u0000\u0000\u0097\u0098\u00039\u001b" +
                    "\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0006\f\u0002\u0000" +
                    "\u009a\u001c\u0001\u0000\u0000\u0000\u009b\u009c\u0003;\u001c\u0000\u009c" +
                    "\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0006\r\u0002\u0000\u009e\u001e" +
                    "\u0001\u0000\u0000\u0000\u009f\u00a0\u0003A\u001f\u0000\u00a0\u00a1\u0001" +
                    "\u0000\u0000\u0000\u00a1\u00a2\u0006\u000e\u0002\u0000\u00a2 \u0001\u0000" +
                    "\u0000\u0000\u00a3\u00a4\u0005{\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000" +
                    "\u0000\u00a5\u00a6\u0006\u000f\u0002\u0000\u00a6\u00a7\u0006\u000f\u0003" +
                    "\u0000\u00a7\"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005}\u0000\u0000" +
                    "\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006\u0010\u0004\u0000" +
                    "\u00ab\u00ac\u0006\u0010\u0005\u0000\u00ac$\u0001\u0000\u0000\u0000\u00ad" +
                    "\u00af\b\u0004\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0" +
                    "\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1" +
                    "\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3" +
                    "\u0006\u0011\u0002\u0000\u00b3&\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007" +
                    "\u0005\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006" +
                    "\u0012\u0002\u0000\u00b7(\u0001\u0000\u0000\u0000\u00b8\u00b9\u00039\u001b" +
                    "\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0006\u0013\u0002" +
                    "\u0000\u00bb*\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003;\u001c\u0000\u00bd" +
                    "\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\u0014\u0002\u0000\u00bf" +
                    ",\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003A\u001f\u0000\u00c1\u00c2\u0001" +
                    "\u0000\u0000\u0000\u00c2\u00c3\u0006\u0015\u0002\u0000\u00c3.\u0001\u0000" +
                    "\u0000\u0000\u00c4\u00c5\u0005{\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000" +
                    "\u0000\u00c6\u00c7\u0006\u0016\u0003\u0000\u00c7\u00c8\u0006\u0016\u0002" +
                    "\u0000\u00c80\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005}\u0000\u0000\u00ca" +
                    "\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0006\u0017\u0005\u0000\u00cc" +
                    "\u00cd\u0006\u0017\u0002\u0000\u00cd2\u0001\u0000\u0000\u0000\u00ce\u00d0" +
                    "\b\u0004\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001" +
                    "\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001" +
                    "\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0006" +
                    "\u0018\u0002\u0000\u00d44\u0001\u0000\u0000\u0000\u00d5\u00d6\u0007\u0005" +
                    "\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0006\u0019" +
                    "\u0002\u0000\u00d86\u0001\u0000\u0000\u0000\u00d9\u00dd\u0005\n\u0000" +
                    "\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00dd\u0005\n\u0000\u0000" +
                    "\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000" +
                    "\u00dd8\u0001\u0000\u0000\u0000\u00de\u00df\u0005-\u0000\u0000\u00df\u00e0" +
                    "\u0005-\u0000\u0000\u00e0\u00e4\u0001\u0000\u0000\u0000\u00e1\u00e3\t" +
                    "\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001" +
                    "\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001" +
                    "\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001" +
                    "\u0000\u0000\u0000\u00e7\u00e8\u00037\u001a\u0000\u00e8:\u0001\u0000\u0000" +
                    "\u0000\u00e9\u00ea\u0005/\u0000\u0000\u00ea\u00eb\u0005*\u0000\u0000\u00eb" +
                    "\u00ef\u0001\u0000\u0000\u0000\u00ec\u00ee\t\u0000\u0000\u0000\u00ed\u00ec" +
                    "\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f0" +
                    "\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2" +
                    "\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3" +
                    "\u0005*\u0000\u0000\u00f3\u00f4\u0005/\u0000\u0000\u00f4<\u0001\u0000" +
                    "\u0000\u0000\u00f5\u00f7\u0007\u0006\u0000\u0000\u00f6\u00f5\u0001\u0000" +
                    "\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000" +
                    "\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9>\u0001\u0000\u0000" +
                    "\u0000\u00fa\u00fe\u0005\"\u0000\u0000\u00fb\u00fd\t\u0000\u0000\u0000" +
                    "\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000" +
                    "\u00fe\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000" +
                    "\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000" +
                    "\u0101\u0102\u0005\"\u0000\u0000\u0102@\u0001\u0000\u0000\u0000\u0103" +
                    "\u010d\u0003?\u001e\u0000\u0104\u0105\u0003=\u001d\u0000\u0105\u0106\u0005" +
                    "&\u0000\u0000\u0106\u0107\u0003=\u001d\u0000\u0107\u0108\u00037\u001a" +
                    "\u0000\u0108\u0109\u0003=\u001d\u0000\u0109\u010a\u0003?\u001e\u0000\u010a" +
                    "\u010c\u0001\u0000\u0000\u0000\u010b\u0104\u0001\u0000\u0000\u0000\u010c" +
                    "\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d" +
                    "\u010e\u0001\u0000\u0000\u0000\u010eB\u0001\u0000\u0000\u0000\u010f\u010d" +
                    "\u0001\u0000\u0000\u0000\u000f\u0000\u0001\u0002GN\u008d\u0093\u00b0\u00d1" +
                    "\u00dc\u00e4\u00ef\u00f8\u00fe\u010d\u0006\u0005\u0001\u0000\u0006\u0000" +
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