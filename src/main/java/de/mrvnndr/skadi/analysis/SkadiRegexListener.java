package de.mrvnndr.skadi.analysis;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SkadiRegexParser}.
 */
public interface SkadiRegexListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#regex}.
     *
     * @param ctx the parse tree
     */
    void enterRegex(SkadiRegexParser.RegexContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#regex}.
     *
     * @param ctx the parse tree
     */
    void exitRegex(SkadiRegexParser.RegexContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#inner_regex}.
     *
     * @param ctx the parse tree
     */
    void enterInner_regex(SkadiRegexParser.Inner_regexContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#inner_regex}.
     *
     * @param ctx the parse tree
     */
    void exitInner_regex(SkadiRegexParser.Inner_regexContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#alternative}.
     *
     * @param ctx the parse tree
     */
    void enterAlternative(SkadiRegexParser.AlternativeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#alternative}.
     *
     * @param ctx the parse tree
     */
    void exitAlternative(SkadiRegexParser.AlternativeContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomBase}
     * labeled alternative in {@link SkadiRegexParser#term}.
     *
     * @param ctx the parse tree
     */
    void enterAtomBase(SkadiRegexParser.AtomBaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomBase}
     * labeled alternative in {@link SkadiRegexParser#term}.
     *
     * @param ctx the parse tree
     */
    void exitAtomBase(SkadiRegexParser.AtomBaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomQuantifier}
     * labeled alternative in {@link SkadiRegexParser#term}.
     *
     * @param ctx the parse tree
     */
    void enterAtomQuantifier(SkadiRegexParser.AtomQuantifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomQuantifier}
     * labeled alternative in {@link SkadiRegexParser#term}.
     *
     * @param ctx the parse tree
     */
    void exitAtomQuantifier(SkadiRegexParser.AtomQuantifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomAssertion}
     * labeled alternative in {@link SkadiRegexParser#term}.
     *
     * @param ctx the parse tree
     */
    void enterAtomAssertion(SkadiRegexParser.AtomAssertionContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomAssertion}
     * labeled alternative in {@link SkadiRegexParser#term}.
     *
     * @param ctx the parse tree
     */
    void exitAtomAssertion(SkadiRegexParser.AtomAssertionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#assertion}.
     *
     * @param ctx the parse tree
     */
    void enterAssertion(SkadiRegexParser.AssertionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#assertion}.
     *
     * @param ctx the parse tree
     */
    void exitAssertion(SkadiRegexParser.AssertionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#quantifier}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifier(SkadiRegexParser.QuantifierContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#quantifier}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifier(SkadiRegexParser.QuantifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierStar}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierStar(SkadiRegexParser.QuantifierStarContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierStar}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierStar(SkadiRegexParser.QuantifierStarContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierPlus}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierPlus(SkadiRegexParser.QuantifierPlusContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierPlus}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierPlus(SkadiRegexParser.QuantifierPlusContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierQuestionMark}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierQuestionMark(SkadiRegexParser.QuantifierQuestionMarkContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierQuestionMark}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierQuestionMark(SkadiRegexParser.QuantifierQuestionMarkContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierExactly}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierExactly(SkadiRegexParser.QuantifierExactlyContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierExactly}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierExactly(SkadiRegexParser.QuantifierExactlyContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierAtLeast}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierAtLeast(SkadiRegexParser.QuantifierAtLeastContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierAtLeast}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierAtLeast(SkadiRegexParser.QuantifierAtLeastContext ctx);

    /**
     * Enter a parse tree produced by the {@code quantifierBetween}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void enterQuantifierBetween(SkadiRegexParser.QuantifierBetweenContext ctx);

    /**
     * Exit a parse tree produced by the {@code quantifierBetween}
     * labeled alternative in {@link SkadiRegexParser#quantifier_prefix}.
     *
     * @param ctx the parse tree
     */
    void exitQuantifierBetween(SkadiRegexParser.QuantifierBetweenContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomPatternChar}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomPatternChar(SkadiRegexParser.AtomPatternCharContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomPatternChar}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomPatternChar(SkadiRegexParser.AtomPatternCharContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomPeriod}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomPeriod(SkadiRegexParser.AtomPeriodContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomPeriod}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomPeriod(SkadiRegexParser.AtomPeriodContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomAtomEscape}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomAtomEscape(SkadiRegexParser.AtomAtomEscapeContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomAtomEscape}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomAtomEscape(SkadiRegexParser.AtomAtomEscapeContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomCharacterClass}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomCharacterClass(SkadiRegexParser.AtomCharacterClassContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomCharacterClass}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomCharacterClass(SkadiRegexParser.AtomCharacterClassContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomParenRegex}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomParenRegex(SkadiRegexParser.AtomParenRegexContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomParenRegex}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomParenRegex(SkadiRegexParser.AtomParenRegexContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomRuleReference}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void enterAtomRuleReference(SkadiRegexParser.AtomRuleReferenceContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomRuleReference}
     * labeled alternative in {@link SkadiRegexParser#atom}.
     *
     * @param ctx the parse tree
     */
    void exitAtomRuleReference(SkadiRegexParser.AtomRuleReferenceContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#atom_escape}.
     *
     * @param ctx the parse tree
     */
    void enterAtom_escape(SkadiRegexParser.Atom_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#atom_escape}.
     *
     * @param ctx the parse tree
     */
    void exitAtom_escape(SkadiRegexParser.Atom_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#character_escape}.
     *
     * @param ctx the parse tree
     */
    void enterCharacter_escape(SkadiRegexParser.Character_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#character_escape}.
     *
     * @param ctx the parse tree
     */
    void exitCharacter_escape(SkadiRegexParser.Character_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#control_escape}.
     *
     * @param ctx the parse tree
     */
    void enterControl_escape(SkadiRegexParser.Control_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#control_escape}.
     *
     * @param ctx the parse tree
     */
    void exitControl_escape(SkadiRegexParser.Control_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#control_letter}.
     *
     * @param ctx the parse tree
     */
    void enterControl_letter(SkadiRegexParser.Control_letterContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#control_letter}.
     *
     * @param ctx the parse tree
     */
    void exitControl_letter(SkadiRegexParser.Control_letterContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#identity_escape}.
     *
     * @param ctx the parse tree
     */
    void enterIdentity_escape(SkadiRegexParser.Identity_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#identity_escape}.
     *
     * @param ctx the parse tree
     */
    void exitIdentity_escape(SkadiRegexParser.Identity_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#decimal_escape}.
     *
     * @param ctx the parse tree
     */
    void enterDecimal_escape(SkadiRegexParser.Decimal_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#decimal_escape}.
     *
     * @param ctx the parse tree
     */
    void exitDecimal_escape(SkadiRegexParser.Decimal_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#hex_escape_sequence}.
     *
     * @param ctx the parse tree
     */
    void enterHex_escape_sequence(SkadiRegexParser.Hex_escape_sequenceContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#hex_escape_sequence}.
     *
     * @param ctx the parse tree
     */
    void exitHex_escape_sequence(SkadiRegexParser.Hex_escape_sequenceContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#hex_digit}.
     *
     * @param ctx the parse tree
     */
    void enterHex_digit(SkadiRegexParser.Hex_digitContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#hex_digit}.
     *
     * @param ctx the parse tree
     */
    void exitHex_digit(SkadiRegexParser.Hex_digitContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#character_class_escape}.
     *
     * @param ctx the parse tree
     */
    void enterCharacter_class_escape(SkadiRegexParser.Character_class_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#character_class_escape}.
     *
     * @param ctx the parse tree
     */
    void exitCharacter_class_escape(SkadiRegexParser.Character_class_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#character_class}.
     *
     * @param ctx the parse tree
     */
    void enterCharacter_class(SkadiRegexParser.Character_classContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#character_class}.
     *
     * @param ctx the parse tree
     */
    void exitCharacter_class(SkadiRegexParser.Character_classContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#class_ranges}.
     *
     * @param ctx the parse tree
     */
    void enterClass_ranges(SkadiRegexParser.Class_rangesContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#class_ranges}.
     *
     * @param ctx the parse tree
     */
    void exitClass_ranges(SkadiRegexParser.Class_rangesContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#non_empty_class_ranges}.
     *
     * @param ctx the parse tree
     */
    void enterNon_empty_class_ranges(SkadiRegexParser.Non_empty_class_rangesContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#non_empty_class_ranges}.
     *
     * @param ctx the parse tree
     */
    void exitNon_empty_class_ranges(SkadiRegexParser.Non_empty_class_rangesContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#non_empty_class_ranges_no_dash}.
     *
     * @param ctx the parse tree
     */
    void enterNon_empty_class_ranges_no_dash(SkadiRegexParser.Non_empty_class_ranges_no_dashContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#non_empty_class_ranges_no_dash}.
     *
     * @param ctx the parse tree
     */
    void exitNon_empty_class_ranges_no_dash(SkadiRegexParser.Non_empty_class_ranges_no_dashContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#class_atom}.
     *
     * @param ctx the parse tree
     */
    void enterClass_atom(SkadiRegexParser.Class_atomContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#class_atom}.
     *
     * @param ctx the parse tree
     */
    void exitClass_atom(SkadiRegexParser.Class_atomContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#class_atom_no_dash}.
     *
     * @param ctx the parse tree
     */
    void enterClass_atom_no_dash(SkadiRegexParser.Class_atom_no_dashContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#class_atom_no_dash}.
     *
     * @param ctx the parse tree
     */
    void exitClass_atom_no_dash(SkadiRegexParser.Class_atom_no_dashContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#class_escape}.
     *
     * @param ctx the parse tree
     */
    void enterClass_escape(SkadiRegexParser.Class_escapeContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#class_escape}.
     *
     * @param ctx the parse tree
     */
    void exitClass_escape(SkadiRegexParser.Class_escapeContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#rule_reference}.
     *
     * @param ctx the parse tree
     */
    void enterRule_reference(SkadiRegexParser.Rule_referenceContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#rule_reference}.
     *
     * @param ctx the parse tree
     */
    void exitRule_reference(SkadiRegexParser.Rule_referenceContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#rule_name}.
     *
     * @param ctx the parse tree
     */
    void enterRule_name(SkadiRegexParser.Rule_nameContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#rule_name}.
     *
     * @param ctx the parse tree
     */
    void exitRule_name(SkadiRegexParser.Rule_nameContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#pattern_char}.
     *
     * @param ctx the parse tree
     */
    void enterPattern_char(SkadiRegexParser.Pattern_charContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#pattern_char}.
     *
     * @param ctx the parse tree
     */
    void exitPattern_char(SkadiRegexParser.Pattern_charContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#digit}.
     *
     * @param ctx the parse tree
     */
    void enterDigit(SkadiRegexParser.DigitContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#digit}.
     *
     * @param ctx the parse tree
     */
    void exitDigit(SkadiRegexParser.DigitContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiRegexParser#char}.
     *
     * @param ctx the parse tree
     */
    void enterChar(SkadiRegexParser.CharContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiRegexParser#char}.
     *
     * @param ctx the parse tree
     */
    void exitChar(SkadiRegexParser.CharContext ctx);
}