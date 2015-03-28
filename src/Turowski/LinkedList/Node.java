package Turowski.LinkedList;

public class Node {
    private Object value;
    private Node next;

    public Node() {
        next = null;
        value = null;
    }

    public Node(Object value) {
        setValue(value);
        setNext(null);
    }

    public Node(Object value, Node previous) {
        setValue(value);
        setNext(null);
        previous.setNext(this);
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