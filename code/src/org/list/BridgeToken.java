package org.list;


import org.antlr.BridgeParser;

/**
 * Bridge Token Class:
 * Object where information from the input files are saved.
 * Various informations about a "Token" for later evaluation.
 */
public class BridgeToken {
    public String text;
    public int position;

    public boolean isIsland = false;
    public boolean isStartIsland = false;
    public boolean isRef = false;
    public boolean hasBridge = false;

    public Bridge bridge;

    public BridgeToken(){}

    public BridgeToken(String t, int p){
        this.text = t;
        this.position = p;

        bridge = new Bridge(null, null, 0);
        if(BridgeParser.islandMap.containsKey(t)) {
            this.isStartIsland = true;
            this.isIsland = true;
        }
        else if(BridgeParser.islandMap.containsValue(t))
            this.isIsland = true;
        else if(BridgeParser.refMap.containsKey(t))
            this.isRef = true;
    }
    public BridgeToken(String t, int p,
                       boolean island, boolean start, boolean ref, boolean bridge){
        this.text = t;
        this.position = p;
        this.hasBridge = bridge;
        this.isIsland = island;
        this.isStartIsland = start;
        this.isRef = ref;
    }

    public void setBridge(DoubleLinkedList.Node start, DoubleLinkedList.Node end){
        this.bridge.setBridge(start, end);
    }
    public boolean getHasBridge(){
        return hasBridge;
    }
    public void setHasBridge() { hasBridge = true; }

    public void printToken(){
        System.out.println("Text: " + this.text +
                            " | Pos: " + this.position +
                            " | isSI: " + this.isStartIsland +
                            " | isI: " + this.isIsland +
                            " | isRef: " + this.isRef);
    }

}
