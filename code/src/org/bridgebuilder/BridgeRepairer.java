package org.bridgebuilder;

import org.antlr.BridgeParser;
import org.antlr.v4.runtime.Token;
import org.list.Bridge;
import org.list.BridgeToken;
import org.list.DoubleLinkedList;

/**
 * BridgeRepairer Class
 *
 * Static function to repair a double linked token list. (BridgeToken)
 *
 */
public class BridgeRepairer {

    /**
     * Main bridgeRepairer algorithm.
     * Takes a bridge and iterates between the tokens of the bridge.start and bridge.end.
     * Tests if there are island tokens with no bridges and tries to create the missing token.
     * @param bridge
     */
    public static void bridgeRepairer(Bridge bridge){
        DoubleLinkedList.Node start = bridge.start;
        DoubleLinkedList.Node end = bridge.end;

        DoubleLinkedList.Node island = nextIsland(start);

        if(island == null) return;
        while(island != end){
            if(!((BridgeToken)island.element).hasBridge ){
                if(((BridgeToken) island.element).isStartIsland){
                    mendRight(island, end);
                }
                else mendLeft(start, island);
            }

            bridge = ((BridgeToken) island.element).bridge;
            bridgeRepairer(bridge);
            island = nextIsland(bridge.end);
        }
    }

    /**
     * mendRight algorithm:
     * Algorithm for uncompleted briges with no end token.
     * Gets the broken token (start island) and the end of the bridge constructed above.
     * Iterates until the end and tries to match a possible construction site.
     * @param broken
     * @param end
     */
    public static void mendRight(DoubleLinkedList.Node broken, DoubleLinkedList.Node end){
        DoubleLinkedList.Node node = next(broken);

        while(node != end){
            if(possibleConstructionSite(broken, node)){
                constructIslandAndBridge(broken, node);
                return;
            }
            else node = next(node);
        }
       constructIslandAndBridge(broken,end.prev);

    }

    /**
     * mendLeft algorithm:
     * vice versa of mendRight
     * @param start
     * @param broken
     */
    public static void mendLeft(DoubleLinkedList.Node start, DoubleLinkedList.Node broken){
        DoubleLinkedList.Node node = broken.prev.prev;

        while(node!=start){
            if(possibleConstructionSite(broken, node)){
                constructIslandAndBridge(broken,node);
                return;
            }
            else node = node.prev;
        }
        constructIslandAndBridge(broken, start.next);
    }

    /**
     * possibleConstructionSite
     * Checks if the given node is a possible construction token for the given broken token.
     * @param broken
     * @param node
     * @return
     */
    public static boolean possibleConstructionSite(DoubleLinkedList.Node broken, DoubleLinkedList.Node node){
        // Missing R Bace
        // Broken -> {    -- Node -> iterates
        DoubleLinkedList.Node next = node.next;
        // Missing LBrace
        if(((BridgeToken) broken.element).text.equals("}")){
            if(((BridgeToken) node.element).isRef && ((BridgeToken)node.element).position <= ((BridgeToken) broken.element).position){
                return true;
            }
            else if(((BridgeToken) node.element).isIsland && ((BridgeToken) node.element).position <= ((BridgeToken) broken.element).position && ((BridgeToken) next.element).isRef)
                return true;
        }

        // Missing RBrace
        if(((BridgeToken) broken.element).text.equals("{")){
            if(((BridgeToken) node.element).isRef && ((BridgeToken)node.element).position <= ((BridgeToken) broken.element).position){
                return true;
            }
        }

        // Missing RParenthesis
        if(((BridgeToken)broken.element).text.equals("(")){
            if(((BridgeToken)node.element).isIsland)
                return true;
            else if(((BridgeToken)node.element).isRef && ((BridgeToken) node.element).position <= ((BridgeToken) broken.element).position) {
                return true;
            }
                // .... see ToDo - possible construction site and build bridge and island in one function.... less matching

        }
        if(((BridgeToken)broken.element).text.equals(")")){
            if(((BridgeToken)node.element).isIsland){
                return true;
            }
            else if(((BridgeToken)node.element).isRef && ((BridgeToken) broken.element).position <= ((BridgeToken) node.element).position) {
                return true;
            }

        }
        return false;
    }

