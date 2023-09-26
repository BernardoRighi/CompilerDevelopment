// Generated from CS.g by ANTLR 4.8

    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSParser}.
 */
public interface CSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CSParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CSParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CSParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CSParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_return}.
	 * @param ctx the parse tree
	 */
	void enterSt_return(CSParser.St_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_return}.
	 * @param ctx the parse tree
	 */
	void exitSt_return(CSParser.St_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_array_new}.
	 * @param ctx the parse tree
	 */
	void enterSt_array_new(CSParser.St_array_newContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_array_new}.
	 * @param ctx the parse tree
	 */
	void exitSt_array_new(CSParser.St_array_newContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_array_push}.
	 * @param ctx the parse tree
	 */
	void enterSt_array_push(CSParser.St_array_pushContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_array_push}.
	 * @param ctx the parse tree
	 */
	void exitSt_array_push(CSParser.St_array_pushContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_array_set}.
	 * @param ctx the parse tree
	 */
	void enterSt_array_set(CSParser.St_array_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_array_set}.
	 * @param ctx the parse tree
	 */
	void exitSt_array_set(CSParser.St_array_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_console}.
	 * @param ctx the parse tree
	 */
	void enterSt_console(CSParser.St_consoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_console}.
	 * @param ctx the parse tree
	 */
	void exitSt_console(CSParser.St_consoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_attrib}.
	 * @param ctx the parse tree
	 */
	void enterSt_attrib(CSParser.St_attribContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_attrib}.
	 * @param ctx the parse tree
	 */
	void exitSt_attrib(CSParser.St_attribContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_if}.
	 * @param ctx the parse tree
	 */
	void enterSt_if(CSParser.St_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_if}.
	 * @param ctx the parse tree
	 */
	void exitSt_if(CSParser.St_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_while}.
	 * @param ctx the parse tree
	 */
	void enterSt_while(CSParser.St_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_while}.
	 * @param ctx the parse tree
	 */
	void exitSt_while(CSParser.St_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_break}.
	 * @param ctx the parse tree
	 */
	void enterSt_break(CSParser.St_breakContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_break}.
	 * @param ctx the parse tree
	 */
	void exitSt_break(CSParser.St_breakContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_continue}.
	 * @param ctx the parse tree
	 */
	void enterSt_continue(CSParser.St_continueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_continue}.
	 * @param ctx the parse tree
	 */
	void exitSt_continue(CSParser.St_continueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#st_call}.
	 * @param ctx the parse tree
	 */
	void enterSt_call(CSParser.St_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#st_call}.
	 * @param ctx the parse tree
	 */
	void exitSt_call(CSParser.St_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CSParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CSParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CSParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CSParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CSParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CSParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CSParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CSParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CSParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CSParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CSParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CSParser.FactorContext ctx);
}