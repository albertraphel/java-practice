package org.collection.al;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Pink");
        al.add("Red");
        al.add("Yellow");
        al.add("Green");
        al.add("Blue");
        al.add("Orange");
        if(al.contains("Red")){
            System.out.println("Found");
        }

    }
}
