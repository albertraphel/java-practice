package org.collection.al;

import java.util.ArrayList;

public class Compare2AL {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Pink");
        al.add("Red");
        al.add("Yellow");
        al.add("Green");
        al.add("White");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Pink");
        al2.add("Yellow");
        al2.add("Green");
        al2.add("Blue");
        ArrayList<String> al3 = new ArrayList<String>();
        for(String s: al){
            al3.add(al2.contains(s) ? "Yes" : "No");
        }
        System.out.println(al3);
    }
}
