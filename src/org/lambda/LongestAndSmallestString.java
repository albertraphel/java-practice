package org.lambda;

import java.util.Arrays;
import java.util.List;

public class LongestAndSmallestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Green", "Red", "Yellow", "TEstColor", "White", "Blu");

        System.out.println("Longest::: "+ list.stream()
                    .mapToInt(String::length)
                .max()
                .orElse(0)
        );

        System.out.println("Smallest:::" + list.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0));
    }
}
