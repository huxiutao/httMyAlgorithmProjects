package com.my.algorithm;

import com.my.algorithm.com.my.algorithm.Node;

public class ReverseLinkedList {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Node node01 = new Node("A");
        Node node02 = new Node("B");
        Node node03 = new Node("C");
        Node node04 = new Node("D");

        node01.setNext(node02);
        node02.setNext(node03);
        node03.setNext(node04);

        System.out.println(node01);
        Node node = reverse(node01);
        System.out.println(node);
        node = reverse(node);
        System.out.println(reverseByRecursion(node));
    }

    public static Node reverse(Node head) {

        Node prev = null;
        while (head != null) {
            Node temp = head.getNext();
            head.setNext(prev);
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static Node reverseByRecursion(Node head) {

        if (head == null || head.getNext() == null) {
            return head;
        }

        Node prev = reverseByRecursion(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);

        return prev;
    }

}
