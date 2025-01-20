package org.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();

        hs.add("Green");
        hs.add("Red");
        hs.add("Blue");
        hs.add("Yellow");
        hs.add("White");

        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
