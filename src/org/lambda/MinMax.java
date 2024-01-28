package org.lambda;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,576,4,76,6,34,5,7,34,567,89);

        int min = list.stream()
                .min((a,b) -> a.compareTo(b))
                .orElse(null);
        System.out.println("Min:::" + min);

        int max = list.stream()
                .max((a,b) -> a.compareTo(b))
                .orElse(null);

        System.out.println("Max:::" + max);
    }
}
