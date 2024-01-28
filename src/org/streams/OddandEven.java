package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddandEven {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,5,3,4,6,7,8,9,21,43,56,334,9);

        List<Integer> odd = num.stream()
                .filter(n -> n%2 !=0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers are: "+ odd);

        List<Integer> even = num.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toList());

        System.out.println("Even numbers are: "+ even);
    }
}
