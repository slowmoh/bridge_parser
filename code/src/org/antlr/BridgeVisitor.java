// Generated from /home/ben/Workspaces/ANTLR_IntelliJ/BParser/Bridge.g4 by ANTLR 4.5.1
package org.antlr;

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BridgeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BridgeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BridgeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(BridgeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(BridgeParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(BridgeParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#island}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsland(BridgeParser.IslandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWater(BridgeParser.WaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#lbrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbrace(BridgeParser.LbraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#rbrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbrace(BridgeParser.RbraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#lparenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLparenthesis(BridgeParser.LparenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#rparenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRparenthesis(BridgeParser.RparenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(BridgeParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link BridgeParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(BridgeParser.NewlineContext ctx);
}