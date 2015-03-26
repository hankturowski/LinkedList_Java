package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Hank on 3/25/2015.
 */
public class LinkedListTest {

    @Test
    public void testCanCreateLinkedList() {
        LinkedList list = new LinkedList();
        org.junit.Assert.assertNotNull(list);
    }

    @Test
    public void testCanGetHead() {
        LinkedList list = new LinkedList();
        org.junit.Assert.assertEquals(list.getHead().getValue(), null);
    }

    @Test
    public void testCanAddNode() {
        LinkedList list = new LinkedList();
        list.addNode(1);
        org.junit.Assert.assertEquals(list.getHead().getNext().getValue(), 1);
    }

    @Test
    public void testCanAddTwoNodes() {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        org.junit.Assert.assertEquals(list.getHead().getNext().getNext().getValue(), 2);
        org.junit.Assert.assertEquals(list.getHead().getNext().getValue(), 1);
    }

    @Test
    public void testCanAddThreeNodes() {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        Node second = list.getNode(2);
        org.junit.Assert.assertEquals(second.getValue(), 2);
        Node missing = list.getNode(5);
        org.junit.Assert.assertNull(missing);
    }

    @Test
    public void testCanAddMiddleNode() {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        list.addNode(10,3);

        Node wanted = list.getNode(3);
        org.junit.Assert.assertEquals(wanted.getValue(), 10);
    }

    @Test
    public void testCanRemoveNode() {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        Node removed = list.removeNode(3);
        org.junit.Assert.assertEquals(removed.getValue(), 3);

        Node newThird = list.getNode(3);
        org.junit.Assert.assertEquals(newThird.getValue(), 4);
    }

}