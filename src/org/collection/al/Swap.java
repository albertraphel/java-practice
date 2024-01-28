package org.collection.al;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("Before Swap:" + a);
        Collections.swap(a, 0,2);
        System.out.println("After Swap:" + a);

    }
}
