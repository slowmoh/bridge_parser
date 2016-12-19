package org.list;

/**
 * Bridge Class
 * Creates an object with a start and end node.
 * Defines the start and the end of a bridge.
 * tolerance isn't needed at all.
 */
public class Bridge {
    public DoubleLinkedList.Node start;
    public DoubleLinkedList.Node end;
    int tolerance;

    public Bridge(){}
    public Bridge(DoubleLinkedList.Node s, DoubleLinkedList.Node e, int tol){
        this.start = s;
        this.end = e;
        this.tolerance = tol;
    }

    public void setBridge(DoubleLinkedList.Node start, DoubleLinkedList.Node end){
        this.start = start;
        this.end = end;
    }

}
