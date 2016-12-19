package org.antlr;

import example.Token.MyTokenFactory;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.list.BridgeToken;
import org.list.DoubleLinkedList;
import org.tokenizer.Tokenizer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * Antlr class takes the "incomplete" input file and
 * creates the lexer, token stream, parser and a parse tree for later use.
 */
public class Antlr extends BridgeBaseVisitor<Void> {

    private BridgeLexer lexer;
    private BridgeParser parser;
    private CommonTokenStream tokens;
    private MyTokenFactory factory;
    private ParseTree tree;

    // a token list with tokens from the lexer
    private List<Token> lexerTokenList;
    // a token list, with tokens (BridgeToken Objects) from the parse tree
    private DoubleLinkedList<BridgeToken> bridgeTokenList;


    public Antlr(String inputfile) throws Exception{
        InputStream is = new FileInputStream(inputfile);
        ANTLRInputStream input = new ANTLRInputStream(is);

        BridgeLexer lx = new BridgeLexer(input);

        MyTokenFactory fc = new MyTokenFactory(input);

        CommonTokenStream ts = new CommonTokenStream(lx);

        ts.fill();
        lexerTokenList = ts.getTokens();

        BridgeParser ps = new BridgeParser(ts);
        ParseTree tree = ps.prog();

        Tokenizer loader = new Tokenizer();

        loader.visit(tree);
        bridgeTokenList = loader.getTokenList();
        this.lexer = lx;
        this.tokens = ts;
        this.parser = ps;


    }

    public List<Token> getLexerTokenList(){ return lexerTokenList; }
    public DoubleLinkedList<BridgeToken> getBridgeTokenList(){ return bridgeTokenList;}
    public BridgeLexer getLexer() {return lexer;}
    public BridgeParser getParser() {return parser;}
    public CommonTokenStream getTokens() {return tokens;}
}
