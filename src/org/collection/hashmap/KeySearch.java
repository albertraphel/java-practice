package org.collection.hashmap;

import java.util.HashMap;

public class KeySearch {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("USA", "Washington");
        hm.put("India", "Delhi");
        hm.put("Australia", "Canberra");
        hm.put("UK", "London");
        hm.put("Italy", "Venice");

        if(hm.containsKey("India")){
            System.out.println("India  yes::: "+ hm.get("India"));
        } else {
            System.out.println("Srilanka - No:::");
        }

        if(hm.containsKey("Srilanka")){
            System.out.println("Srilanka- Yes::: "+ hm.get("Srilanka"));
        } else {
            System.out.println("Srilanka - No:::");
        }
    }
}
