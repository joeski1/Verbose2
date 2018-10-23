// Generated from Verbose2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Verbose2Parser}.
 */
public interface Verbose2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Verbose2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Verbose2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Verbose2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Verbose2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Verbose2Parser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(Verbose2Parser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Verbose2Parser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(Verbose2Parser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Verbose2Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Verbose2Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Verbose2Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Verbose2Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Verbose2Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Verbose2Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Verbose2Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Verbose2Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Verbose2Parser#retBlock}.
	 * @param ctx the parse tree
	 */
	void enterRetBlock(Verbose2Parser.RetBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Verbose2Parser#retBlock}.
	 * @param ctx the parse tree
	 */
	void exitRetBlock(Verbose2Parser.RetBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Verbose2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Verbose2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Verbose2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Verbose2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompStatement(Verbose2Parser.CompStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompStatement(Verbose2Parser.CompStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(Verbose2Parser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(Verbose2Parser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(Verbose2Parser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(Verbose2Parser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Verbose2Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Verbose2Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Verbose2Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Verbose2Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compNot}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompNot(Verbose2Parser.CompNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compNot}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompNot(Verbose2Parser.CompNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compMathExpr}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompMathExpr(Verbose2Parser.CompMathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compMathExpr}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompMathExpr(Verbose2Parser.CompMathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compLogical}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompLogical(Verbose2Parser.CompLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compLogical}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompLogical(Verbose2Parser.CompLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compComp}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompComp(Verbose2Parser.CompCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compComp}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompComp(Verbose2Parser.CompCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketComp}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracketComp(Verbose2Parser.BracketCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketComp}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracketComp(Verbose2Parser.BracketCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(Verbose2Parser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(Verbose2Parser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(Verbose2Parser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(Verbose2Parser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Verbose2Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Verbose2Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(Verbose2Parser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(Verbose2Parser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryBoolean}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBoolean(Verbose2Parser.PrimaryBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryBoolean}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBoolean(Verbose2Parser.PrimaryBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryString}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryString(Verbose2Parser.PrimaryStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryString}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryString(Verbose2Parser.PrimaryStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryNumber}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNumber(Verbose2Parser.PrimaryNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryNumber}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNumber(Verbose2Parser.PrimaryNumberContext ctx);
}