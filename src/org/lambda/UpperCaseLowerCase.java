package org.lambda;

import java.util.Arrays;
import java.util.List;

public class UpperCaseLowerCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Pineapple");

        System.out.println("Original:::" + list);
        list.replaceAll(s -> s.toUpperCase());
        System.out.println("After UpperCase:::" + list);

        list.replaceAll(l->l.toLowerCase());
        System.out.println("After LowerCase:::" + list);
    }
}
