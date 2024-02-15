lexer grammar SkadiLexer;

tokens {
    ACTION_END,
    BACKSLASH,
    BRACKET_CLOSED,
    BRACKET_OPEN,
    CHAR,
    CH_a,
    CH_b,
    CH_c,
    CH_d,
    CH_e,
    CH_f,
    CH_n,
    CH_r,
    CH_s,
    CH_t,
    CH_v,
    CH_w,
    CH_x,
    CH_A,
    CH_B,
    CH_C,
    CH_D,
    CH_E,
    CH_F,
    CH_S,
    CH_W,
    CIRCUMFLEX,
    COLON,
    COMMA,
    COMMENT,
    CURLY_CLOSED,
    CURLY_OPEN,
    DASH,
    DOLLAR,
    DOT,
    HOST_CODE,
    NAME,
    NON_ZERO_DIGIT,
    PAREN_CLOSED,
    PAREN_OPEN,
    PATTERN_CHAR,
    PLUS,
    QUESTION_MARK,
    REGEX_END,
    SECTION_SEP,
    STAR,
    UNDERLINE,
    VERT_BAR,
    ZERO
}

//Default mode scans the definitions section
DEF_WS_NB      : WS_NO_BREAK    -> skip, pushMode(INDENTED_CODE);
DEF_COMMENT    : C_COMMENT      -> type(COMMENT);
DEF_CODE_START : '%{' LINEBREAK -> skip, pushMode(USER_CODE);
DEF_NAME       : NAME           -> type(NAME), pushMode(EXPECT_DEFINITION);
DEF_SEP        : '%%' LINEBREAK -> type(SECTION_SEP), mode(REGEX_RULES);
DEF_NEW_LINE   : LINEBREAK      -> skip;

//Indented codes in definition section, copied verbatim to output
mode INDENTED_CODE;
IC_NEW_LINE : LINEBREAK -> skip, popMode;
IC_ANY      : ~[\r\n]+  -> type(HOST_CODE);

