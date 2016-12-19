package org.bridgebuilder;

import org.antlr.BridgeParser;
import org.list.Bridge;
import org.list.BridgeToken;
import org.list.DoubleLinkedList;


/**
 * BridgeBuilder Class:
 * Creates an empty list of bridges, where later the constructed bridges are listed.
 *
 * buildBridges(start of file):
 * Main algorithm for building bridges between tokens.
 * If conditions for building a bridge are true, then add it to the list, and
 * save further information in the token object.
 * Every token object has a bridge object, where we define the start token and the end token.
 */
public class BridgeBuilder {
    public DoubleLinkedList<Bridge> bridges;

    public BridgeBuilder(){
        bridges = new DoubleLinkedList<>();
    }

    public void buildBridges(DoubleLinkedList<BridgeToken> tokenList){
        BridgeToken sof = tokenList.getHead().element;
        DoubleLinkedList.Node start = tokenList.getHead();

        buildBridges(start);
    }


    public void buildBridges(DoubleLinkedList.Node sof){
        int tolerance = 0;
        boolean change = false;
        DoubleLinkedList.Node start = null;
        DoubleLinkedList.Node end = null;
        //BridgeToken startOfFile = (BridgeToken) sof.element;
        while(!((BridgeToken) sof.element).hasBridge){
            start = sof;
            change = false;
            while(start!=null){
                end = nextUnmatchedIsland(start, tolerance);
                if(bridgeMatch(start, end)){
                    buildBridge(start, end);
                    change = true;
                    start = nextUnmatchedStartIsland(end);
                }
                else
                    start = nextUnmatchedStartIsland(start);
            }
            if(!change){
                tolerance = tolerance +1;

            }
            else if(tolerance > 0){
                tolerance = 0;
            }

        }
    }

    /**
     * Could be easier....
     */
    public void buildBridge(DoubleLinkedList.Node start, DoubleLinkedList.Node end){
        Bridge newBridge = new Bridge(start, end, 0);
        bridges.addFirst(new Bridge(start, end, 0));

        ((BridgeToken) start.element).bridge = newBridge;
        ((BridgeToken) end.element).bridge = newBridge;


        ((BridgeToken) start.element).setHasBridge();
        ((BridgeToken) end.element).setHasBridge();
    }

    public boolean bridgeMatch(DoubleLinkedList.Node start, DoubleLinkedList.Node end){
        if(end == null){
            return false;
        }
        String startMap = BridgeParser.islandMap.get(((BridgeToken)start.element).text);
        String endString = ((BridgeToken) end.element).text;

        int aPos = ((BridgeToken) start.element).position;
        int bPos = ((BridgeToken) end.element).position;

        if( startMap.equals(endString) && BridgeParser.matchBridges(startMap, endString, aPos, bPos))
            return true;
        else
            return false;
    }

    public DoubleLinkedList.Node nextUnmatchedIsland(DoubleLinkedList.Node start, int tolerance){
        DoubleLinkedList.Node tmp = start.next;
        while(tmp != null ){
           if(((BridgeToken)tmp.element).isIsland && !((BridgeToken) tmp.element).getHasBridge()){
               if(tolerance ==0)return tmp;
               else tolerance--;
           }

            tmp = tmp.next;
        }
        return tmp;
    }

    public DoubleLinkedList.Node nextUnmatchedStartIsland(DoubleLinkedList.Node start){
        DoubleLinkedList.Node tmp = start.next;
        while(tmp != null){
            if(((BridgeToken)tmp.element).isStartIsland && !((BridgeToken) tmp.element).getHasBridge()){
                return tmp;
            }
            tmp = tmp.next;
        }
        return tmp;
    }

}
