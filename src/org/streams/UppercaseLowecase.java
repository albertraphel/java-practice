package org.streams;

import java.util.List;
import java.util.stream.Collectors;

public class UppercaseLowecase {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Sam", "Greg", "Ryan");
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Upper:: "+ upper);
        List<String> lower = names.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Lower:: "+ lower);
    }
}
