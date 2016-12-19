package org.tokenizer;

import org.antlr.BridgeBaseVisitor;
import org.antlr.BridgeParser;
import org.list.BridgeToken;
import org.list.DoubleLinkedList;

/**
 * Tokenizer class
 * Class that creates a double linked token list. Visits the parse tree and creates for some rule
 * visits a token and adds it to the list.
 */
public class Tokenizer extends BridgeBaseVisitor<Void> {
    DoubleLinkedList<BridgeToken> tokenList;
    int position = 0;

    public Tokenizer(){tokenList = new DoubleLinkedList<>();}

    public DoubleLinkedList<BridgeToken> getTokenList(){
        return this.tokenList;
    }
    @Override
    public Void visitProg(BridgeParser.ProgContext ctx) {
        tokenList.addFirst(new BridgeToken("SOF", 0));
        visitChildren(ctx);
        tokenList.addLast(new BridgeToken("EOF", 0));
        return null;
    }

    @Override
    public Void visitRef(BridgeParser.RefContext ctx) {
        if(tokenList.getTail().element.isRef) {
            tokenList.getTail().element.position = ctx.getText().length();
        }
        if(ctx.getText().toString().length()>1){position = ctx.getText().length();}
        return null;
    }

    @Override
    public Void visitWater(BridgeParser.WaterContext ctx) {
        tokenList.addLast(new BridgeToken(ctx.getText(), position));
        return null;
    }

    @Override
    public Void visitNewline(BridgeParser.NewlineContext ctx) {
        position = 0;
        tokenList.addLast(new BridgeToken( "TAB", position));
        return null;
    }

    @Override
    public Void visitIsland(BridgeParser.IslandContext ctx) {
        tokenList.addLast(new BridgeToken(ctx.getText(), position));
        return null;
    }
}
