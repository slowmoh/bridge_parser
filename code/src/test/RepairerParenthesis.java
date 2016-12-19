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
 * Created by ben on 31.03.16.
 */
public class RepairerParenthesis {

    @org.junit.Test
    public void testRParen() throws Exception {
        String inputFile = "rparen.txt";
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
    public void testLParen() throws Exception {
        String inputFile = "lparen.txt";
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
