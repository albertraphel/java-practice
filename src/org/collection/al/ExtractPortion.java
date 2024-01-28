package org.collection.al;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Pink");
        al.add("Red");
        al.add("Yellow");
        al.add("Green");
        al.add("Blue");
        al.add("Orange");
        List<String> al2 = al.subList(0,3);
        System.out.println(al2);
    }
}
