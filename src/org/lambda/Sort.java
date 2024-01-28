package org.lambda;

import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Pineapple");
        System.out.println("Original:::" + list);

        list.sort((a,b) -> a.compareTo(b));
        System.out.println("After Sort:::" + list);
    }
}
