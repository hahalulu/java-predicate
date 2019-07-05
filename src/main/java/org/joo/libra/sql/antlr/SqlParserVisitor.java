// Generated from SqlParser.g4 by ANTLR 4.7.1

package org.joo.libra.sql.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#dummy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummy(SqlParser.DummyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionExpr}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExpr(SqlParser.ExpressionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(SqlParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(SqlParser.TermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listMatchingExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListMatchingExpr(SqlParser.ListMatchingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(SqlParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterMatching}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterMatching(SqlParser.FilterMatchingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(SqlParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(SqlParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(SqlParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(SqlParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpr(SqlParser.NotEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyExpr(SqlParser.EmptyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containsExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsExpr(SqlParser.ContainsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchesExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchesExpr(SqlParser.MatchesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(SqlParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpr(SqlParser.InExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(SqlParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(SqlParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(SqlParser.NullExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(SqlParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wrapListExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapListExpr(SqlParser.WrapListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(SqlParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(SqlParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(SqlParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tempVarExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempVarExpr(SqlParser.TempVarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(SqlParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listFactorExpr}
	 * labeled alternative in {@link SqlParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListFactorExpr(SqlParser.ListFactorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterExpr}
	 * labeled alternative in {@link SqlParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExpr(SqlParser.FilterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listCommaExpr}
	 * labeled alternative in {@link SqlParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCommaExpr(SqlParser.ListCommaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterMatchingExpr}
	 * labeled alternative in {@link SqlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterMatchingExpr(SqlParser.FilterMatchingExprContext ctx);
}