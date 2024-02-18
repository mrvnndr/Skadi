parser grammar SkadiParser;

options {
    tokenVocab = SkadiLexer;
}

file
    : definitions_section SECTION_SEP rules (SECTION_SEP user_code)? EOF
    ;

definitions_section
    : (HOST_CODE | COMMENT | definition)*
    ;

definition
    : NAME regex
    ;

rules
    : (HOST_CODE | COMMENT)* rule (rule | COMMENT)*
    ;

rule
    : regex HOST_CODE* ACTION_END
    ;

user_code
    : .*
    ;

//Everything below here is the regex grammar closely aligned to the ECMAScript standard (ES7) but with a few additions
//and omissions appropriate for the use case
//--------------------------------------------------------------------------------------
regex
    : alternative (VERT_BAR alternative)* REGEX_END
    ;

inner_regex
    : alternative (VERT_BAR alternative)*
    ;

alternative
    : term*
    ;

term
    : atom            # atomBase
    | atom quantifier # atomQuantifier
    | assertion       # atomAssertion
    ;

assertion //Lookahead is not supported
    : CIRCUMFLEX
    | DOLLAR
    | BACKSLASH CH_b
    | BACKSLASH CH_B
    ;

quantifier //Lazy missing
    : quantifier_prefix
    ;

quantifier_prefix
    : STAR                                                            # quantifierStar
    | PLUS                                                            # quantifierPlus
    | QUESTION_MARK                                                   # quantifierQuestionMark
    | CURLY_OPEN digit+ CURLY_CLOSED                                  # quantifierExactly
    | CURLY_OPEN digit+ COMMA CURLY_CLOSED                            # quantifierAtLeast
    | CURLY_OPEN (amtL += digit)+ COMMA (amtH += digit)+ CURLY_CLOSED # quantifierBetween
    ;

atom
    : pattern_char                                               # atomPatternChar
    | DOT                                                        # atomDot
    | BACKSLASH atom_escape                                      # atomAtomEscape
    | character_class                                            # atomCharacterClass
    | PAREN_OPEN (QUESTION_MARK COLON)? inner_regex PAREN_CLOSED # atomParenRegex
    | rule_reference                                             # atomRuleReference //Extension to support rule reuse
    ;

atom_escape
    : decimal_escape
    | character_class_escape
    | character_escape
    ;

character_escape
    : control_escape
    | CH_c control_letter
    | hex_escape_sequence
    | identity_escape
    ;

control_escape
    : CH_f
    | CH_n
    | CH_r
    | CH_t
    | CH_v
    ;

control_letter
    : char
    ;

identity_escape
    : .
    ;

decimal_escape
    : ZERO
    | NON_ZERO_DIGIT (ZERO | NON_ZERO_DIGIT)*
    ;

hex_escape_sequence
    : CH_x hex_digit hex_digit
    ;

hex_digit
    : digit
    | CH_a
    | CH_b
    | CH_c
    | CH_d
    | CH_e
    | CH_f
    | CH_A
    | CH_B
    | CH_C
    | CH_D
    | CH_E
    | CH_F
    ;

character_class_escape
    : CH_d
    | CH_D
    | CH_s
    | CH_S
    | CH_w
    | CH_W
    ;

character_class
    : BRACKET_OPEN CIRCUMFLEX? class_ranges BRACKET_CLOSED
    ;

class_ranges
    :
    | non_empty_class_ranges
    ;

non_empty_class_ranges
    : class_atom
    | class_atom non_empty_class_ranges_no_dash
    | from = class_atom DASH to = class_atom class_ranges
    ;

non_empty_class_ranges_no_dash
    : class_atom
    | class_atom_no_dash non_empty_class_ranges_no_dash
    | from = class_atom_no_dash DASH to = class_atom class_ranges
    ;

class_atom
    : DASH
    | class_atom_no_dash
    ;

class_atom_no_dash
    : BACKSLASH class_escape
    | digit
    | char
    | PATTERN_CHAR
    | COMMA
    | CIRCUMFLEX
    | VERT_BAR
    | DOLLAR
    | STAR
    | PLUS
    | DOT
    | QUESTION_MARK
    | PAREN_OPEN
    | PAREN_CLOSED
    | CURLY_OPEN
    | CURLY_CLOSED
    | COLON
    | BRACKET_OPEN
    | UNDERSCORE
    ;

class_escape
    : decimal_escape
    | CH_b
    | character_class_escape
    | character_escape
    ;

rule_reference
    : CURLY_OPEN rule_name CURLY_CLOSED
    ;

rule_name
    : (UNDERSCORE | char) (char | digit | UNDERSCORE | DASH)*
    ;

pattern_char
    : digit
    | char
    | PATTERN_CHAR
    | COMMA
    | COLON
    ;

digit
    : ZERO
    | NON_ZERO_DIGIT
    ;

//Helper to handle all the different char tokens
char
    : CH_a
    | CH_b
    | CH_c
    | CH_d
    | CH_e
    | CH_f
    | CH_n
    | CH_r
    | CH_s
    | CH_t
    | CH_v
    | CH_w
    | CH_x
    | CH_A
    | CH_B
    | CH_C
    | CH_D
    | CH_E
    | CH_F
    | CH_S
    | CH_W
    | CHAR
    ;