//Code between %{ and %} in definition section, copied verbatim to output
mode USER_CODE;
UC_COMMENT     : VHDL_COMMENT   -> type(HOST_CODE);
UC_STRING      : STRING         -> type(HOST_CODE);
UC_END         : '%}' LINEBREAK -> skip, popMode;
UC_ACTION_CODE : ~[-"%]+        -> type(HOST_CODE);

//A definition name was read, now expecting the associated regex
mode EXPECT_DEFINITION;
ED_WS : WS_NO_BREAK -> skip, mode(REGEX);
ED_LB : LINEBREAK   -> type(REGEX_END), popMode;

//Code in third (user code) section, copied verbatim to output
mode ANYTHING;
ANYTHING: .+ -> type(HOST_CODE);

//In the rules section the regex was read, now expecting the associated action code
mode EXPECT_ACTION;
EA_VERT_BAR   : '|' WS_NO_BREAK? -> type(VERT_BAR), mode(REGEX_RULES);
EA_PERC_CURLY : '%{'             -> skip, mode(PERC_CURLY_ACTION);
EA_CURLY      : '{'              -> skip, mode(CURLY_ACTION);
EA_NEW_LINE   : LINEBREAK        -> type(ACTION_END), mode(REGEX_RULES);
EA_OTHER      : ~[\r\n]+         -> type(HOST_CODE);

//Action code in the rules section initiated with a curly brace
mode CURLY_ACTION;
CA_COMMENT     : VHDL_COMMENT               -> type(HOST_CODE);
CA_STRING      : STRING                     -> type(HOST_CODE);
CA_CURLY       : '{'                        -> type(HOST_CODE), pushMode(NESTED_CURLY);
CA_END         : '}' WS_NO_BREAK* LINEBREAK -> type(ACTION_END), mode(REGEX_RULES);
CA_ACTION_CODE : ~[-{}"]+                   -> type(HOST_CODE);

//Used for counting curly braces in the action code in the rules section
mode NESTED_CURLY;
NC_COMMENT     : VHDL_COMMENT -> type(HOST_CODE);
NC_STRING      : STRING       -> type(HOST_CODE);
NC_NEW         : '{'          -> pushMode(NESTED_CURLY), type(HOST_CODE);
NC_END         : '}'          -> popMode, type(HOST_CODE);
NC_ACTION_CODE : ~[-{}"]+     -> type(HOST_CODE);

//Action code in the rules section initiated with %{
mode PERC_CURLY_ACTION;
PCA_COMMENT     : VHDL_COMMENT                -> type(HOST_CODE);
PCA_STRING      : STRING                      -> type(HOST_CODE);
PCA_END         : '%}' WS_NO_BREAK* LINEBREAK -> type(ACTION_END), mode(REGEX_RULES);
PCA_ACTION_CODE : ~[-"%]+                     -> type(HOST_CODE);

//Regex in the definitions section
mode REGEX;
REGEX_NEW_LINE : LINEBREAK      -> type(REGEX_END), popMode;
REGEX_ZERO     : ZERO           -> type(ZERO);
REGEX_NON_ZERO : NON_ZERO_DIGIT -> type(NON_ZERO_DIGIT);

REGEX_a : 'a' -> type(CH_a);
REGEX_b : 'b' -> type(CH_b);
REGEX_c : 'c' -> type(CH_c);
REGEX_d : 'd' -> type(CH_d);
REGEX_e : 'e' -> type(CH_e);
REGEX_f : 'f' -> type(CH_f);
REGEX_n : 'n' -> type(CH_n);
REGEX_r : 'r' -> type(CH_r);
REGEX_s : 's' -> type(CH_s);
REGEX_t : 't' -> type(CH_t);
REGEX_v : 'v' -> type(CH_v);
REGEX_w : 'w' -> type(CH_w);
REGEX_x : 'x' -> type(CH_x);

REGEX_A : 'A' -> type(CH_A);
REGEX_B : 'B' -> type(CH_B);
REGEX_C : 'C' -> type(CH_C);
REGEX_D : 'D' -> type(CH_D);
REGEX_E : 'E' -> type(CH_E);
REGEX_F : 'F' -> type(CH_F);
REGEX_S : 'S' -> type(CH_S);
REGEX_W : 'W' -> type(CH_W);

REGEX_PAREN_OPEN     : '('          -> type(PAREN_OPEN);
REGEX_PAREN_CLOSED   : ')'          -> type(PAREN_CLOSED);
REGEX_CURLY_OPEN     : '{'          -> type(CURLY_OPEN);
REGEX_CURLY_CLOSED   : '}'          -> type(CURLY_CLOSED);
REGEX_BRACKET_OPEN   : '['          -> type(BRACKET_OPEN);
REGEX_BRACKET_CLOSED : ']'          -> type(BRACKET_CLOSED);
REGEX_CIRCUMFLEX     : '^'          -> type(CIRCUMFLEX);
REGEX_DASH           : '-'          -> type(DASH);
REGEX_UNDERLINE      : '_'          -> type(UNDERLINE);
REGEX_STAR           : '*'          -> type(STAR);
REGEX_BACKSLASH      : '\\'         -> type(BACKSLASH);
REGEX_DOT            : '.'          -> type(DOT);
REGEX_COMMA          : ','          -> type(COMMA);
REGEX_DOLLAR         : '$'          -> type(DOLLAR);
REGEX_PLUS           : '+'          -> type(PLUS);
REGEX_COLON          : ':'          -> type(COLON);
REGEX_QUESTION_MARK  : '?'          -> type(QUESTION_MARK);
REGEX_VERT_BAR       : '|'          -> type(VERT_BAR);
REGEX_CHAR           : CHAR         -> type(CHAR);
REGEX_PATTERN_CHAR   : PATTERN_CHAR -> type(PATTERN_CHAR);

//Default mode for the rules section, must also be able to read regex as a line in this section may start with one
mode REGEX_RULES;
REGEX_RULES_WS_NB      : WS_NO_BREAK    -> skip, pushMode(INDENTED_CODE);
REGEX_RULES_COMMENT    : C_COMMENT      -> type(COMMENT);
REGEX_RULES_CODE_START : '%{' LINEBREAK -> skip, pushMode(USER_CODE);
REGEX_RULES_SEP        : '%%' LINEBREAK -> type(SECTION_SEP), mode(ANYTHING);
REGEX_RULES_NEW_LINE   : LINEBREAK      -> skip;

REGEX_RULES_ZERO     : ZERO           -> type(ZERO), mode(REGEX_LOCK);
REGEX_RULES_NON_ZERO : NON_ZERO_DIGIT -> type(NON_ZERO_DIGIT), mode(REGEX_LOCK);

REGEX_RULES_a : 'a' -> type(CH_a), mode(REGEX_LOCK);
REGEX_RULES_b : 'b' -> type(CH_b), mode(REGEX_LOCK);
REGEX_RULES_c : 'c' -> type(CH_c), mode(REGEX_LOCK);
REGEX_RULES_d : 'd' -> type(CH_d), mode(REGEX_LOCK);
REGEX_RULES_e : 'e' -> type(CH_e), mode(REGEX_LOCK);
REGEX_RULES_f : 'f' -> type(CH_f), mode(REGEX_LOCK);
REGEX_RULES_n : 'n' -> type(CH_n), mode(REGEX_LOCK);
REGEX_RULES_r : 'r' -> type(CH_r), mode(REGEX_LOCK);
REGEX_RULES_s : 's' -> type(CH_s), mode(REGEX_LOCK);
REGEX_RULES_t : 't' -> type(CH_t), mode(REGEX_LOCK);
REGEX_RULES_v : 'v' -> type(CH_v), mode(REGEX_LOCK);
REGEX_RULES_w : 'w' -> type(CH_w), mode(REGEX_LOCK);
REGEX_RULES_x : 'x' -> type(CH_x), mode(REGEX_LOCK);

REGEX_RULES_A : 'A' -> type(CH_A), mode(REGEX_LOCK);
REGEX_RULES_B : 'B' -> type(CH_B), mode(REGEX_LOCK);
REGEX_RULES_C : 'C' -> type(CH_C), mode(REGEX_LOCK);
REGEX_RULES_D : 'D' -> type(CH_D), mode(REGEX_LOCK);
REGEX_RULES_E : 'E' -> type(CH_E), mode(REGEX_LOCK);
REGEX_RULES_F : 'F' -> type(CH_F), mode(REGEX_LOCK);
REGEX_RULES_S : 'S' -> type(CH_S), mode(REGEX_LOCK);
REGEX_RULES_W : 'W' -> type(CH_W), mode(REGEX_LOCK);

REGEX_RULES_PAREN_OPEN     : '('          -> type(PAREN_OPEN), mode(REGEX_LOCK);
REGEX_RULES_PAREN_CLOSED   : ')'          -> type(PAREN_CLOSED), mode(REGEX_LOCK);
REGEX_RULES_CURLY_OPEN     : '{'          -> type(CURLY_OPEN), mode(REGEX_LOCK);
REGEX_RULES_CURLY_CLOSED   : '}'          -> type(CURLY_CLOSED), mode(REGEX_LOCK);
REGEX_RULES_BRACKET_OPEN   : '['          -> type(BRACKET_OPEN), mode(REGEX_LOCK);
REGEX_RULES_BRACKET_CLOSED : ']'          -> type(BRACKET_CLOSED), mode(REGEX_LOCK);
REGEX_RULES_CIRCUMFLEX     : '^'          -> type(CIRCUMFLEX), mode(REGEX_LOCK);
REGEX_RULES_DASH           : '-'          -> type(DASH), mode(REGEX_LOCK);
REGEX_RULES_UNDERLINE      : '_'          -> type(UNDERLINE), mode(REGEX_LOCK);
REGEX_RULES_STAR           : '*'          -> type(STAR), mode(REGEX_LOCK);
REGEX_RULES_BACKSLASH      : '\\'         -> type(BACKSLASH), mode(REGEX_LOCK);
REGEX_RULES_DOT            : '.'          -> type(DOT), mode(REGEX_LOCK);
REGEX_RULES_COMMA          : ','          -> type(COMMA), mode(REGEX_LOCK);
REGEX_RULES_DOLLAR         : '$'          -> type(DOLLAR), mode(REGEX_LOCK);
REGEX_RULES_PLUS           : '+'          -> type(PLUS), mode(REGEX_LOCK);
REGEX_RULES_COLON          : ':'          -> type(COLON), mode(REGEX_LOCK);
REGEX_RULES_QUESTION_MARK  : '?'          -> type(QUESTION_MARK), mode(REGEX_LOCK);
REGEX_RULES_VERT_BAR       : '|'          -> type(VERT_BAR), mode(REGEX_LOCK);
REGEX_RULES_CHAR           : CHAR         -> type(CHAR), mode(REGEX_LOCK);
REGEX_RULES_PATTERN_CHAR   : PATTERN_CHAR -> type(PATTERN_CHAR), mode(REGEX_LOCK);

//In the rules section the first symbol of a regex was read, continue to read regex until whitespace
mode REGEX_LOCK;
REGEX_LOCK_NEW_LINE : LINEBREAK      -> type(REGEX_END), mode(REGEX_RULES);
REGEX_LOCK_WS_NB    : WS_NO_BREAK    -> type(REGEX_END), mode(EXPECT_ACTION);
REGEX_LOCK_ZERO     : ZERO           -> type(ZERO);
REGEX_LOCK_NON_ZERO : NON_ZERO_DIGIT -> type(NON_ZERO_DIGIT);

REGEX_LOCK_a : 'a' -> type(CH_a);
REGEX_LOCK_b : 'b' -> type(CH_b);
REGEX_LOCK_c : 'c' -> type(CH_c);
REGEX_LOCK_d : 'd' -> type(CH_d);
REGEX_LOCK_e : 'e' -> type(CH_e);
REGEX_LOCK_f : 'f' -> type(CH_f);
REGEX_LOCK_n : 'n' -> type(CH_n);
REGEX_LOCK_r : 'r' -> type(CH_r);
REGEX_LOCK_s : 's' -> type(CH_s);
REGEX_LOCK_t : 't' -> type(CH_t);
REGEX_LOCK_v : 'v' -> type(CH_v);
REGEX_LOCK_w : 'w' -> type(CH_w);
REGEX_LOCK_x : 'x' -> type(CH_x);

REGEX_LOCK_A : 'A' -> type(CH_A);
REGEX_LOCK_B : 'B' -> type(CH_B);
REGEX_LOCK_C : 'C' -> type(CH_C);
REGEX_LOCK_D : 'D' -> type(CH_D);
REGEX_LOCK_E : 'E' -> type(CH_E);
REGEX_LOCK_F : 'F' -> type(CH_F);
REGEX_LOCK_S : 'S' -> type(CH_S);
REGEX_LOCK_W : 'W' -> type(CH_W);

REGEX_LOCK_PAREN_OPEN     : '('          -> type(PAREN_OPEN);
REGEX_LOCK_PAREN_CLOSED   : ')'          -> type(PAREN_CLOSED);
REGEX_LOCK_CURLY_OPEN     : '{'          -> type(CURLY_OPEN);
REGEX_LOCK_CURLY_CLOSED   : '}'          -> type(CURLY_CLOSED);
REGEX_LOCK_BRACKET_OPEN   : '['          -> type(BRACKET_OPEN);
REGEX_LOCK_BRACKET_CLOSED : ']'          -> type(BRACKET_CLOSED);
REGEX_LOCK_CIRCUMFLEX     : '^'          -> type(CIRCUMFLEX);
REGEX_LOCK_DASH           : '-'          -> type(DASH);
REGEX_LOCK_UNDERLINE      : '_'          -> type(UNDERLINE);
REGEX_LOCK_STAR           : '*'          -> type(STAR);
REGEX_LOCK_BACKSLASH      : '\\'         -> type(BACKSLASH);
REGEX_LOCK_DOT            : '.'          -> type(DOT);
REGEX_LOCK_COMMA          : ','          -> type(COMMA);
REGEX_LOCK_DOLLAR         : '$'          -> type(DOLLAR);
REGEX_LOCK_PLUS           : '+'          -> type(PLUS);
REGEX_LOCK_COLON          : ':'          -> type(COLON);
REGEX_LOCK_QUESTION_MARK  : '?'          -> type(QUESTION_MARK);
REGEX_LOCK_VERT_BAR       : '|'          -> type(VERT_BAR);
REGEX_LOCK_CHAR           : CHAR         -> type(CHAR);
REGEX_LOCK_PATTERN_CHAR   : PATTERN_CHAR -> type(PATTERN_CHAR);

fragment CHAR           : [A-Za-z];
fragment ZERO           : '0';
fragment NON_ZERO_DIGIT : [1-9];
fragment PATTERN_CHAR   : ~[\\.*+?()[\]{}|^$];

fragment NAME: (CHAR | '_') (CHAR | [0-9] | '_' | '-')*;

fragment LINEBREAK    : '\n' | '\r\n';
fragment VHDL_COMMENT : '--' .*? LINEBREAK;
fragment C_COMMENT    : '/*' .*? '*/';
fragment WS_NO_BREAK  : [ \t]+;

fragment BASIC_STRING : '"' .*? '"';
fragment STRING       : BASIC_STRING (WS_NO_BREAK '&' WS_NO_BREAK LINEBREAK WS_NO_BREAK BASIC_STRING)*;