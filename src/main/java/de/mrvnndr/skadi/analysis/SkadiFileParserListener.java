package de.mrvnndr.skadi.analysis;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SkadiFileParser}.
 */
public interface SkadiFileParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link SkadiFileParser#file}.
     *
     * @param ctx the parse tree
     */
    void enterFile(SkadiFileParser.FileContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#file}.
     *
     * @param ctx the parse tree
     */
    void exitFile(SkadiFileParser.FileContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiFileParser#definition}.
     *
     * @param ctx the parse tree
     */
    void enterDefinition(SkadiFileParser.DefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#definition}.
     *
     * @param ctx the parse tree
     */
    void exitDefinition(SkadiFileParser.DefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiFileParser#copy_definition}.
     *
     * @param ctx the parse tree
     */
    void enterCopy_definition(SkadiFileParser.Copy_definitionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#copy_definition}.
     *
     * @param ctx the parse tree
     */
    void exitCopy_definition(SkadiFileParser.Copy_definitionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiFileParser#fragment_definition}.
     *
     * @param ctx the parse tree
     */
    void enterFragment_definition(SkadiFileParser.Fragment_definitionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#fragment_definition}.
     *
     * @param ctx the parse tree
     */
    void exitFragment_definition(SkadiFileParser.Fragment_definitionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiFileParser#automaton_definition}.
     *
     * @param ctx the parse tree
     */
    void enterAutomaton_definition(SkadiFileParser.Automaton_definitionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#automaton_definition}.
     *
     * @param ctx the parse tree
     */
    void exitAutomaton_definition(SkadiFileParser.Automaton_definitionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiFileParser#action_definition}.
     *
     * @param ctx the parse tree
     */
    void enterAction_definition(SkadiFileParser.Action_definitionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#action_definition}.
     *
     * @param ctx the parse tree
     */
    void exitAction_definition(SkadiFileParser.Action_definitionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiFileParser#enter_action}.
     *
     * @param ctx the parse tree
     */
    void enterEnter_action(SkadiFileParser.Enter_actionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#enter_action}.
     *
     * @param ctx the parse tree
     */
    void exitEnter_action(SkadiFileParser.Enter_actionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiFileParser#progress_action}.
     *
     * @param ctx the parse tree
     */
    void enterProgress_action(SkadiFileParser.Progress_actionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#progress_action}.
     *
     * @param ctx the parse tree
     */
    void exitProgress_action(SkadiFileParser.Progress_actionContext ctx);

    /**
     * Enter a parse tree produced by {@link SkadiFileParser#finish_action}.
     *
     * @param ctx the parse tree
     */
    void enterFinish_action(SkadiFileParser.Finish_actionContext ctx);

    /**
     * Exit a parse tree produced by {@link SkadiFileParser#finish_action}.
     *
     * @param ctx the parse tree
     */
    void exitFinish_action(SkadiFileParser.Finish_actionContext ctx);
}