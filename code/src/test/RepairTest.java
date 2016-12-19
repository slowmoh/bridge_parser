package test;

import org.antlr.Antlr;
import org.antlr.v4.runtime.Token;
import org.bridgebuilder.BridgeBuilder;
import org.bridgebuilder.BridgeRepairer;
import org.list.Bridge;
import org.list.BridgeToken;
import org.list.DoubleLinkedList;

import java.util.List;

/**
 *
 * ToDo: Tests for Bridge
 * ToDo: Tests for Repairer
 * ToDo: Repairer Definitions for left and right parenthesis
 * ToDo: Rerun tests
 * ToDo: Commentate Code
 */

/**
 *
 */
public class RepairTest {

    @org.junit.Test
    public void testRBraceBridge() throws Exception {
        String inputFile = "rbrace.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            //bridge.printToken();
            // System.out.println(bridge.text + bridge.position);
            start = start.next;
        }

        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        Bridge sofBridge = new Bridge();
        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            BridgeToken token = (BridgeToken) tmp.start.element;
            //System.out.println(token.text);
            if(token.text.equals("SOF"))
                sofBridge = tmp;
            bridgeList = bridgeList.next;
        }

        BridgeRepairer.bridgeRepairer(sofBridge);

        DoubleLinkedList.Node starts = bridgeTokenList.getHead();
        while(starts!=null){
            BridgeToken bridge = (BridgeToken) starts.element;

             System.out.print(bridge.text + " ");
            starts = starts.next;
        }
        System.out.println("\nBridge.size: " + builder.bridges.size());

    }

    @org.junit.Test
    public void testLBraceBridge() throws Exception {
        String inputFile = "lbrace.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            //bridge.printToken();
             System.out.print(bridge.text + " ");
            start = start.next;
        }
        System.out.print("\n");
        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        Bridge sofBridge = new Bridge();
        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            BridgeToken token = (BridgeToken) tmp.start.element;
            //System.out.println(token.text);
            if(token.text.equals("SOF"))
                sofBridge = tmp;
            bridgeList = bridgeList.next;
        }

        BridgeRepairer.bridgeRepairer(sofBridge);

        DoubleLinkedList.Node starts = bridgeTokenList.getHead();
        while(starts!=null){
            BridgeToken bridge = (BridgeToken) starts.element;
        // [" + bridge.position + "]
            System.out.print(bridge.text + " ");
            starts = starts.next;
        }
        System.out.println("\nBridge.size: " + builder.bridges.size());

    }

    @org.junit.Test
    public void testLBrace2Bridge() throws Exception {
        String inputFile = "lbrace2.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            //bridge.printToken();
            System.out.print(bridge.text + " ");
            start = start.next;
        }
        System.out.print("\n");
        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        Bridge sofBridge = new Bridge();
        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            BridgeToken token = (BridgeToken) tmp.start.element;
            //System.out.println(token.text);
            if(token.text.equals("SOF"))
                sofBridge = tmp;
            bridgeList = bridgeList.next;
        }

        BridgeRepairer.bridgeRepairer(sofBridge);

        DoubleLinkedList.Node starts = bridgeTokenList.getHead();
        while(starts!=null){
            BridgeToken bridge = (BridgeToken) starts.element;
            // [" + bridge.position + "]
            System.out.print(bridge.text + " ");
            starts = starts.next;
        }
        System.out.println("\nBridge.size: " + builder.bridges.size());

    }

    @org.junit.Test
    public void testDoubleRBraceBridge() throws Exception {
        String inputFile = "doublerbrace.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            //bridge.printToken();
            System.out.print(bridge.text + " ");
            start = start.next;
        }
        System.out.print("\n");
        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        Bridge sofBridge = new Bridge();
        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            BridgeToken token = (BridgeToken) tmp.start.element;
            //System.out.println(token.text);
            if(token.text.equals("SOF"))
                sofBridge = tmp;
            bridgeList = bridgeList.next;
        }

        BridgeRepairer.bridgeRepairer(sofBridge);

        DoubleLinkedList.Node starts = bridgeTokenList.getHead();
        while(starts!=null){
            BridgeToken bridge = (BridgeToken) starts.element;
            // [" + bridge.position + "]
            System.out.print(bridge.text + " ");
            starts = starts.next;
        }
        System.out.println("\nBridge.size: " + builder.bridges.size());

    }

    @org.junit.Test
    public void testVariousBraceBridge() throws Exception {
        String inputFile = "variousbraces.txt";
        Antlr antlr = new Antlr(inputFile);

        List<Token> tokenList = antlr.getLexerTokenList();
        DoubleLinkedList<BridgeToken> bridgeTokenList = antlr.getBridgeTokenList();

        DoubleLinkedList.Node start = bridgeTokenList.getHead();
        while(start!=null){
            BridgeToken bridge = (BridgeToken) start.element;
            //bridge.printToken();
            System.out.print(bridge.text + " ");
            start = start.next;
        }
        System.out.print("\n");
        BridgeBuilder builder = new BridgeBuilder();
        builder.buildBridges(bridgeTokenList);

        Bridge sofBridge = new Bridge();
        DoubleLinkedList.Node bridgeList = builder.bridges.getHead();
        while(bridgeList != null){
            Bridge tmp = (Bridge) bridgeList.element;
            BridgeToken token = (BridgeToken) tmp.start.element;
            //System.out.println(token.text);
            if(token.text.equals("SOF"))
                sofBridge = tmp;
            bridgeList = bridgeList.next;
        }

        BridgeRepairer.bridgeRepairer(sofBridge);

        DoubleLinkedList.Node starts = bridgeTokenList.getHead();
        while(starts!=null){
            BridgeToken bridge = (BridgeToken) starts.element;
            // [" + bridge.position + "]
            System.out.print(bridge.text + " ");
            starts = starts.next;
        }
        System.out.println("\nBridge.size: " + builder.bridges.size());

    }
}
