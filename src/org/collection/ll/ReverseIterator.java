package org.collection.ll;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterator {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Green");
        ll.add("Red");
        ll.add("Blue");
        ll.add("White");
        ll.add("Pink");
        ll.add("Black");

        Iterator it = ll.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
