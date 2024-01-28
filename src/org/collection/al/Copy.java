package org.collection.al;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();
        al.add("Pink");
        al.add("Red");
        al.add("Yellow");
        al.add("Green");
        al.add("Blue");
        al2.add("Orange");
        al2.add("Black");
        al2.add("White");

        Collections.copy(al, al2);
        System.out.println("After copy, First List: " + al);
        System.out.println("After copy, Second List: " + al2);
    }
}
