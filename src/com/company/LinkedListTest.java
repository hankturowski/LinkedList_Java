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
        org.junit.Assert.assertEquals(list.get(1), null);
    }

    @Test
    public void testCanAddNode() {
        LinkedList list = new LinkedList();
        list.add(1);
        Integer expected = 1;
        org.junit.Assert.assertEquals(list.get(1), expected);
        org.junit.Assert.assertEquals(list.size(), 1);
    }

    @Test
    public void testCanAddTwoNodes() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);

        Integer expected = 2;
        org.junit.Assert.assertEquals(list.get(2), expected);

        expected = 1;
        org.junit.Assert.assertEquals(list.get(1), expected);
    }

    @Test
    public void testCanAddThreeNodes() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer expected = 2;
        org.junit.Assert.assertEquals(list.get(2), expected);
        org.junit.Assert.assertNull(list.get(5));
    }

    @Test
    public void testCanAddMiddleNode() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(3, 10);

        Integer expected = 10;
        org.junit.Assert.assertEquals(list.get(3), expected);
    }

    @Test
    public void testCanRemoveNode() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(3);
        Integer expected = 4;
        org.junit.Assert.assertEquals(list.get(3), expected);
    }

    @Test
    public void testCanGetSpecificValue() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Object expected = list.get(2);
        org.junit.Assert.assertEquals(2, expected);
    }

}