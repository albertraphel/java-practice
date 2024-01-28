package org.streams;

import java.util.List;

public class CountStartingLetter {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Sam", "Greg", "Ryan", "Raju", "Rinto", "Shinto");
        long count = names.stream()
                .filter(n -> n.startsWith(String.valueOf('R')))
                .count();
        System.out.println("Count of names starting with R is: " + count);


    }
}
