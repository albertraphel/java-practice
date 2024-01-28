package org.streams;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,4,3,65,567,568,3,65,8,35,5,5,78,9);

        int min = num.stream()
                .min(Integer::compare)
                .orElse(null);

        int max = num.stream()
                .max(Integer::compare)
                .orElse(null);

        System.out.println("Minimum value is: "+ min);
        System.out.println("Maximum value is: "+ max);

    }
}
