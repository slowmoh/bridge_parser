package org.list;

/**
 * DoubleLinkedList Class
 */
public class DoubleLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList(){size = 0;}

    public Node getHead(){ return this.head;}
    public Node getTail(){ return this.tail;}

    public class Node{
        public E element;
        public Node next;
        public Node prev;

        public Node(E element, Node next, Node prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public int size(){return size;}
    public boolean isEmpty(){ return size == 0; }

    public void addFirst(E element){
        Node tmp = new Node(element, head, null);
        if(head != null){ head.prev = tmp; }
        head = tmp;
        if(tail == null) { tail = tmp; }
        size++;
    }

    public void addLast(E element){
        Node tmp = new Node(element, null, tail);
        if(tail != null) { tail.next = tmp; }
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
    }

    public void iterateForward(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }

    public void iterateBackward(){
        Node tmp = tail;
        while(tail != null){
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }

    }
}
