parser grammar SkadiFileParser;

options {
    tokenVocab = SkadiFileLexer;
}

file
    : definition* EOF
    ;

definition
    : copy_definition
    | fragment_definition
    | automaton_definition
    | action_definition
    ;

copy_definition
    : COPY CURLY_OPEN HOST_CODE* CURLY_CLOSED
    ;

fragment_definition
    : FRAGMENT ID EQUAL REGEX
    ;

automaton_definition
    : AUTOMATON ID EQUAL REGEX
    ;

action_definition
    : enter_action
    | progress_action
    | finish_action
    ;

enter_action
    : ENTER locator CURLY_OPEN HOST_CODE* CURLY_CLOSED
    ;

progress_action
    : PROGRESS locator CURLY_OPEN HOST_CODE* CURLY_CLOSED
    ;

finish_action
    : FINISH locator CURLY_OPEN HOST_CODE* CURLY_CLOSED
    ;

locator
    : ID(PERIOD ID)*
    ;