package com.my.algorithm.com.my.algorithm;

public class Node {
    private String name;
    private Node next;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", next=" + next +
                '}';
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
