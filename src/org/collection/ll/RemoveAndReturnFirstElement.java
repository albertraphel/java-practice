package org.collection.ll;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Pink");
        ll.add("Black");
        ll.add("Red");
        ll.add("Yellow");
        ll.add("Blue");
        System.out.println("Before removing:: " + ll);
        ll.pop();
        System.out.println("After removing:: " + ll);
    }
}
