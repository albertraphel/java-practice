package org.streams;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,2,7,4,8,9,4,5);
        double avg = num.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average is: "+ avg);
    }
}
