package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,4,2,5,3,6,4,6,7,8,9,5,6,7);

        List<Integer> finalList = num.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Final List: "+ finalList);
    }
}
