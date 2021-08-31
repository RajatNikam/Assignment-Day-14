package com.blz.Assignment14;

public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void enqueue(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public void peek() {
        System.out.println("peek is : " + head.data);
    }

    public void dequeue() {
        Node temp = head;
        head = temp.next;

        printList();
        if (head == null) {
            System.out.println("Stack is empty");
        }
    }
}