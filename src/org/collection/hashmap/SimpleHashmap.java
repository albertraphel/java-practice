package org.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "India");
        hm.put(2,"Srilanka");
        hm.put(3, "USA");

        for(Map.Entry x: hm.entrySet()){
            System.out.println(x.getKey() + "  " + x.getValue());
        }

    }
}
