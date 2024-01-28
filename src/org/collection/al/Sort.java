package org.collection.al;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        Collections.sort(list);
        System.out.println("Sorted array is::"+ list);
    }
}