    /**
     * constructIslandandBridge:
     * Constructs a new token (node) and inserts it into the double linked list.
     * Also sets the bridge, but only in the start and and token. Doesn't constructs an entry for the bridge list.
     * @param broken
     * @param node
     */
    public static void constructIslandAndBridge(DoubleLinkedList.Node broken, DoubleLinkedList.Node node){
        BridgeToken newNode = new BridgeToken(BridgeParser.repairMap.get(((BridgeToken) broken.element).text), (((BridgeToken) broken.element).position));
        DoubleLinkedList<BridgeToken> list = new DoubleLinkedList<>();
        list.addFirst(newNode);
        DoubleLinkedList.Node insertNode = list.getHead();

        DoubleLinkedList.Node tmp = node.next;
        DoubleLinkedList.Node prevTmp = node.prev;

        // Missing LBrace
        if(((BridgeToken) broken.element).text.equals("}")){
          insertNode.next = tmp;
            ((BridgeToken) insertNode.element).setHasBridge();
            ((BridgeToken) insertNode.element).setBridge(insertNode, broken);
            ((BridgeToken) broken.element).setHasBridge();
            ((BridgeToken) broken.element).setBridge(insertNode, broken);
            node.next = insertNode;
            insertNode.prev = node;

        }

        // Missing RBrace
        if(((BridgeToken) broken.element).text.equals("{")){
            insertNode.next = tmp;
            ((BridgeToken) insertNode.element).setHasBridge();
            ((BridgeToken) insertNode.element).setBridge(broken, insertNode);
            ((BridgeToken) broken.element).setHasBridge();
            ((BridgeToken) broken.element).setBridge(broken, insertNode);
            node.next = insertNode;
            insertNode.prev = node;
        }

        // Missing LParenthesis
        if(((BridgeToken) broken.element).text.equals(")")){
            if(((BridgeToken)node.element).isIsland){
                prevTmp.next = insertNode;
                insertNode.next = node;
                node.prev = insertNode;
                ((BridgeToken) insertNode.element).setHasBridge();
                ((BridgeToken) insertNode.element).setBridge(insertNode, broken);
                ((BridgeToken) broken.element).setHasBridge();
                ((BridgeToken) broken.element).setBridge(insertNode, broken);
            }
            else if(((BridgeToken)node.element).isRef && ((BridgeToken) broken.element).position <= ((BridgeToken) node.element).position){
                prevTmp.next = insertNode;
                insertNode.next = node;
                node.prev = insertNode;
                ((BridgeToken) insertNode.element).setHasBridge();
                ((BridgeToken) insertNode.element).setBridge(insertNode, broken);
                ((BridgeToken) broken.element).setHasBridge();
                ((BridgeToken) broken.element).setBridge(insertNode, broken);
            }
        }

        // Missing RParenthesis
        if(((BridgeToken) broken.element).text.equals("(")){
            if(((BridgeToken)node.element).isIsland){
                prevTmp.next = insertNode;
                insertNode.next = node;
                node.prev = insertNode;
                ((BridgeToken) insertNode.element).setHasBridge();
                ((BridgeToken) insertNode.element).setBridge(broken, insertNode);
                ((BridgeToken) broken.element).setHasBridge();
                ((BridgeToken) broken.element).setBridge(broken, insertNode);
            }
            else if(((BridgeToken)node.element).isRef && ((BridgeToken) node.element).position <= ((BridgeToken) broken.element).position){
                insertNode.next = tmp;
                ((BridgeToken) insertNode.element).setHasBridge();
                ((BridgeToken) insertNode.element).setBridge(broken, insertNode);
                ((BridgeToken) broken.element).setHasBridge();
                ((BridgeToken) broken.element).setBridge(broken, insertNode);
                node.next = insertNode;
                insertNode.prev = node;
            }
        }
    }

    /*
        ToDo: possibleConstructionSite -- returns boolean and Constructs the island
        -- less code and easier implementation for the grammar file
     */

    public static DoubleLinkedList.Node next(DoubleLinkedList.Node broken){
        // not needed.....
        DoubleLinkedList.Node tmp = broken.next;
        return tmp;
    }

    public static DoubleLinkedList.Node nextIsland(DoubleLinkedList.Node start){
        DoubleLinkedList.Node tmp = start.next;
        while(tmp!=null){
            if(((BridgeToken) tmp.element).isIsland){
                return tmp;
            }
            else
                tmp = tmp.next;
        }
        return null;
    }
}
