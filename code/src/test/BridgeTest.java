package test;

import org.antlr.Antlr;
import org.antlr.v4.runtime.Token;
import org.bridgebuilder.BridgeBuilder;
import org.list.Bridge;
import org.list.BridgeToken;
import org.list.DoubleLinkedList;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;


public class BridgeTest {

    /*
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


        assertEquals(3, builder.bridges.size());
        System.out.println("Bridge.size: " + builder.bridges.size());

    }*/

    @org.junit.Test
    public void testRBrace() throws Exception {

        System.out.println("---Test RBrace---");
        String inputFile = "rbrace.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();
        DoubleLinkedList.Node start = bridgeTokenList.getHead();

        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            System.out.println(((BridgeToken)tmp.start.element).text + " to " + ((BridgeToken)tmp.end.element).text);
            bridgeList = bridgeList.next;
        }

        assertEquals(3, builder.bridges.size());
        System.out.println("Bridge.size: " + builder.bridges.size());
        System.out.println("---End---");
    }

    @org.junit.Test
    public void testLBrace() throws Exception {

        System.out.println("---Test LBrace---");
        String inputFile = "lbrace.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();
        DoubleLinkedList.Node start = bridgeTokenList.getHead();

        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            System.out.println(((BridgeToken)tmp.start.element).text + " to " + ((BridgeToken)tmp.end.element).text);
            bridgeList = bridgeList.next;
        }

        assertEquals(3, builder.bridges.size());
        System.out.println("Bridge.size: " + builder.bridges.size());
        System.out.println("---End---");
    }

    @org.junit.Test
    public void testLParen() throws Exception {

        System.out.println("---Test LParen---");
        String inputFile = "lparen.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();
        DoubleLinkedList.Node start = bridgeTokenList.getHead();

        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            System.out.println(((BridgeToken)tmp.start.element).text + " to " + ((BridgeToken)tmp.end.element).text);
            bridgeList = bridgeList.next;
        }

        assertEquals(3, builder.bridges.size());
        System.out.println("Bridge.size: " + builder.bridges.size());
        System.out.println("---End---");
    }

    @org.junit.Test
    public void testRParen() throws Exception {

        System.out.println("---Test RParen---");
        String inputFile = "rparen.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();
        DoubleLinkedList.Node start = bridgeTokenList.getHead();

        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            System.out.println(((BridgeToken)tmp.start.element).text + " to " + ((BridgeToken)tmp.end.element).text);
            bridgeList = bridgeList.next;
        }

        assertEquals(3, builder.bridges.size());
        System.out.println("Bridge.size: " + builder.bridges.size());
        System.out.println("---End---");
    }
}
