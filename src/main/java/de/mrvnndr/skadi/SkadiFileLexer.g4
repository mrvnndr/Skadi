lexer grammar SkadiFileLexer;

tokens {
    HOST_CODE,
    CURLY_CLOSED
}

REGEX     : '"' ~[\r\n]*? '"' WS_NO_BREAK* LINEBREAK;
COPY      : 'copy';
FRAGMENT  : 'fragment';
AUTOMATON : 'automaton';
ENTER     : 'enter';
PROGRESS  : 'progress';
FINISH    : 'finish';

CURLY_OPEN : '{' -> pushMode(CODE);
EQUAL      : '=';
PERIOD     : '.';
ID         : [_a-zA-Z][_a-zA-Z0-9]*;
WS         : [ \t\r\n]+ -> skip;

mode CODE;
CODE_COMMENT       : VHDL_COMMENT -> type(HOST_CODE);
CODE_BLOCK_COMMENT : C_COMMENT    -> type(HOST_CODE);
CODE_STRING        : STRING       -> type(HOST_CODE);
CODE_CURLY         : '{'          -> type(HOST_CODE), pushMode(NESTED_CURLY_CODE);
CODE_END           : '}'          -> type(CURLY_CLOSED), popMode;
CODE_ACTION_CODE   : ~[-{}"/]+    -> type(HOST_CODE);
CODE_SINGLE_CHAR   : [-/]         -> type(HOST_CODE);

mode NESTED_CURLY_CODE;
NC_COMMENT       : VHDL_COMMENT -> type(HOST_CODE);
NC_BLOCK_COMMENT : C_COMMENT    -> type(HOST_CODE);
NC_STRING        : STRING       -> type(HOST_CODE);
NC_NEW           : '{'          -> pushMode(NESTED_CURLY_CODE), type(HOST_CODE);
NC_END           : '}'          -> popMode, type(HOST_CODE);
NC_ACTION_CODE   : ~[-{}"/]+    -> type(HOST_CODE);
NC_SINGLE_CHAR   : [-/]         -> type(HOST_CODE);

fragment LINEBREAK    : '\n' | '\r\n';
fragment VHDL_COMMENT : '--' .*? LINEBREAK;
fragment C_COMMENT    : '/*' .*? '*/';
fragment WS_NO_BREAK  : [ \t]+;

fragment BASIC_STRING : '"' .*? '"';
fragment STRING       : BASIC_STRING (WS_NO_BREAK '&' WS_NO_BREAK LINEBREAK WS_NO_BREAK BASIC_STRING)*;