package de.mrvnndr.skadi.analysis;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SkadiParser}.
 */
public interface SkadiParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link SkadiParser#file}.
     *
     * @param ctx the parse tree
     */
    void enterFile(SkadiParser.FileContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#file}.
     *
     * @param ctx the parse tree
     */
    void exitFile(SkadiParser.FileContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#definitions_section}.
     *
     * @param ctx the parse tree
     */
    void enterDefinitions_section(SkadiParser.Definitions_sectionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#definitions_section}.
     *
     * @param ctx the parse tree
     */
    void exitDefinitions_section(SkadiParser.Definitions_sectionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#definition}.
     *
     * @param ctx the parse tree
     */
    void enterDefinition(SkadiParser.DefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#definition}.
     *
     * @param ctx the parse tree
     */
    void exitDefinition(SkadiParser.DefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#rules}.
     *
     * @param ctx the parse tree
     */
    void enterRules(SkadiParser.RulesContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#rules}.
     *
     * @param ctx the parse tree
     */
    void exitRules(SkadiParser.RulesContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#rule}.
     *
     * @param ctx the parse tree
     */
    void enterRule(SkadiParser.RuleContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#rule}.
     *
     * @param ctx the parse tree
     */
    void exitRule(SkadiParser.RuleContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#user_code}.
     *
     * @param ctx the parse tree
     */
    void enterUser_code(SkadiParser.User_codeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#user_code}.
     *
     * @param ctx the parse tree
     */
    void exitUser_code(SkadiParser.User_codeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#regex}.
     *
     * @param ctx the parse tree
     */
    void enterRegex(SkadiParser.RegexContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#regex}.
     *
     * @param ctx the parse tree
     */
    void exitRegex(SkadiParser.RegexContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#inner_regex}.
     *
     * @param ctx the parse tree
     */
    void enterInner_regex(SkadiParser.Inner_regexContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#inner_regex}.
     *
     * @param ctx the parse tree
     */
    void exitInner_regex(SkadiParser.Inner_regexContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#alternative}.
     *
     * @param ctx the parse tree
     */
    void enterAlternative(SkadiParser.AlternativeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#alternative}.
     *
     * @param ctx the parse tree
     */
    void exitAlternative(SkadiParser.AlternativeContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomBase}
     * labeled alternative in {@link SkadiParser#term}.
     *
     * @param ctx the parse tree
     */
    void enterAtomBase(SkadiParser.AtomBaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomBase}
     * labeled alternative in {@link SkadiParser#term}.
     *
     * @param ctx the parse tree
     */
    void exitAtomBase(SkadiParser.AtomBaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomQuantifier}
     * labeled alternative in {@link SkadiParser#term}.
     *
     * @param ctx the parse tree
     */
    void enterAtomQuantifier(SkadiParser.AtomQuantifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomQuantifier}
     * labeled alternative in {@link SkadiParser#term}.
     *
     * @param ctx the parse tree
     */
    void exitAtomQuantifier(SkadiParser.AtomQuantifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomAssertion}
     * labeled alternative in {@link SkadiParser#term}.
     *
     * @param ctx the parse tree
     */
    void enterAtomAssertion(SkadiParser.AtomAssertionContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomAssertion}
     * labeled alternative in {@link SkadiParser#term}.
     *
     * @param ctx the parse tree
     */
    void exitAtomAssertion(SkadiParser.AtomAssertionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#assertion}.
     *
     * @param ctx the parse tree
     */
    void enterAssertion(SkadiParser.AssertionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#assertion}.
     *
     * @param ctx the parse tree
     */
    void exitAssertion(SkadiParser.AssertionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#quantifier}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifier(SkadiParser.QuantifierContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#quantifier}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifier(SkadiParser.QuantifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierStar}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierStar(SkadiParser.QuantifierStarContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierStar}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierStar(SkadiParser.QuantifierStarContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierPlus}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierPlus(SkadiParser.QuantifierPlusContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierPlus}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierPlus(SkadiParser.QuantifierPlusContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierQuestionMark}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierQuestionMark(SkadiParser.QuantifierQuestionMarkContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierQuestionMark}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierQuestionMark(SkadiParser.QuantifierQuestionMarkContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierExactly}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierExactly(SkadiParser.QuantifierExactlyContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierExactly}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierExactly(SkadiParser.QuantifierExactlyContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierAtLeast}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierAtLeast(SkadiParser.QuantifierAtLeastContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierAtLeast}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierAtLeast(SkadiParser.QuantifierAtLeastContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierBetween}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierBetween(SkadiParser.QuantifierBetweenContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierBetween}
     * labeled alternative in {@link SkadiParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierBetween(SkadiParser.QuantifierBetweenContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomPatternChar}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomPatternChar(SkadiParser.AtomPatternCharContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomPatternChar}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomPatternChar(SkadiParser.AtomPatternCharContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomDot}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomDot(SkadiParser.AtomDotContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomDot}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomDot(SkadiParser.AtomDotContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomAtomEscape}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomAtomEscape(SkadiParser.AtomAtomEscapeContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomAtomEscape}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomAtomEscape(SkadiParser.AtomAtomEscapeContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomCharacterClass}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomCharacterClass(SkadiParser.AtomCharacterClassContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomCharacterClass}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomCharacterClass(SkadiParser.AtomCharacterClassContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomParenRegex}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomParenRegex(SkadiParser.AtomParenRegexContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomParenRegex}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomParenRegex(SkadiParser.AtomParenRegexContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomRuleReference}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomRuleReference(SkadiParser.AtomRuleReferenceContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomRuleReference}
     * labeled alternative in {@link SkadiParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomRuleReference(SkadiParser.AtomRuleReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#atom_escape}.
     *
     * @param ctx the parse tree
     */
    void enterAtom_escape(SkadiParser.Atom_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#atom_escape}.
     *
     * @param ctx the parse tree
     */
    void exitAtom_escape(SkadiParser.Atom_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#character_escape}.
     *
     * @param ctx the parse tree
     */
    void enterCharacter_escape(SkadiParser.Character_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#character_escape}.
     *
     * @param ctx the parse tree
     */
    void exitCharacter_escape(SkadiParser.Character_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#control_escape}.
     *
     * @param ctx the parse tree
     */
    void enterControl_escape(SkadiParser.Control_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#control_escape}.
     *
     * @param ctx the parse tree
     */
    void exitControl_escape(SkadiParser.Control_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#control_letter}.
     *
     * @param ctx the parse tree
     */
    void enterControl_letter(SkadiParser.Control_letterContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#control_letter}.
     *
     * @param ctx the parse tree
     */
    void exitControl_letter(SkadiParser.Control_letterContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#identity_escape}.
     *
     * @param ctx the parse tree
     */
    void enterIdentity_escape(SkadiParser.Identity_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#identity_escape}.
     *
     * @param ctx the parse tree
     */
    void exitIdentity_escape(SkadiParser.Identity_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#decimal_escape}.
     *
     * @param ctx the parse tree
     */
    void enterDecimal_escape(SkadiParser.Decimal_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#decimal_escape}.
     *
     * @param ctx the parse tree
     */
    void exitDecimal_escape(SkadiParser.Decimal_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#hex_escape_sequence}.
     *
     * @param ctx the parse tree
     */
    void enterHex_escape_sequence(SkadiParser.Hex_escape_sequenceContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#hex_escape_sequence}.
     *
     * @param ctx the parse tree
     */
    void exitHex_escape_sequence(SkadiParser.Hex_escape_sequenceContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#hex_digit}.
     *
     * @param ctx the parse tree
     */
    void enterHex_digit(SkadiParser.Hex_digitContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#hex_digit}.
     *
     * @param ctx the parse tree
     */
    void exitHex_digit(SkadiParser.Hex_digitContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#character_class_escape}.
     *
     * @param ctx the parse tree
     */
    void enterCharacter_class_escape(SkadiParser.Character_class_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#character_class_escape}.
     *
     * @param ctx the parse tree
     */
    void exitCharacter_class_escape(SkadiParser.Character_class_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#character_class}.
     *
     * @param ctx the parse tree
     */
    void enterCharacter_class(SkadiParser.Character_classContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#character_class}.
     *
     * @param ctx the parse tree
     */
    void exitCharacter_class(SkadiParser.Character_classContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#class_ranges}.
     *
     * @param ctx the parse tree
     */
    void enterClass_ranges(SkadiParser.Class_rangesContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#class_ranges}.
     *
     * @param ctx the parse tree
     */
    void exitClass_ranges(SkadiParser.Class_rangesContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#non_empty_class_ranges}.
     *
     * @param ctx the parse tree
     */
    void enterNon_empty_class_ranges(SkadiParser.Non_empty_class_rangesContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#non_empty_class_ranges}.
     *
     * @param ctx the parse tree
     */
    void exitNon_empty_class_ranges(SkadiParser.Non_empty_class_rangesContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#non_empty_class_ranges_no_dash}.
     *
     * @param ctx the parse tree
     */
    void enterNon_empty_class_ranges_no_dash(SkadiParser.Non_empty_class_ranges_no_dashContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#non_empty_class_ranges_no_dash}.
     *
     * @param ctx the parse tree
     */
    void exitNon_empty_class_ranges_no_dash(SkadiParser.Non_empty_class_ranges_no_dashContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#class_atom}.
     *
     * @param ctx the parse tree
     */
    void enterClass_atom(SkadiParser.Class_atomContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#class_atom}.
     *
     * @param ctx the parse tree
     */
    void exitClass_atom(SkadiParser.Class_atomContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#class_atom_no_dash}.
     *
     * @param ctx the parse tree
     */
    void enterClass_atom_no_dash(SkadiParser.Class_atom_no_dashContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#class_atom_no_dash}.
     *
     * @param ctx the parse tree
     */
    void exitClass_atom_no_dash(SkadiParser.Class_atom_no_dashContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#class_escape}.
     *
     * @param ctx the parse tree
     */
    void enterClass_escape(SkadiParser.Class_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#class_escape}.
     *
     * @param ctx the parse tree
     */
    void exitClass_escape(SkadiParser.Class_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#rule_reference}.
     *
     * @param ctx the parse tree
     */
    void enterRule_reference(SkadiParser.Rule_referenceContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#rule_reference}.
     *
     * @param ctx the parse tree
     */
    void exitRule_reference(SkadiParser.Rule_referenceContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#rule_name}.
     *
     * @param ctx the parse tree
     */
    void enterRule_name(SkadiParser.Rule_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#rule_name}.
     *
     * @param ctx the parse tree
     */
    void exitRule_name(SkadiParser.Rule_nameContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#pattern_char}.
     *
     * @param ctx the parse tree
     */
    void enterPattern_char(SkadiParser.Pattern_charContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#pattern_char}.
     *
     * @param ctx the parse tree
     */
    void exitPattern_char(SkadiParser.Pattern_charContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#digit}.
     *
     * @param ctx the parse tree
     */
    void enterDigit(SkadiParser.DigitContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#digit}.
     *
     * @param ctx the parse tree
     */
    void exitDigit(SkadiParser.DigitContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiParser#char}.
     *
     * @param ctx the parse tree
     */
    void enterChar(SkadiParser.CharContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiParser#char}.
     *
     * @param ctx the parse tree
     */
    void exitChar(SkadiParser.CharContext ctx);
}