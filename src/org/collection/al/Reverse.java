package org.collection.al;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Pink");
        al.add("Red");
        al.add("Yellow");
        al.add("Green");
        Collections.reverse(al);
        System.out.println(al);
    }
}
