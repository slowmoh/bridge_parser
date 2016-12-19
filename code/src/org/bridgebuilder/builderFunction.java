package org.bridgebuilder;

import org.antlr.v4.runtime.Token;
import org.list.BridgeToken;
import org.list.DoubleLinkedList;

import java.util.HashMap;
import java.util.List;

/**
 * Test file. Ignore
 */
public class builderFunction {

    public static HashMap<String, String> islandMap = new HashMap<String, String>(){{
        put("{", "}");
        put("(", ")");
    }};

    public static HashMap<String, String> refMap = new HashMap<String, String>(){{
       put(" ", "TAB");
    }};

    public static DoubleLinkedList<BridgeToken> createTokenList(List<Token> tokens){
        DoubleLinkedList<BridgeToken> tokenList = new DoubleLinkedList<>();
        String text;
        int pos;
        boolean isStartIsland = false;
        boolean hasBridge = false;
        boolean isIsland = false;
        boolean isRef = false;

        tokenList.addFirst(new BridgeToken("SOF", 0, true, true, false, false));

        for(Token t: tokens){
            if(islandMap.containsKey(t.getText()))
                tokenList.addLast(new BridgeToken(t.getText(), t.getCharPositionInLine(), true, true, false, false));
            else if(islandMap.containsValue(t.getText()))
                tokenList.addLast(new BridgeToken(t.getText(), t.getCharPositionInLine(), true, false, false, false));
            else if(refMap.containsKey(t.getText()))
                tokenList.addLast(new BridgeToken(t.getText(), t.getCharPositionInLine(), false, false, true, false));
            //if()
            //tokenList.addLast(new BridgeToken(t.getText(), t.getCharPositionInLine(), ))
        }

        return tokenList;
    }

}
