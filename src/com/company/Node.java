package com.company;

public class Node {
    private Object value;
    private Node next;

    public Node() {
        next = null;
        value = null;
    }

    public Node(Object value) {
        this.value = value;
        next = null;
    }

    public Node(Object value, Node previous) {
        this.value = value;
        previous.next = this;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}