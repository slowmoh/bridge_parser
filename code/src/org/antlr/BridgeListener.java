// Generated from /home/ben/Workspaces/ANTLR_IntelliJ/BParser/Bridge.g4 by ANTLR 4.5.1
package org.antlr;

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BridgeParser}.
 */
public interface BridgeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BridgeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BridgeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BridgeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(BridgeParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(BridgeParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(BridgeParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(BridgeParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#island}.
	 * @param ctx the parse tree
	 */
	void enterIsland(BridgeParser.IslandContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#island}.
	 * @param ctx the parse tree
	 */
	void exitIsland(BridgeParser.IslandContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#water}.
	 * @param ctx the parse tree
	 */
	void enterWater(BridgeParser.WaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#water}.
	 * @param ctx the parse tree
	 */
	void exitWater(BridgeParser.WaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#lbrace}.
	 * @param ctx the parse tree
	 */
	void enterLbrace(BridgeParser.LbraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#lbrace}.
	 * @param ctx the parse tree
	 */
	void exitLbrace(BridgeParser.LbraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#rbrace}.
	 * @param ctx the parse tree
	 */
	void enterRbrace(BridgeParser.RbraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#rbrace}.
	 * @param ctx the parse tree
	 */
	void exitRbrace(BridgeParser.RbraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#lparenthesis}.
	 * @param ctx the parse tree
	 */
	void enterLparenthesis(BridgeParser.LparenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#lparenthesis}.
	 * @param ctx the parse tree
	 */
	void exitLparenthesis(BridgeParser.LparenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#rparenthesis}.
	 * @param ctx the parse tree
	 */
	void enterRparenthesis(BridgeParser.RparenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#rparenthesis}.
	 * @param ctx the parse tree
	 */
	void exitRparenthesis(BridgeParser.RparenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(BridgeParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(BridgeParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link BridgeParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(BridgeParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BridgeParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(BridgeParser.NewlineContext ctx);
}