package com.company;

import java.util.AbstractList;
import java.util.function.Consumer;

/**
 * Created by Hank on 3/25/2015.
 */
public class LinkedList extends AbstractList<Object> {
    private Node head;
    private int listSize;

    public LinkedList() {
        head = new Node(null);
    }

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public boolean add(Object value) {
        addNode(value);
        return true;
    }

    @Override
    public void add(int index, Object value) {
        addNode(index, value);
    }

    private void addNode(Object value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);
        listSize++;
    }

    private void addNode(int index, Object value) {
        Node newNode = new Node(value);

        Node parent = getNode(index - 1);
        Node child = parent.getNext();

        parent.setNext(newNode);
        newNode.setNext(child);
        listSize++;
    }

    private Node getNode(int index) {
        Node currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
            if (currentNode == null) { break; }
        }

        return currentNode;
    }

    private Node removeNode(int index) {
        Node parent = getNode(index - 1);
        Node removed = parent.getNext();
        parent.setNext(removed.getNext());
        listSize--;
        return removed;
    }

    @Override
    public Object remove(int index) {
        Node removed = removeNode(index);
        return removed.getValue();
    }

    public Object get(int index) {
        if (index > listSize) return null;
        return getNode(index).getValue();
    }

    @Override
    public Object set(int index, Object element) {
        getNode(index).setValue(element);
        return element;
    }

}
