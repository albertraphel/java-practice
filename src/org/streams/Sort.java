package org.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List <Integer> num = List.of(5,2,7,4,8,9,4,5);

        List<Integer> sortedValues = num.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted values: "+ sortedValues);

        List<Integer> desc = num.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Descending order: "+ desc);
    }
}
