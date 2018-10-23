// Generated from Verbose2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Verbose2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Verbose2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Verbose2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Verbose2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Verbose2Parser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(Verbose2Parser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Verbose2Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(Verbose2Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Verbose2Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Verbose2Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Verbose2Parser#retBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetBlock(Verbose2Parser.RetBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Verbose2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Verbose2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompStatement(Verbose2Parser.CompStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(Verbose2Parser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link Verbose2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(Verbose2Parser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Verbose2Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(Verbose2Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compNot}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompNot(Verbose2Parser.CompNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compMathExpr}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompMathExpr(Verbose2Parser.CompMathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compLogical}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompLogical(Verbose2Parser.CompLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compComp}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompComp(Verbose2Parser.CompCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketComp}
	 * labeled alternative in {@link Verbose2Parser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketComp(Verbose2Parser.BracketCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(Verbose2Parser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(Verbose2Parser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Verbose2Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link Verbose2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(Verbose2Parser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryBoolean}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBoolean(Verbose2Parser.PrimaryBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryString}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryString(Verbose2Parser.PrimaryStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNumber}
	 * labeled alternative in {@link Verbose2Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNumber(Verbose2Parser.PrimaryNumberContext ctx);
}