package org.lambda;

import java.util.List;

public class SumAndProductOfList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        int sum = list.stream()
                .reduce(0, (x,y) -> x+y)
                .intValue();
        System.out.println("Sum:::" + sum);

        int product = list.stream()
                .reduce(1, (a,b) -> a*b)
                .intValue();
        System.out.println("Product:::" + product);

    }
}
