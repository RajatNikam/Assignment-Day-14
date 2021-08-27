package com.blz.Assignment14;

public class Main {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.push(70);
        myList.push(30);
        myList.push(56);

        myList.peek();
        myList.pop();
        System.out.println();
        myList.pop();
        System.out.println();
        myList.pop();

        myList.printList();
    }
}