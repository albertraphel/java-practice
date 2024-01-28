package org.basic;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = in.nextLong();

        System.out.println("Sum of digit: "+ sum(num));
    }

   private static long sum(long n){

       long sum = 0;

        while (n != 0){
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
   }
}
