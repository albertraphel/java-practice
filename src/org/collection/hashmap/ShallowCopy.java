package org.collection.hashmap;

import java.util.HashMap;

public class ShallowCopy {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1, "India");
        hm.put(2,"Srilanka");
        hm.put(3, "USA");
        hm.put(4, "UK");
        hm.put(5, "Canada");

        HashMap<Integer,String> hm2 = new HashMap<Integer, String>();

        hm2 = (HashMap<Integer, String>) hm.clone();
        System.out.println("Cloned:::: "+ hm2);

    }
}
