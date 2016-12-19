package test;

import org.list.DoubleLinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by ben on 16.03.16.
 */
public class ListTest {

    @org.junit.Test
    public void testList() throws Exception {
        DoubleLinkedList<Integer> intList = new DoubleLinkedList<>();

        intList.addFirst(1);
        intList.addFirst(2);

        DoubleLinkedList.Node newNode = intList.getHead();

        System.out.println(newNode.element);

    }

}