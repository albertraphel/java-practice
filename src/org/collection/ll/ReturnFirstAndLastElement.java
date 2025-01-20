package org.collection.ll;

import java.util.LinkedList;

public class ReturnFirstAndLastElement {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Green");
        ll.add("Red");
        ll.add("Blue");
        ll.add("White");
        ll.add("Pink");
        ll.add("Black");
        System.out.println("Before removing:: " + ll);
        System.out.println("First element: " +ll.peekFirst());
        System.out.println("First element: " +ll.peekLast());
        System.out.println("After removing:: " + ll);

    }
}
