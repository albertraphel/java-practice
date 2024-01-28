package org.collection.ll;

import java.util.LinkedList;

public class InsertinMiddleLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Green");
        ll.add("Red");
        ll.add("Blue");
        ll.add("White");
        ll.add("Pink");
        ll.add("Black");

        ll.add(2, "Orange");

        System.out.println(ll);
    }
}
