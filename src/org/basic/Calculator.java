package org.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        System.out.println("Sum: "+ (num1 + num2));
        System.out.println("Diff: "+ (num1 - num2));
        System.out.println("Mul: "+ num1 * num2);
        System.out.println("Div: "+ num1/num2);


    }
}