package org.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondlargeAndSmall {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,5,3,4,6,7,8,9,21,43,56,334,9);
        int s = num.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second smallest number is: "+ s);

        int l = num.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second largest number is: "+ l);

    }
}
