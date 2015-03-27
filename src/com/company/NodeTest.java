package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Hank on 3/25/2015.
 */
public class NodeTest {

    @Test
    public void testCanCreateNode() {
        Node h = new Node();
        org.junit.Assert.assertNotNull(h);
    }

    @Test
    public void testCanLinkTwoNodes() {
        Node h = new Node(1);
        Node a = new Node(2, h);

        org.junit.Assert.assertEquals(h.getNext(), a);
    }

    @Test
    public void testCanSetValue() {
        Node h = new Node(1);
        h.setValue(2);

        Integer expected = 2;

        org.junit.Assert.assertEquals(h.getValue(), expected);
    }
}