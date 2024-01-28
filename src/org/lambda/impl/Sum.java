package org.lambda.impl;

import org.lambda.interfaces.SumCalculator;

public class Sum {

    public static void main(String[] args) {
        SumCalculator sum = (a, b) -> a + b;
        System.out.println(sum.sum(10, 20));
        System.out.println(sum.sum(100, -200));
    }
}
