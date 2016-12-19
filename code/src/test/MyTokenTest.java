package test;

import example.Token.MyTokenFactory;
import org.antlr.Antlr;
import org.antlr.BridgeLexer;
import org.antlr.BridgeParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bridgebuilder.BridgeBuilder;
import org.bridgebuilder.builderFunction;
import org.list.Bridge;
import org.list.BridgeToken;
import org.list.DoubleLinkedList;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * Created by ben on 16.03.16.
 */
public class MyTokenTest {

    @org.junit.Test
    public void testMyToken() throws Exception {

        String inputFile = "inputfile.txt";
        InputStream is = new FileInputStream(inputFile);

        ANTLRInputStream input = new ANTLRInputStream(is);
        BridgeLexer lexer = new BridgeLexer(input);
        MyTokenFactory factory = new MyTokenFactory(input);
        lexer.setTokenFactory(factory);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //now, print all tokens
        tokens.fill();

        DoubleLinkedList<Token> newlist = new DoubleLinkedList<>();
        List<Token> alltokens = tokens.getTokens();
        for(Token t:alltokens){
            newlist.addLast(t);

            System.out.println(t.toString());
        }

        //now parse

        BridgeParser parser = new BridgeParser(tokens);
        parser.setTokenFactory(factory);
        ParseTree t = parser.prog();

        System.out.println(t.toStringTree(parser));
    }

    @org.junit.Test
    public void testToken() throws Exception {

        String inputFile = "inputfile.txt";
        InputStream is = new FileInputStream(inputFile);

        ANTLRInputStream input = new ANTLRInputStream(is);
        BridgeLexer lexer = new BridgeLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //now, print all tokens
        tokens.fill();

        List<Token> alltokens = tokens.getTokens();
        for(Token t:alltokens){

            System.out.println(t.toString());
        }

        //now parse

        BridgeParser parser = new BridgeParser(tokens);
        ParseTree t = parser.prog();

        System.out.println(t.toStringTree(parser));
    }

    @org.junit.Test
    public void testAntlrTokenList() throws Exception {

        String inputFile = "inputfile.txt";
       // InputStream is = new FileInputStream(inputFile);
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();

        for(Token t:tokenList){
            System.out.println(t.getText());
        }

    }
    @org.junit.Test
    public void testbuildTokenlist() throws Exception {
        System.out.println("\n" +
                "--------\ntestBuildTokenList()\n--------");
        String inputFile = "inputfile.txt";
        // InputStream is = new FileInputStream(inputFile);
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();

        DoubleLinkedList<BridgeToken> bridgeTokenList = builderFunction.createTokenList(tokenList);

        System.out.println("size: " + bridgeTokenList.size());

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            System.out.println(bridge.text);
            start = start.next;
        }
        System.out.println("\n" +
                "--------\nEnd()\n--------");
    }

    @org.junit.Test
    public void testLexerListSizeEqualsParserListSize() throws Exception {

        String inputFile = "inputfile.txt";
        // InputStream is = new FileInputStream(inputFile);
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();


        for(Token t:tokenList){
            System.out.println(t.getText());
        }

        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            bridge.printToken();
           // System.out.println(bridge.text + bridge.position);
            start = start.next;
        }

        //ANTLRInputStream input = new ANTLRInputStream(is);
        //BridgeLexer lexer = new BridgeLexer(input);

        //CommonTokenStream tokens = new CommonTokenStream(lexer);

        //now, print all tokens
        //tokens.fill();

        /*List<Token> alltokens = tokens.getTokens();
        for(Token t:alltokens){

            System.out.println(t.toString());
        }*/

        //now parse

        //BridgeParser parser = new BridgeParser(tokens);
        //ParseTree t = parser.prog();

        //System.out.println(t.toStringTree(parser));
    }

    @org.junit.Test
    public void testBridgeBuilder() throws Exception {

        String inputFile = "inputfile.txt";
        // InputStream is = new FileInputStream(inputFile);
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();


        for(Token t:tokenList){
            System.out.println(t.getText());
        }

        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            bridge.printToken();
            // System.out.println(bridge.text + bridge.position);
            start = start.next;
        }

        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            System.out.println(tmp.start.element.toString());

            bridgeList = bridgeList.next;
        }

    }

    @org.junit.Test
    public void testRBraceBridge() throws Exception {

        String inputFile = "rbracebridge.txt";
        // InputStream is = new FileInputStream(inputFile);
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();


        for(Token t:tokenList){
            System.out.println(t.getText());
        }

        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            bridge.printToken();
            // System.out.println(bridge.text + bridge.position);
            start = start.next;
        }

        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            System.out.println(tmp.start.element.toString());

            bridgeList = bridgeList.next;
        }

    }
}