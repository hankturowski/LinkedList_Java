package com.company;

/**
 * Created by Hank on 3/25/2015.
 */
public class LinkedList {
    private Node head;

    public LinkedList() {
        head = new Node(null);
    }

    public Node getHead() {
        return head;
    }

    public void addNode(Object value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);
    }

    public void addNode(Object value, int index) {
        Node newNode = new Node(value);

        Node parent = getNode(index - 1);
        Node child = parent.getNext();

        parent.setNext(newNode);
        newNode.setNext(child);
    }

    public Node getNode(int index) {
        Node currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
            if (currentNode == null) { break; }
        }

        return currentNode;
    }

    public Node removeNode(int index) {
        Node parent = getNode(index - 1);
        Node removed = parent.getNext();
        parent.setNext(removed.getNext());

        return removed;
    }

}
