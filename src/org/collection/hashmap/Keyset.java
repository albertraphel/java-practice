package org.collection.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Keyset {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("USA", "Washington");
        hm.put("India", "Delhi");
        hm.put("Australia", "Canberra");
        hm.put("UK", "London");
        hm.put("Italy", "Venice");

        Set keySet = hm.keySet();
        System.out.println("Keyset::: "+ keySet);
    }
}
