package org.basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int reversed = reverse(n);
        if(n == reversed){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    private static int reverse(int n) {
        int reversed = 0;

        while (n !=0) {
            reversed = reversed * 10;
            reversed = reversed + n % 10;
            n = n/10;
        }

        return reversed;
    }
}
