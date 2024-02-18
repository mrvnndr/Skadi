package de.mrvnndr.skadi.analysis;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SkadiParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			ACTION_END = 1, BACKSLASH = 2, BRACKET_CLOSED = 3, BRACKET_OPEN = 4, CHAR = 5, CH_a = 6,
			CH_b = 7, CH_c = 8, CH_d = 9, CH_e = 10, CH_f = 11, CH_n = 12, CH_r = 13, CH_s = 14, CH_t = 15,
			CH_v = 16, CH_w = 17, CH_x = 18, CH_A = 19, CH_B = 20, CH_C = 21, CH_D = 22, CH_E = 23,
			CH_F = 24, CH_S = 25, CH_W = 26, CIRCUMFLEX = 27, COLON = 28, COMMA = 29, COMMENT = 30,
			CURLY_CLOSED = 31, CURLY_OPEN = 32, DASH = 33, DOLLAR = 34, DOT = 35, HOST_CODE = 36,
			NAME = 37, NON_ZERO_DIGIT = 38, PAREN_CLOSED = 39, PAREN_OPEN = 40, PATTERN_CHAR = 41,
			PLUS = 42, QUESTION_MARK = 43, REGEX_END = 44, SECTION_SEP = 45, STAR = 46, UNDERSCORE = 47,
			VERT_BAR = 48, ZERO = 49, DEF_WS_NB = 50, DEF_CODE_START = 51, DEF_NEW_LINE = 52,
			IC_NEW_LINE = 53, UC_END = 54, ED_WS = 55, EA_PERC_CURLY = 56, EA_CURLY = 57, REGEX_RULES_WS_NB = 58,
			REGEX_RULES_CODE_START = 59, REGEX_RULES_NEW_LINE = 60, NC_END = 61, REGEX_a = 62,
			REGEX_b = 63, REGEX_c = 64, REGEX_d = 65, REGEX_e = 66, REGEX_f = 67, REGEX_n = 68,
			REGEX_r = 69, REGEX_s = 70, REGEX_t = 71, REGEX_v = 72, REGEX_w = 73, REGEX_x = 74,
			REGEX_A = 75, REGEX_B = 76, REGEX_C = 77, REGEX_D = 78, REGEX_E = 79, REGEX_F = 80,
			REGEX_S = 81, REGEX_W = 82, REGEX_PAREN_OPEN = 83, REGEX_PAREN_CLOSED = 84, REGEX_BRACKET_OPEN = 85,
			REGEX_BRACKET_CLOSED = 86, REGEX_CIRCUMFLEX = 87, REGEX_DASH = 88, REGEX_UNDERLINE = 89,
			REGEX_STAR = 90, REGEX_BACKSLASH = 91, REGEX_DOT = 92, REGEX_COMMA = 93, REGEX_DOLLAR = 94,
			REGEX_PLUS = 95, REGEX_COLON = 96, REGEX_QUESTION_MARK = 97, REGEX_VERT_BAR = 98;
	public static final int
			RULE_file = 0, RULE_definitions_section = 1, RULE_definition = 2, RULE_rules = 3,
			RULE_rule = 4, RULE_user_code = 5, RULE_regex = 6, RULE_inner_regex = 7,
			RULE_alternative = 8, RULE_term = 9, RULE_assertion = 10, RULE_quantifier = 11,
			RULE_quantifier_prefix = 12, RULE_atom = 13, RULE_atom_escape = 14, RULE_character_escape = 15,
			RULE_control_escape = 16, RULE_control_letter = 17, RULE_identity_escape = 18,
			RULE_decimal_escape = 19, RULE_hex_escape_sequence = 20, RULE_hex_digit = 21,
			RULE_character_class_escape = 22, RULE_character_class = 23, RULE_class_ranges = 24,
			RULE_non_empty_class_ranges = 25, RULE_non_empty_class_ranges_no_dash = 26,
			RULE_class_atom = 27, RULE_class_atom_no_dash = 28, RULE_class_escape = 29,
			RULE_rule_reference = 30, RULE_rule_name = 31, RULE_pattern_char = 32,
			RULE_digit = 33, RULE_char = 34;

	private static String[] makeRuleNames() {
		return new String[]{
				"file", "definitions_section", "definition", "rules", "rule", "user_code",
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
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, "'%{'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, "ACTION_END", "BACKSLASH", "BRACKET_CLOSED", "BRACKET_OPEN", "CHAR",
				"CH_a", "CH_b", "CH_c", "CH_d", "CH_e", "CH_f", "CH_n", "CH_r", "CH_s",
				"CH_t", "CH_v", "CH_w", "CH_x", "CH_A", "CH_B", "CH_C", "CH_D", "CH_E",
				"CH_F", "CH_S", "CH_W", "CIRCUMFLEX", "COLON", "COMMA", "COMMENT", "CURLY_CLOSED",
				"CURLY_OPEN", "DASH", "DOLLAR", "DOT", "HOST_CODE", "NAME", "NON_ZERO_DIGIT",
				"PAREN_CLOSED", "PAREN_OPEN", "PATTERN_CHAR", "PLUS", "QUESTION_MARK",
				"REGEX_END", "SECTION_SEP", "STAR", "UNDERSCORE", "VERT_BAR", "ZERO",
				"DEF_WS_NB", "DEF_CODE_START", "DEF_NEW_LINE", "IC_NEW_LINE", "UC_END",
				"ED_WS", "EA_PERC_CURLY", "EA_CURLY", "REGEX_RULES_WS_NB", "REGEX_RULES_CODE_START",
				"REGEX_RULES_NEW_LINE", "NC_END", "REGEX_a", "REGEX_b", "REGEX_c", "REGEX_d",
				"REGEX_e", "REGEX_f", "REGEX_n", "REGEX_r", "REGEX_s", "REGEX_t", "REGEX_v",
				"REGEX_w", "REGEX_x", "REGEX_A", "REGEX_B", "REGEX_C", "REGEX_D", "REGEX_E",
				"REGEX_F", "REGEX_S", "REGEX_W", "REGEX_PAREN_OPEN", "REGEX_PAREN_CLOSED",
				"REGEX_BRACKET_OPEN", "REGEX_BRACKET_CLOSED", "REGEX_CIRCUMFLEX", "REGEX_DASH",
				"REGEX_UNDERLINE", "REGEX_STAR", "REGEX_BACKSLASH", "REGEX_DOT", "REGEX_COMMA",
				"REGEX_DOLLAR", "REGEX_PLUS", "REGEX_COLON", "REGEX_QUESTION_MARK", "REGEX_VERT_BAR"
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
		return "SkadiParser.g4";
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

	public SkadiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public Definitions_sectionContext definitions_section() {
			return getRuleContext(Definitions_sectionContext.class, 0);
		}

		public List<TerminalNode> SECTION_SEP() {
			return getTokens(SkadiParser.SECTION_SEP);
		}

		public TerminalNode SECTION_SEP(int i) {
			return getToken(SkadiParser.SECTION_SEP, i);
		}

		public RulesContext rules() {
			return getRuleContext(RulesContext.class, 0);
		}

		public TerminalNode EOF() {
			return getToken(SkadiParser.EOF, 0);
		}

		public User_codeContext user_code() {
			return getRuleContext(User_codeContext.class, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterFile(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(70);
				definitions_section();
				setState(71);
				match(SECTION_SEP);
				setState(72);
				rules();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == SECTION_SEP) {
					{
						setState(73);
						match(SECTION_SEP);
						setState(74);
						user_code();
					}
				}

				setState(77);
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
	public static class Definitions_sectionContext extends ParserRuleContext {
		public List<TerminalNode> HOST_CODE() {
			return getTokens(SkadiParser.HOST_CODE);
		}

		public TerminalNode HOST_CODE(int i) {
			return getToken(SkadiParser.HOST_CODE, i);
		}

		public List<TerminalNode> COMMENT() {
			return getTokens(SkadiParser.COMMENT);
		}

		public TerminalNode COMMENT(int i) {
			return getToken(SkadiParser.COMMENT, i);
		}

		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}

		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class, i);
		}

		public Definitions_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_definitions_section;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).enterDefinitions_section(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitDefinitions_section(this);
		}
	}

	public final Definitions_sectionContext definitions_section() throws RecognitionException {
		Definitions_sectionContext _localctx = new Definitions_sectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207232172032L) != 0)) {
					{
						setState(82);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case HOST_CODE: {
								setState(79);
								match(HOST_CODE);
							}
							break;
							case COMMENT: {
								setState(80);
								match(COMMENT);
							}
							break;
							case NAME: {
								setState(81);
								definition();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(86);
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
	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode NAME() {
			return getToken(SkadiParser.NAME, 0);
		}

		public RegexContext regex() {
			return getRuleContext(RegexContext.class, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterDefinition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(87);
				match(NAME);
				setState(88);
				regex();
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
	public static class RulesContext extends ParserRuleContext {
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}

		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class, i);
		}

		public List<TerminalNode> COMMENT() {
			return getTokens(SkadiParser.COMMENT);
		}

		public TerminalNode COMMENT(int i) {
			return getToken(SkadiParser.COMMENT, i);
		}

		public List<TerminalNode> HOST_CODE() {
			return getTokens(SkadiParser.HOST_CODE);
		}

		public TerminalNode HOST_CODE(int i) {
			return getToken(SkadiParser.HOST_CODE, i);
		}

		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_rules;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterRules(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitRules(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMENT || _la == HOST_CODE) {
					{
						{
							setState(90);
							_la = _input.LA(1);
							if (!(_la == COMMENT || _la == HOST_CODE)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
						}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				rule_();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 865648511025140L) != 0)) {
					{
						setState(99);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case BACKSLASH:
							case BRACKET_OPEN:
							case CHAR:
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
							case CIRCUMFLEX:
							case COLON:
							case COMMA:
							case CURLY_OPEN:
							case DOLLAR:
							case DOT:
							case NON_ZERO_DIGIT:
							case PAREN_OPEN:
							case PATTERN_CHAR:
							case REGEX_END:
							case VERT_BAR:
							case ZERO: {
								setState(97);
								rule_();
							}
							break;
							case COMMENT: {
								setState(98);
								match(COMMENT);
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(103);
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
	public static class RuleContext extends ParserRuleContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class, 0);
		}

		public TerminalNode ACTION_END() {
			return getToken(SkadiParser.ACTION_END, 0);
		}

		public List<TerminalNode> HOST_CODE() {
			return getTokens(SkadiParser.HOST_CODE);
		}

		public TerminalNode HOST_CODE(int i) {
			return getToken(SkadiParser.HOST_CODE, i);
		}

		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_rule;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterRule(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitRule(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(104);
				regex();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == HOST_CODE) {
					{
						{
							setState(105);
							match(HOST_CODE);
						}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(ACTION_END);
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
	public static class User_codeContext extends ParserRuleContext {
		public User_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_user_code;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterUser_code(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitUser_code(this);
		}
	}

	public final User_codeContext user_code() throws RecognitionException {
		User_codeContext _localctx = new User_codeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_user_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 34359738367L) != 0)) {
					{
						{
							setState(113);
							matchWildcard();
						}
					}
					setState(118);
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
	public static class RegexContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}

		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class, i);
		}

		public TerminalNode REGEX_END() {
			return getToken(SkadiParser.REGEX_END, 0);
		}

		public List<TerminalNode> VERT_BAR() {
			return getTokens(SkadiParser.VERT_BAR);
		}

		public TerminalNode VERT_BAR(int i) {
			return getToken(SkadiParser.VERT_BAR, i);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterRegex(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitRegex(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(119);
				alternative();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == VERT_BAR) {
					{
						{
							setState(120);
							match(VERT_BAR);
							setState(121);
							alternative();
						}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(REGEX_END);
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
			return getTokens(SkadiParser.VERT_BAR);
		}

		public TerminalNode VERT_BAR(int i) {
			return getToken(SkadiParser.VERT_BAR, i);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterInner_regex(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitInner_regex(this);
		}
	}

	public final Inner_regexContext inner_regex() throws RecognitionException {
		Inner_regexContext _localctx = new Inner_regexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inner_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(129);
				alternative();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == VERT_BAR) {
					{
						{
							setState(130);
							match(VERT_BAR);
							setState(131);
							alternative();
						}
					}
					setState(136);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAlternative(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAlternative(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 566580274528244L) != 0)) {
					{
						{
							setState(137);
							term();
						}
					}
					setState(142);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomBase(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomBase(this);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomQuantifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomQuantifier(this);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomAssertion(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomAssertion(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
				case 1:
					_localctx = new AtomBaseContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(143);
					atom();
				}
				break;
				case 2:
					_localctx = new AtomQuantifierContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(144);
					atom();
					setState(145);
					quantifier();
				}
				break;
				case 3:
					_localctx = new AtomAssertionContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(147);
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
			return getToken(SkadiParser.CIRCUMFLEX, 0);
		}

		public TerminalNode DOLLAR() {
			return getToken(SkadiParser.DOLLAR, 0);
		}

		public TerminalNode BACKSLASH() {
			return getToken(SkadiParser.BACKSLASH, 0);
		}

		public TerminalNode CH_b() {
			return getToken(SkadiParser.CH_b, 0);
		}

		public TerminalNode CH_B() {
			return getToken(SkadiParser.CH_B, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAssertion(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assertion);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(150);
					match(CIRCUMFLEX);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(151);
					match(DOLLAR);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(152);
					match(BACKSLASH);
					setState(153);
					match(CH_b);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(154);
					match(BACKSLASH);
					setState(155);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterQuantifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(158);
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
			return getToken(SkadiParser.PLUS, 0);
		}

		public QuantifierPlusContext(Quantifier_prefixContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterQuantifierPlus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitQuantifierPlus(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierQuestionMarkContext extends Quantifier_prefixContext {
		public TerminalNode QUESTION_MARK() {
			return getToken(SkadiParser.QUESTION_MARK, 0);
		}

		public QuantifierQuestionMarkContext(Quantifier_prefixContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).enterQuantifierQuestionMark(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).exitQuantifierQuestionMark(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierBetweenContext extends Quantifier_prefixContext {
		public DigitContext digit;
		public List<DigitContext> amtL = new ArrayList<DigitContext>();
		public List<DigitContext> amtH = new ArrayList<DigitContext>();

		public TerminalNode CURLY_OPEN() {
			return getToken(SkadiParser.CURLY_OPEN, 0);
		}

		public TerminalNode COMMA() {
			return getToken(SkadiParser.COMMA, 0);
		}

		public TerminalNode CURLY_CLOSED() {
			return getToken(SkadiParser.CURLY_CLOSED, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterQuantifierBetween(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitQuantifierBetween(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierExactlyContext extends Quantifier_prefixContext {
		public TerminalNode CURLY_OPEN() {
			return getToken(SkadiParser.CURLY_OPEN, 0);
		}

		public TerminalNode CURLY_CLOSED() {
			return getToken(SkadiParser.CURLY_CLOSED, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterQuantifierExactly(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitQuantifierExactly(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierStarContext extends Quantifier_prefixContext {
		public TerminalNode STAR() {
			return getToken(SkadiParser.STAR, 0);
		}

		public QuantifierStarContext(Quantifier_prefixContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterQuantifierStar(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitQuantifierStar(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierAtLeastContext extends Quantifier_prefixContext {
		public TerminalNode CURLY_OPEN() {
			return getToken(SkadiParser.CURLY_OPEN, 0);
		}

		public TerminalNode COMMA() {
			return getToken(SkadiParser.COMMA, 0);
		}

		public TerminalNode CURLY_CLOSED() {
			return getToken(SkadiParser.CURLY_CLOSED, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterQuantifierAtLeast(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitQuantifierAtLeast(this);
		}
	}

	public final Quantifier_prefixContext quantifier_prefix() throws RecognitionException {
		Quantifier_prefixContext _localctx = new Quantifier_prefixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quantifier_prefix);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
				case 1:
					_localctx = new QuantifierStarContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(160);
					match(STAR);
				}
				break;
				case 2:
					_localctx = new QuantifierPlusContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(161);
					match(PLUS);
				}
				break;
				case 3:
					_localctx = new QuantifierQuestionMarkContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(162);
					match(QUESTION_MARK);
				}
				break;
				case 4:
					_localctx = new QuantifierExactlyContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(163);
					match(CURLY_OPEN);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(164);
								digit();
							}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == NON_ZERO_DIGIT || _la == ZERO);
					setState(169);
					match(CURLY_CLOSED);
				}
				break;
				case 5:
					_localctx = new QuantifierAtLeastContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(171);
					match(CURLY_OPEN);
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(172);
								digit();
							}
						}
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == NON_ZERO_DIGIT || _la == ZERO);
					setState(177);
					match(COMMA);
					setState(178);
					match(CURLY_CLOSED);
				}
				break;
				case 6:
					_localctx = new QuantifierBetweenContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(180);
					match(CURLY_OPEN);
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(181);
								((QuantifierBetweenContext) _localctx).digit = digit();
								((QuantifierBetweenContext) _localctx).amtL.add(((QuantifierBetweenContext) _localctx).digit);
							}
						}
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == NON_ZERO_DIGIT || _la == ZERO);
					setState(186);
					match(COMMA);
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(187);
								((QuantifierBetweenContext) _localctx).digit = digit();
								((QuantifierBetweenContext) _localctx).amtH.add(((QuantifierBetweenContext) _localctx).digit);
							}
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == NON_ZERO_DIGIT || _la == ZERO);
					setState(192);
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
			return getToken(SkadiParser.BACKSLASH, 0);
		}

		public Atom_escapeContext atom_escape() {
			return getRuleContext(Atom_escapeContext.class, 0);
		}

		public AtomAtomEscapeContext(AtomContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomAtomEscape(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomAtomEscape(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomDotContext extends AtomContext {
		public TerminalNode DOT() {
			return getToken(SkadiParser.DOT, 0);
		}

		public AtomDotContext(AtomContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomDot(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomDot(this);
		}
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomParenRegexContext extends AtomContext {
		public TerminalNode PAREN_OPEN() {
			return getToken(SkadiParser.PAREN_OPEN, 0);
		}

		public Inner_regexContext inner_regex() {
			return getRuleContext(Inner_regexContext.class, 0);
		}

		public TerminalNode PAREN_CLOSED() {
			return getToken(SkadiParser.PAREN_CLOSED, 0);
		}

		public TerminalNode QUESTION_MARK() {
			return getToken(SkadiParser.QUESTION_MARK, 0);
		}

		public TerminalNode COLON() {
			return getToken(SkadiParser.COLON, 0);
		}

		public AtomParenRegexContext(AtomContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomParenRegex(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomParenRegex(this);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomCharacterClass(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomCharacterClass(this);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomRuleReference(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomRuleReference(this);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtomPatternChar(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtomPatternChar(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atom);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case CHAR:
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
				case COLON:
				case COMMA:
				case NON_ZERO_DIGIT:
				case PATTERN_CHAR:
				case ZERO:
					_localctx = new AtomPatternCharContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(196);
					pattern_char();
				}
				break;
				case DOT:
					_localctx = new AtomDotContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(197);
					match(DOT);
				}
				break;
				case BACKSLASH:
					_localctx = new AtomAtomEscapeContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(198);
					match(BACKSLASH);
					setState(199);
					atom_escape();
				}
				break;
				case BRACKET_OPEN:
					_localctx = new AtomCharacterClassContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(200);
					character_class();
				}
				break;
				case PAREN_OPEN:
					_localctx = new AtomParenRegexContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(201);
					match(PAREN_OPEN);
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == QUESTION_MARK) {
						{
							setState(202);
							match(QUESTION_MARK);
							setState(203);
							match(COLON);
						}
					}

					setState(206);
					inner_regex();
					setState(207);
					match(PAREN_CLOSED);
				}
				break;
				case CURLY_OPEN:
					_localctx = new AtomRuleReferenceContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(209);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterAtom_escape(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitAtom_escape(this);
		}
	}

	public final Atom_escapeContext atom_escape() throws RecognitionException {
		Atom_escapeContext _localctx = new Atom_escapeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atom_escape);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(212);
					decimal_escape();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(213);
					character_class_escape();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(214);
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
			return getToken(SkadiParser.CH_c, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterCharacter_escape(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitCharacter_escape(this);
		}
	}

	public final Character_escapeContext character_escape() throws RecognitionException {
		Character_escapeContext _localctx = new Character_escapeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_character_escape);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(217);
					control_escape();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(218);
					match(CH_c);
					setState(219);
					control_letter();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(220);
					hex_escape_sequence();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(221);
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
			return getToken(SkadiParser.CH_f, 0);
		}

		public TerminalNode CH_n() {
			return getToken(SkadiParser.CH_n, 0);
		}

		public TerminalNode CH_r() {
			return getToken(SkadiParser.CH_r, 0);
		}

		public TerminalNode CH_t() {
			return getToken(SkadiParser.CH_t, 0);
		}

		public TerminalNode CH_v() {
			return getToken(SkadiParser.CH_v, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterControl_escape(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitControl_escape(this);
		}
	}

	public final Control_escapeContext control_escape() throws RecognitionException {
		Control_escapeContext _localctx = new Control_escapeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_control_escape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(224);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 112640L) != 0))) {
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterControl_letter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitControl_letter(this);
		}
	}

	public final Control_letterContext control_letter() throws RecognitionException {
		Control_letterContext _localctx = new Control_letterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_control_letter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(226);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterIdentity_escape(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitIdentity_escape(this);
		}
	}

	public final Identity_escapeContext identity_escape() throws RecognitionException {
		Identity_escapeContext _localctx = new Identity_escapeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identity_escape);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(228);
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
			return getTokens(SkadiParser.ZERO);
		}

		public TerminalNode ZERO(int i) {
			return getToken(SkadiParser.ZERO, i);
		}

		public List<TerminalNode> NON_ZERO_DIGIT() {
			return getTokens(SkadiParser.NON_ZERO_DIGIT);
		}

		public TerminalNode NON_ZERO_DIGIT(int i) {
			return getToken(SkadiParser.NON_ZERO_DIGIT, i);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterDecimal_escape(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitDecimal_escape(this);
		}
	}

	public final Decimal_escapeContext decimal_escape() throws RecognitionException {
		Decimal_escapeContext _localctx = new Decimal_escapeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decimal_escape);
		int _la;
		try {
			int _alt;
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ZERO:
					enterOuterAlt(_localctx, 1);
				{
					setState(230);
					match(ZERO);
				}
				break;
				case NON_ZERO_DIGIT:
					enterOuterAlt(_localctx, 2);
				{
					setState(231);
					match(NON_ZERO_DIGIT);
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(232);
									_la = _input.LA(1);
									if (!(_la == NON_ZERO_DIGIT || _la == ZERO)) {
										_errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
								}
							}
						}
						setState(237);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
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
			return getToken(SkadiParser.CH_x, 0);
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
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).enterHex_escape_sequence(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitHex_escape_sequence(this);
		}
	}

	public final Hex_escape_sequenceContext hex_escape_sequence() throws RecognitionException {
		Hex_escape_sequenceContext _localctx = new Hex_escape_sequenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hex_escape_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(240);
				match(CH_x);
				setState(241);
				hex_digit();
				setState(242);
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
			return getToken(SkadiParser.CH_a, 0);
		}

		public TerminalNode CH_b() {
			return getToken(SkadiParser.CH_b, 0);
		}

		public TerminalNode CH_c() {
			return getToken(SkadiParser.CH_c, 0);
		}

		public TerminalNode CH_d() {
			return getToken(SkadiParser.CH_d, 0);
		}

		public TerminalNode CH_e() {
			return getToken(SkadiParser.CH_e, 0);
		}

		public TerminalNode CH_f() {
			return getToken(SkadiParser.CH_f, 0);
		}

		public TerminalNode CH_A() {
			return getToken(SkadiParser.CH_A, 0);
		}

		public TerminalNode CH_B() {
			return getToken(SkadiParser.CH_B, 0);
		}

		public TerminalNode CH_C() {
			return getToken(SkadiParser.CH_C, 0);
		}

		public TerminalNode CH_D() {
			return getToken(SkadiParser.CH_D, 0);
		}

		public TerminalNode CH_E() {
			return getToken(SkadiParser.CH_E, 0);
		}

		public TerminalNode CH_F() {
			return getToken(SkadiParser.CH_F, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterHex_digit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitHex_digit(this);
		}
	}

	public final Hex_digitContext hex_digit() throws RecognitionException {
		Hex_digitContext _localctx = new Hex_digitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_hex_digit);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case NON_ZERO_DIGIT:
				case ZERO:
					enterOuterAlt(_localctx, 1);
				{
					setState(244);
					digit();
				}
				break;
				case CH_a:
					enterOuterAlt(_localctx, 2);
				{
					setState(245);
					match(CH_a);
				}
				break;
				case CH_b:
					enterOuterAlt(_localctx, 3);
				{
					setState(246);
					match(CH_b);
				}
				break;
				case CH_c:
					enterOuterAlt(_localctx, 4);
				{
					setState(247);
					match(CH_c);
				}
				break;
				case CH_d:
					enterOuterAlt(_localctx, 5);
				{
					setState(248);
					match(CH_d);
				}
				break;
				case CH_e:
					enterOuterAlt(_localctx, 6);
				{
					setState(249);
					match(CH_e);
				}
				break;
				case CH_f:
					enterOuterAlt(_localctx, 7);
				{
					setState(250);
					match(CH_f);
				}
				break;
				case CH_A:
					enterOuterAlt(_localctx, 8);
				{
					setState(251);
					match(CH_A);
				}
				break;
				case CH_B:
					enterOuterAlt(_localctx, 9);
				{
					setState(252);
					match(CH_B);
				}
				break;
				case CH_C:
					enterOuterAlt(_localctx, 10);
				{
					setState(253);
					match(CH_C);
				}
				break;
				case CH_D:
					enterOuterAlt(_localctx, 11);
				{
					setState(254);
					match(CH_D);
				}
				break;
				case CH_E:
					enterOuterAlt(_localctx, 12);
				{
					setState(255);
					match(CH_E);
				}
				break;
				case CH_F:
					enterOuterAlt(_localctx, 13);
				{
					setState(256);
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
			return getToken(SkadiParser.CH_d, 0);
		}

		public TerminalNode CH_D() {
			return getToken(SkadiParser.CH_D, 0);
		}

		public TerminalNode CH_s() {
			return getToken(SkadiParser.CH_s, 0);
		}

		public TerminalNode CH_S() {
			return getToken(SkadiParser.CH_S, 0);
		}

		public TerminalNode CH_w() {
			return getToken(SkadiParser.CH_w, 0);
		}

		public TerminalNode CH_W() {
			return getToken(SkadiParser.CH_W, 0);
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
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).enterCharacter_class_escape(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).exitCharacter_class_escape(this);
		}
	}

	public final Character_class_escapeContext character_class_escape() throws RecognitionException {
		Character_class_escapeContext _localctx = new Character_class_escapeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_character_class_escape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(259);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 105005568L) != 0))) {
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
			return getToken(SkadiParser.BRACKET_OPEN, 0);
		}

		public Class_rangesContext class_ranges() {
			return getRuleContext(Class_rangesContext.class, 0);
		}

		public TerminalNode BRACKET_CLOSED() {
			return getToken(SkadiParser.BRACKET_CLOSED, 0);
		}

		public TerminalNode CIRCUMFLEX() {
			return getToken(SkadiParser.CIRCUMFLEX, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterCharacter_class(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitCharacter_class(this);
		}
	}

	public final Character_classContext character_class() throws RecognitionException {
		Character_classContext _localctx = new Character_classContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_character_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(261);
				match(BRACKET_OPEN);
				setState(263);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
					case 1: {
						setState(262);
						match(CIRCUMFLEX);
					}
					break;
				}
				setState(265);
				class_ranges();
				setState(266);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterClass_ranges(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitClass_ranges(this);
		}
	}

	public final Class_rangesContext class_ranges() throws RecognitionException {
		Class_rangesContext _localctx = new Class_rangesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_class_ranges);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BRACKET_CLOSED:
					enterOuterAlt(_localctx, 1);
				{
				}
				break;
				case BACKSLASH:
				case BRACKET_OPEN:
				case CHAR:
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
				case CIRCUMFLEX:
				case COLON:
				case COMMA:
				case CURLY_CLOSED:
				case CURLY_OPEN:
				case DASH:
				case DOLLAR:
				case DOT:
				case NON_ZERO_DIGIT:
				case PAREN_CLOSED:
				case PAREN_OPEN:
				case PATTERN_CHAR:
				case PLUS:
				case QUESTION_MARK:
				case STAR:
				case UNDERSCORE:
				case VERT_BAR:
				case ZERO:
					enterOuterAlt(_localctx, 2);
				{
					setState(269);
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
			return getToken(SkadiParser.DASH, 0);
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
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).enterNon_empty_class_ranges(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).exitNon_empty_class_ranges(this);
		}
	}

	public final Non_empty_class_rangesContext non_empty_class_ranges() throws RecognitionException {
		Non_empty_class_rangesContext _localctx = new Non_empty_class_rangesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_non_empty_class_ranges);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(272);
					class_atom();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(273);
					class_atom();
					setState(274);
					non_empty_class_ranges_no_dash();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(276);
					((Non_empty_class_rangesContext) _localctx).from = class_atom();
					setState(277);
					match(DASH);
					setState(278);
					((Non_empty_class_rangesContext) _localctx).to = class_atom();
					setState(279);
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
			return getToken(SkadiParser.DASH, 0);
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
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).enterNon_empty_class_ranges_no_dash(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener)
				((SkadiParserListener) listener).exitNon_empty_class_ranges_no_dash(this);
		}
	}

	public final Non_empty_class_ranges_no_dashContext non_empty_class_ranges_no_dash() throws RecognitionException {
		Non_empty_class_ranges_no_dashContext _localctx = new Non_empty_class_ranges_no_dashContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_non_empty_class_ranges_no_dash);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(283);
					class_atom();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(284);
					class_atom_no_dash();
					setState(285);
					non_empty_class_ranges_no_dash();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(287);
					((Non_empty_class_ranges_no_dashContext) _localctx).from = class_atom_no_dash();
					setState(288);
					match(DASH);
					setState(289);
					((Non_empty_class_ranges_no_dashContext) _localctx).to = class_atom();
					setState(290);
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
			return getToken(SkadiParser.DASH, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterClass_atom(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitClass_atom(this);
		}
	}

	public final Class_atomContext class_atom() throws RecognitionException {
		Class_atomContext _localctx = new Class_atomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_class_atom);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case DASH:
					enterOuterAlt(_localctx, 1);
				{
					setState(294);
					match(DASH);
				}
				break;
				case BACKSLASH:
				case BRACKET_OPEN:
				case CHAR:
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
				case CIRCUMFLEX:
				case COLON:
				case COMMA:
				case CURLY_CLOSED:
				case CURLY_OPEN:
				case DOLLAR:
				case DOT:
				case NON_ZERO_DIGIT:
				case PAREN_CLOSED:
				case PAREN_OPEN:
				case PATTERN_CHAR:
				case PLUS:
				case QUESTION_MARK:
				case STAR:
				case UNDERSCORE:
				case VERT_BAR:
				case ZERO:
					enterOuterAlt(_localctx, 2);
				{
					setState(295);
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
			return getToken(SkadiParser.BACKSLASH, 0);
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
			return getToken(SkadiParser.PATTERN_CHAR, 0);
		}

		public TerminalNode COMMA() {
			return getToken(SkadiParser.COMMA, 0);
		}

		public TerminalNode CIRCUMFLEX() {
			return getToken(SkadiParser.CIRCUMFLEX, 0);
		}

		public TerminalNode VERT_BAR() {
			return getToken(SkadiParser.VERT_BAR, 0);
		}

		public TerminalNode DOLLAR() {
			return getToken(SkadiParser.DOLLAR, 0);
		}

		public TerminalNode STAR() {
			return getToken(SkadiParser.STAR, 0);
		}

		public TerminalNode PLUS() {
			return getToken(SkadiParser.PLUS, 0);
		}

		public TerminalNode DOT() {
			return getToken(SkadiParser.DOT, 0);
		}

		public TerminalNode QUESTION_MARK() {
			return getToken(SkadiParser.QUESTION_MARK, 0);
		}

		public TerminalNode PAREN_OPEN() {
			return getToken(SkadiParser.PAREN_OPEN, 0);
		}

		public TerminalNode PAREN_CLOSED() {
			return getToken(SkadiParser.PAREN_CLOSED, 0);
		}

		public TerminalNode CURLY_OPEN() {
			return getToken(SkadiParser.CURLY_OPEN, 0);
		}

		public TerminalNode CURLY_CLOSED() {
			return getToken(SkadiParser.CURLY_CLOSED, 0);
		}

		public TerminalNode COLON() {
			return getToken(SkadiParser.COLON, 0);
		}

		public TerminalNode BRACKET_OPEN() {
			return getToken(SkadiParser.BRACKET_OPEN, 0);
		}

		public TerminalNode UNDERSCORE() {
			return getToken(SkadiParser.UNDERSCORE, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterClass_atom_no_dash(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitClass_atom_no_dash(this);
		}
	}

	public final Class_atom_no_dashContext class_atom_no_dash() throws RecognitionException {
		Class_atom_no_dashContext _localctx = new Class_atom_no_dashContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_class_atom_no_dash);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BACKSLASH:
					enterOuterAlt(_localctx, 1);
				{
					setState(298);
					match(BACKSLASH);
					setState(299);
					class_escape();
				}
				break;
				case NON_ZERO_DIGIT:
				case ZERO:
					enterOuterAlt(_localctx, 2);
				{
					setState(300);
					digit();
				}
				break;
				case CHAR:
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
					enterOuterAlt(_localctx, 3);
				{
					setState(301);
					char_();
				}
				break;
				case PATTERN_CHAR:
					enterOuterAlt(_localctx, 4);
				{
					setState(302);
					match(PATTERN_CHAR);
				}
				break;
				case COMMA:
					enterOuterAlt(_localctx, 5);
				{
					setState(303);
					match(COMMA);
				}
				break;
				case CIRCUMFLEX:
					enterOuterAlt(_localctx, 6);
				{
					setState(304);
					match(CIRCUMFLEX);
				}
				break;
				case VERT_BAR:
					enterOuterAlt(_localctx, 7);
				{
					setState(305);
					match(VERT_BAR);
				}
				break;
				case DOLLAR:
					enterOuterAlt(_localctx, 8);
				{
					setState(306);
					match(DOLLAR);
				}
				break;
				case STAR:
					enterOuterAlt(_localctx, 9);
				{
					setState(307);
					match(STAR);
				}
				break;
				case PLUS:
					enterOuterAlt(_localctx, 10);
				{
					setState(308);
					match(PLUS);
				}
				break;
				case DOT:
					enterOuterAlt(_localctx, 11);
				{
					setState(309);
					match(DOT);
				}
				break;
				case QUESTION_MARK:
					enterOuterAlt(_localctx, 12);
				{
					setState(310);
					match(QUESTION_MARK);
				}
				break;
				case PAREN_OPEN:
					enterOuterAlt(_localctx, 13);
				{
					setState(311);
					match(PAREN_OPEN);
				}
				break;
				case PAREN_CLOSED:
					enterOuterAlt(_localctx, 14);
				{
					setState(312);
					match(PAREN_CLOSED);
				}
				break;
				case CURLY_OPEN:
					enterOuterAlt(_localctx, 15);
				{
					setState(313);
					match(CURLY_OPEN);
				}
				break;
				case CURLY_CLOSED:
					enterOuterAlt(_localctx, 16);
				{
					setState(314);
					match(CURLY_CLOSED);
				}
				break;
				case COLON:
					enterOuterAlt(_localctx, 17);
				{
					setState(315);
					match(COLON);
				}
				break;
				case BRACKET_OPEN:
					enterOuterAlt(_localctx, 18);
				{
					setState(316);
					match(BRACKET_OPEN);
				}
				break;
				case UNDERSCORE:
					enterOuterAlt(_localctx, 19);
				{
					setState(317);
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
			return getToken(SkadiParser.CH_b, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterClass_escape(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitClass_escape(this);
		}
	}

	public final Class_escapeContext class_escape() throws RecognitionException {
		Class_escapeContext _localctx = new Class_escapeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_class_escape);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(320);
					decimal_escape();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(321);
					match(CH_b);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(322);
					character_class_escape();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(323);
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
			return getToken(SkadiParser.CURLY_OPEN, 0);
		}

		public Rule_nameContext rule_name() {
			return getRuleContext(Rule_nameContext.class, 0);
		}

		public TerminalNode CURLY_CLOSED() {
			return getToken(SkadiParser.CURLY_CLOSED, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterRule_reference(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitRule_reference(this);
		}
	}

	public final Rule_referenceContext rule_reference() throws RecognitionException {
		Rule_referenceContext _localctx = new Rule_referenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rule_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(326);
				match(CURLY_OPEN);
				setState(327);
				rule_name();
				setState(328);
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
			return getTokens(SkadiParser.UNDERSCORE);
		}

		public TerminalNode UNDERSCORE(int i) {
			return getToken(SkadiParser.UNDERSCORE, i);
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
			return getTokens(SkadiParser.DASH);
		}

		public TerminalNode DASH(int i) {
			return getToken(SkadiParser.DASH, i);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterRule_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitRule_name(this);
		}
	}

	public final Rule_nameContext rule_name() throws RecognitionException {
		Rule_nameContext _localctx = new Rule_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rule_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case UNDERSCORE: {
						setState(330);
						match(UNDERSCORE);
					}
					break;
					case CHAR:
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
					case CH_W: {
						setState(331);
						char_();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 703971043835872L) != 0)) {
					{
						setState(338);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case CHAR:
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
							case CH_W: {
								setState(334);
								char_();
							}
							break;
							case NON_ZERO_DIGIT:
							case ZERO: {
								setState(335);
								digit();
							}
							break;
							case UNDERSCORE: {
								setState(336);
								match(UNDERSCORE);
							}
							break;
							case DASH: {
								setState(337);
								match(DASH);
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(342);
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
			return getToken(SkadiParser.PATTERN_CHAR, 0);
		}

		public TerminalNode COMMA() {
			return getToken(SkadiParser.COMMA, 0);
		}

		public TerminalNode COLON() {
			return getToken(SkadiParser.COLON, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterPattern_char(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitPattern_char(this);
		}
	}

	public final Pattern_charContext pattern_char() throws RecognitionException {
		Pattern_charContext _localctx = new Pattern_charContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pattern_char);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case NON_ZERO_DIGIT:
				case ZERO:
					enterOuterAlt(_localctx, 1);
				{
					setState(343);
					digit();
				}
				break;
				case CHAR:
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
					enterOuterAlt(_localctx, 2);
				{
					setState(344);
					char_();
				}
				break;
				case PATTERN_CHAR:
					enterOuterAlt(_localctx, 3);
				{
					setState(345);
					match(PATTERN_CHAR);
				}
				break;
				case COMMA:
					enterOuterAlt(_localctx, 4);
				{
					setState(346);
					match(COMMA);
				}
				break;
				case COLON:
					enterOuterAlt(_localctx, 5);
				{
					setState(347);
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
			return getToken(SkadiParser.ZERO, 0);
		}

		public TerminalNode NON_ZERO_DIGIT() {
			return getToken(SkadiParser.NON_ZERO_DIGIT, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterDigit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(350);
				_la = _input.LA(1);
				if (!(_la == NON_ZERO_DIGIT || _la == ZERO)) {
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
			return getToken(SkadiParser.CH_a, 0);
		}

		public TerminalNode CH_b() {
			return getToken(SkadiParser.CH_b, 0);
		}

		public TerminalNode CH_c() {
			return getToken(SkadiParser.CH_c, 0);
		}

		public TerminalNode CH_d() {
			return getToken(SkadiParser.CH_d, 0);
		}

		public TerminalNode CH_e() {
			return getToken(SkadiParser.CH_e, 0);
		}

		public TerminalNode CH_f() {
			return getToken(SkadiParser.CH_f, 0);
		}

		public TerminalNode CH_n() {
			return getToken(SkadiParser.CH_n, 0);
		}

		public TerminalNode CH_r() {
			return getToken(SkadiParser.CH_r, 0);
		}

		public TerminalNode CH_s() {
			return getToken(SkadiParser.CH_s, 0);
		}

		public TerminalNode CH_t() {
			return getToken(SkadiParser.CH_t, 0);
		}

		public TerminalNode CH_v() {
			return getToken(SkadiParser.CH_v, 0);
		}

		public TerminalNode CH_w() {
			return getToken(SkadiParser.CH_w, 0);
		}

		public TerminalNode CH_x() {
			return getToken(SkadiParser.CH_x, 0);
		}

		public TerminalNode CH_A() {
			return getToken(SkadiParser.CH_A, 0);
		}

		public TerminalNode CH_B() {
			return getToken(SkadiParser.CH_B, 0);
		}

		public TerminalNode CH_C() {
			return getToken(SkadiParser.CH_C, 0);
		}

		public TerminalNode CH_D() {
			return getToken(SkadiParser.CH_D, 0);
		}

		public TerminalNode CH_E() {
			return getToken(SkadiParser.CH_E, 0);
		}

		public TerminalNode CH_F() {
			return getToken(SkadiParser.CH_F, 0);
		}

		public TerminalNode CH_S() {
			return getToken(SkadiParser.CH_S, 0);
		}

		public TerminalNode CH_W() {
			return getToken(SkadiParser.CH_W, 0);
		}

		public TerminalNode CHAR() {
			return getToken(SkadiParser.CHAR, 0);
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
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).enterChar(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SkadiParserListener) ((SkadiParserListener) listener).exitChar(this);
		}
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(352);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 134217696L) != 0))) {
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
			"\u0004\u0001b\u0163\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
					"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
					"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
					"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
					"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
					"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
					"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
					"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b" +
					"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e" +
					"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001" +
					"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000L\b" +
					"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005" +
					"\u0001S\b\u0001\n\u0001\f\u0001V\t\u0001\u0001\u0002\u0001\u0002\u0001" +
					"\u0002\u0001\u0003\u0005\u0003\\\b\u0003\n\u0003\f\u0003_\t\u0003\u0001" +
					"\u0003\u0001\u0003\u0001\u0003\u0005\u0003d\b\u0003\n\u0003\f\u0003g\t" +
					"\u0003\u0001\u0004\u0001\u0004\u0005\u0004k\b\u0004\n\u0004\f\u0004n\t" +
					"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005s\b\u0005\n\u0005" +
					"\f\u0005v\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006{\b\u0006" +
					"\n\u0006\f\u0006~\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007" +
					"\u0001\u0007\u0005\u0007\u0085\b\u0007\n\u0007\f\u0007\u0088\t\u0007\u0001" +
					"\b\u0005\b\u008b\b\b\n\b\f\b\u008e\t\b\u0001\t\u0001\t\u0001\t\u0001\t" +
					"\u0001\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001" +
					"\n\u0003\n\u009d\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001" +
					"\f\u0001\f\u0004\f\u00a6\b\f\u000b\f\f\f\u00a7\u0001\f\u0001\f\u0001\f" +
					"\u0001\f\u0004\f\u00ae\b\f\u000b\f\f\f\u00af\u0001\f\u0001\f\u0001\f\u0001" +
					"\f\u0001\f\u0004\f\u00b7\b\f\u000b\f\f\f\u00b8\u0001\f\u0001\f\u0004\f" +
					"\u00bd\b\f\u000b\f\f\f\u00be\u0001\f\u0001\f\u0003\f\u00c3\b\f\u0001\r" +
					"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cd" +
					"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d3\b\r\u0001\u000e\u0001" +
					"\u000e\u0001\u000e\u0003\u000e\u00d8\b\u000e\u0001\u000f\u0001\u000f\u0001" +
					"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00df\b\u000f\u0001\u0010\u0001" +
					"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001" +
					"\u0013\u0001\u0013\u0005\u0013\u00ea\b\u0013\n\u0013\f\u0013\u00ed\t\u0013" +
					"\u0003\u0013\u00ef\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014" +
					"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015" +
					"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015" +
					"\u0001\u0015\u0003\u0015\u0102\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017" +
					"\u0001\u0017\u0003\u0017\u0108\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017" +
					"\u0001\u0018\u0001\u0018\u0003\u0018\u010f\b\u0018\u0001\u0019\u0001\u0019" +
					"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019" +
					"\u0001\u0019\u0003\u0019\u011a\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a" +
					"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a" +
					"\u0003\u001a\u0125\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0129\b" +
					"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001" +
					"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001" +
					"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001" +
					"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u013f\b\u001c\u0001\u001d\u0001" +
					"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0145\b\u001d\u0001\u001e\u0001" +
					"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u014d" +
					"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0153" +
					"\b\u001f\n\u001f\f\u001f\u0156\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001" +
					" \u0003 \u015d\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0000\u0000#\u0000" +
					"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c" +
					"\u001e \"$&(*,.02468:<>@BD\u0000\u0005\u0002\u0000\u001e\u001e$$\u0002" +
					"\u0000\u000b\r\u000f\u0010\u0002\u0000&&11\u0005\u0000\t\t\u000e\u000e" +
					"\u0011\u0011\u0016\u0016\u0019\u001a\u0001\u0000\u0005\u001a\u0197\u0000" +
					"F\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004W\u0001" +
					"\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000" +
					"\u0000\nt\u0001\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000e\u0081" +
					"\u0001\u0000\u0000\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u0094" +
					"\u0001\u0000\u0000\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016\u009e" +
					"\u0001\u0000\u0000\u0000\u0018\u00c2\u0001\u0000\u0000\u0000\u001a\u00d2" +
					"\u0001\u0000\u0000\u0000\u001c\u00d7\u0001\u0000\u0000\u0000\u001e\u00de" +
					"\u0001\u0000\u0000\u0000 \u00e0\u0001\u0000\u0000\u0000\"\u00e2\u0001" +
					"\u0000\u0000\u0000$\u00e4\u0001\u0000\u0000\u0000&\u00ee\u0001\u0000\u0000" +
					"\u0000(\u00f0\u0001\u0000\u0000\u0000*\u0101\u0001\u0000\u0000\u0000," +
					"\u0103\u0001\u0000\u0000\u0000.\u0105\u0001\u0000\u0000\u00000\u010e\u0001" +
					"\u0000\u0000\u00002\u0119\u0001\u0000\u0000\u00004\u0124\u0001\u0000\u0000" +
					"\u00006\u0128\u0001\u0000\u0000\u00008\u013e\u0001\u0000\u0000\u0000:" +
					"\u0144\u0001\u0000\u0000\u0000<\u0146\u0001\u0000\u0000\u0000>\u014c\u0001" +
					"\u0000\u0000\u0000@\u015c\u0001\u0000\u0000\u0000B\u015e\u0001\u0000\u0000" +
					"\u0000D\u0160\u0001\u0000\u0000\u0000FG\u0003\u0002\u0001\u0000GH\u0005" +
					"-\u0000\u0000HK\u0003\u0006\u0003\u0000IJ\u0005-\u0000\u0000JL\u0003\n" +
					"\u0005\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001" +
					"\u0000\u0000\u0000MN\u0005\u0000\u0000\u0001N\u0001\u0001\u0000\u0000" +
					"\u0000OS\u0005$\u0000\u0000PS\u0005\u001e\u0000\u0000QS\u0003\u0004\u0002" +
					"\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000" +
					"\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001" +
					"\u0000\u0000\u0000U\u0003\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000" +
					"\u0000WX\u0005%\u0000\u0000XY\u0003\f\u0006\u0000Y\u0005\u0001\u0000\u0000" +
					"\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000" +
					"\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001" +
					"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`e\u0003\b\u0004\u0000ad\u0003" +
					"\b\u0004\u0000bd\u0005\u001e\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001" +
					"\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000" +
					"ef\u0001\u0000\u0000\u0000f\u0007\u0001\u0000\u0000\u0000ge\u0001\u0000" +
					"\u0000\u0000hl\u0003\f\u0006\u0000ik\u0005$\u0000\u0000ji\u0001\u0000" +
					"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001" +
					"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000" +
					"op\u0005\u0001\u0000\u0000p\t\u0001\u0000\u0000\u0000qs\t\u0000\u0000" +
					"\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000" +
					"\u0000\u0000tu\u0001\u0000\u0000\u0000u\u000b\u0001\u0000\u0000\u0000" +
					"vt\u0001\u0000\u0000\u0000w|\u0003\u0010\b\u0000xy\u00050\u0000\u0000" +
					"y{\u0003\u0010\b\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000" +
					"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000" +
					"\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005,\u0000\u0000" +
					"\u0080\r\u0001\u0000\u0000\u0000\u0081\u0086\u0003\u0010\b\u0000\u0082" +
					"\u0083\u00050\u0000\u0000\u0083\u0085\u0003\u0010\b\u0000\u0084\u0082" +
					"\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084" +
					"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u000f" +
					"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b" +
					"\u0003\u0012\t\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001" +
					"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001" +
					"\u0000\u0000\u0000\u008d\u0011\u0001\u0000\u0000\u0000\u008e\u008c\u0001" +
					"\u0000\u0000\u0000\u008f\u0095\u0003\u001a\r\u0000\u0090\u0091\u0003\u001a" +
					"\r\u0000\u0091\u0092\u0003\u0016\u000b\u0000\u0092\u0095\u0001\u0000\u0000" +
					"\u0000\u0093\u0095\u0003\u0014\n\u0000\u0094\u008f\u0001\u0000\u0000\u0000" +
					"\u0094\u0090\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000" +
					"\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u009d\u0005\u001b\u0000\u0000" +
					"\u0097\u009d\u0005\"\u0000\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099" +
					"\u009d\u0005\u0007\u0000\u0000\u009a\u009b\u0005\u0002\u0000\u0000\u009b" +
					"\u009d\u0005\u0014\u0000\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c" +
					"\u0097\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c" +
					"\u009a\u0001\u0000\u0000\u0000\u009d\u0015\u0001\u0000\u0000\u0000\u009e" +
					"\u009f\u0003\u0018\f\u0000\u009f\u0017\u0001\u0000\u0000\u0000\u00a0\u00c3" +
					"\u0005.\u0000\u0000\u00a1\u00c3\u0005*\u0000\u0000\u00a2\u00c3\u0005+" +
					"\u0000\u0000\u00a3\u00a5\u0005 \u0000\u0000\u00a4\u00a6\u0003B!\u0000" +
					"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000" +
					"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000" +
					"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u001f\u0000\u0000" +
					"\u00aa\u00c3\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005 \u0000\u0000\u00ac" +
					"\u00ae\u0003B!\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001" +
					"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001" +
					"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005" +
					"\u001d\u0000\u0000\u00b2\u00b3\u0005\u001f\u0000\u0000\u00b3\u00c3\u0001" +
					"\u0000\u0000\u0000\u00b4\u00b6\u0005 \u0000\u0000\u00b5\u00b7\u0003B!" +
					"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000" +
					"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000" +
					"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\u001d\u0000" +
					"\u0000\u00bb\u00bd\u0003B!\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd" +
					"\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be" +
					"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0" +
					"\u00c1\u0005\u001f\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2" +
					"\u00a0\u0001\u0000\u0000\u0000\u00c2\u00a1\u0001\u0000\u0000\u0000\u00c2" +
					"\u00a2\u0001\u0000\u0000\u0000\u00c2\u00a3\u0001\u0000\u0000\u0000\u00c2" +
					"\u00ab\u0001\u0000\u0000\u0000\u00c2\u00b4\u0001\u0000\u0000\u0000\u00c3" +
					"\u0019\u0001\u0000\u0000\u0000\u00c4\u00d3\u0003@ \u0000\u00c5\u00d3\u0005" +
					"#\u0000\u0000\u00c6\u00c7\u0005\u0002\u0000\u0000\u00c7\u00d3\u0003\u001c" +
					"\u000e\u0000\u00c8\u00d3\u0003.\u0017\u0000\u00c9\u00cc\u0005(\u0000\u0000" +
					"\u00ca\u00cb\u0005+\u0000\u0000\u00cb\u00cd\u0005\u001c\u0000\u0000\u00cc" +
					"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd" +
					"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u000e\u0007\u0000\u00cf" +
					"\u00d0\u0005\'\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00d3" +
					"\u0003<\u001e\u0000\u00d2\u00c4\u0001\u0000\u0000\u0000\u00d2\u00c5\u0001" +
					"\u0000\u0000\u0000\u00d2\u00c6\u0001\u0000\u0000\u0000\u00d2\u00c8\u0001" +
					"\u0000\u0000\u0000\u00d2\u00c9\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001" +
					"\u0000\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003" +
					"&\u0013\u0000\u00d5\u00d8\u0003,\u0016\u0000\u00d6\u00d8\u0003\u001e\u000f" +
					"\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000" +
					"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u001d\u0001\u0000\u0000" +
					"\u0000\u00d9\u00df\u0003 \u0010\u0000\u00da\u00db\u0005\b\u0000\u0000" +
					"\u00db\u00df\u0003\"\u0011\u0000\u00dc\u00df\u0003(\u0014\u0000\u00dd" +
					"\u00df\u0003$\u0012\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00de\u00da" +
					"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd" +
					"\u0001\u0000\u0000\u0000\u00df\u001f\u0001\u0000\u0000\u0000\u00e0\u00e1" +
					"\u0007\u0001\u0000\u0000\u00e1!\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003" +
					"D\"\u0000\u00e3#\u0001\u0000\u0000\u0000\u00e4\u00e5\t\u0000\u0000\u0000" +
					"\u00e5%\u0001\u0000\u0000\u0000\u00e6\u00ef\u00051\u0000\u0000\u00e7\u00eb" +
					"\u0005&\u0000\u0000\u00e8\u00ea\u0007\u0002\u0000\u0000\u00e9\u00e8\u0001" +
					"\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001" +
					"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001" +
					"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00e6\u0001" +
					"\u0000\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000\u0000\u00ef\'\u0001\u0000" +
					"\u0000\u0000\u00f0\u00f1\u0005\u0012\u0000\u0000\u00f1\u00f2\u0003*\u0015" +
					"\u0000\u00f2\u00f3\u0003*\u0015\u0000\u00f3)\u0001\u0000\u0000\u0000\u00f4" +
					"\u0102\u0003B!\u0000\u00f5\u0102\u0005\u0006\u0000\u0000\u00f6\u0102\u0005" +
					"\u0007\u0000\u0000\u00f7\u0102\u0005\b\u0000\u0000\u00f8\u0102\u0005\t" +
					"\u0000\u0000\u00f9\u0102\u0005\n\u0000\u0000\u00fa\u0102\u0005\u000b\u0000" +
					"\u0000\u00fb\u0102\u0005\u0013\u0000\u0000\u00fc\u0102\u0005\u0014\u0000" +
					"\u0000\u00fd\u0102\u0005\u0015\u0000\u0000\u00fe\u0102\u0005\u0016\u0000" +
					"\u0000\u00ff\u0102\u0005\u0017\u0000\u0000\u0100\u0102\u0005\u0018\u0000" +
					"\u0000\u0101\u00f4\u0001\u0000\u0000\u0000\u0101\u00f5\u0001\u0000\u0000" +
					"\u0000\u0101\u00f6\u0001\u0000\u0000\u0000\u0101\u00f7\u0001\u0000\u0000" +
					"\u0000\u0101\u00f8\u0001\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000" +
					"\u0000\u0101\u00fa\u0001\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000" +
					"\u0000\u0101\u00fc\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000" +
					"\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000" +
					"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102+\u0001\u0000\u0000\u0000" +
					"\u0103\u0104\u0007\u0003\u0000\u0000\u0104-\u0001\u0000\u0000\u0000\u0105" +
					"\u0107\u0005\u0004\u0000\u0000\u0106\u0108\u0005\u001b\u0000\u0000\u0107" +
					"\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108" +
					"\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u00030\u0018\u0000\u010a\u010b" +
					"\u0005\u0003\u0000\u0000\u010b/\u0001\u0000\u0000\u0000\u010c\u010f\u0001" +
					"\u0000\u0000\u0000\u010d\u010f\u00032\u0019\u0000\u010e\u010c\u0001\u0000" +
					"\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f1\u0001\u0000\u0000" +
					"\u0000\u0110\u011a\u00036\u001b\u0000\u0111\u0112\u00036\u001b\u0000\u0112" +
					"\u0113\u00034\u001a\u0000\u0113\u011a\u0001\u0000\u0000\u0000\u0114\u0115" +
					"\u00036\u001b\u0000\u0115\u0116\u0005!\u0000\u0000\u0116\u0117\u00036" +
					"\u001b\u0000\u0117\u0118\u00030\u0018\u0000\u0118\u011a\u0001\u0000\u0000" +
					"\u0000\u0119\u0110\u0001\u0000\u0000\u0000\u0119\u0111\u0001\u0000\u0000" +
					"\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u011a3\u0001\u0000\u0000\u0000" +
					"\u011b\u0125\u00036\u001b\u0000\u011c\u011d\u00038\u001c\u0000\u011d\u011e" +
					"\u00034\u001a\u0000\u011e\u0125\u0001\u0000\u0000\u0000\u011f\u0120\u0003" +
					"8\u001c\u0000\u0120\u0121\u0005!\u0000\u0000\u0121\u0122\u00036\u001b" +
					"\u0000\u0122\u0123\u00030\u0018\u0000\u0123\u0125\u0001\u0000\u0000\u0000" +
					"\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011c\u0001\u0000\u0000\u0000" +
					"\u0124\u011f\u0001\u0000\u0000\u0000\u01255\u0001\u0000\u0000\u0000\u0126" +
					"\u0129\u0005!\u0000\u0000\u0127\u0129\u00038\u001c\u0000\u0128\u0126\u0001" +
					"\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u01297\u0001\u0000" +
					"\u0000\u0000\u012a\u012b\u0005\u0002\u0000\u0000\u012b\u013f\u0003:\u001d" +
					"\u0000\u012c\u013f\u0003B!\u0000\u012d\u013f\u0003D\"\u0000\u012e\u013f" +
					"\u0005)\u0000\u0000\u012f\u013f\u0005\u001d\u0000\u0000\u0130\u013f\u0005" +
					"\u001b\u0000\u0000\u0131\u013f\u00050\u0000\u0000\u0132\u013f\u0005\"" +
					"\u0000\u0000\u0133\u013f\u0005.\u0000\u0000\u0134\u013f\u0005*\u0000\u0000" +
					"\u0135\u013f\u0005#\u0000\u0000\u0136\u013f\u0005+\u0000\u0000\u0137\u013f" +
					"\u0005(\u0000\u0000\u0138\u013f\u0005\'\u0000\u0000\u0139\u013f\u0005" +
					" \u0000\u0000\u013a\u013f\u0005\u001f\u0000\u0000\u013b\u013f\u0005\u001c" +
					"\u0000\u0000\u013c\u013f\u0005\u0004\u0000\u0000\u013d\u013f\u0005/\u0000" +
					"\u0000\u013e\u012a\u0001\u0000\u0000\u0000\u013e\u012c\u0001\u0000\u0000" +
					"\u0000\u013e\u012d\u0001\u0000\u0000\u0000\u013e\u012e\u0001\u0000\u0000" +
					"\u0000\u013e\u012f\u0001\u0000\u0000\u0000\u013e\u0130\u0001\u0000\u0000" +
					"\u0000\u013e\u0131\u0001\u0000\u0000\u0000\u013e\u0132\u0001\u0000\u0000" +
					"\u0000\u013e\u0133\u0001\u0000\u0000\u0000\u013e\u0134\u0001\u0000\u0000" +
					"\u0000\u013e\u0135\u0001\u0000\u0000\u0000\u013e\u0136\u0001\u0000\u0000" +
					"\u0000\u013e\u0137\u0001\u0000\u0000\u0000\u013e\u0138\u0001\u0000\u0000" +
					"\u0000\u013e\u0139\u0001\u0000\u0000\u0000\u013e\u013a\u0001\u0000\u0000" +
					"\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000" +
					"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f9\u0001\u0000\u0000\u0000" +
					"\u0140\u0145\u0003&\u0013\u0000\u0141\u0145\u0005\u0007\u0000\u0000\u0142" +
					"\u0145\u0003,\u0016\u0000\u0143\u0145\u0003\u001e\u000f\u0000\u0144\u0140" +
					"\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0144\u0142" +
					"\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145;\u0001" +
					"\u0000\u0000\u0000\u0146\u0147\u0005 \u0000\u0000\u0147\u0148\u0003>\u001f" +
					"\u0000\u0148\u0149\u0005\u001f\u0000\u0000\u0149=\u0001\u0000\u0000\u0000" +
					"\u014a\u014d\u0005/\u0000\u0000\u014b\u014d\u0003D\"\u0000\u014c\u014a" +
					"\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0154" +
					"\u0001\u0000\u0000\u0000\u014e\u0153\u0003D\"\u0000\u014f\u0153\u0003" +
					"B!\u0000\u0150\u0153\u0005/\u0000\u0000\u0151\u0153\u0005!\u0000\u0000" +
					"\u0152\u014e\u0001\u0000\u0000\u0000\u0152\u014f\u0001\u0000\u0000\u0000" +
					"\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000" +
					"\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000" +
					"\u0154\u0155\u0001\u0000\u0000\u0000\u0155?\u0001\u0000\u0000\u0000\u0156" +
					"\u0154\u0001\u0000\u0000\u0000\u0157\u015d\u0003B!\u0000\u0158\u015d\u0003" +
					"D\"\u0000\u0159\u015d\u0005)\u0000\u0000\u015a\u015d\u0005\u001d\u0000" +
					"\u0000\u015b\u015d\u0005\u001c\u0000\u0000\u015c\u0157\u0001\u0000\u0000" +
					"\u0000\u015c\u0158\u0001\u0000\u0000\u0000\u015c\u0159\u0001\u0000\u0000" +
					"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000\u0000" +
					"\u0000\u015dA\u0001\u0000\u0000\u0000\u015e\u015f\u0007\u0002\u0000\u0000" +
					"\u015fC\u0001\u0000\u0000\u0000\u0160\u0161\u0007\u0004\u0000\u0000\u0161" +
					"E\u0001\u0000\u0000\u0000$KRT]celt|\u0086\u008c\u0094\u009c\u00a7\u00af" +
					"\u00b8\u00be\u00c2\u00cc\u00d2\u00d7\u00de\u00eb\u00ee\u0101\u0107\u010e" +
					"\u0119\u0124\u0128\u013e\u0144\u014c\u0152\u0154\u015c";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}