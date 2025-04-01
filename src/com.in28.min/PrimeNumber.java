package com.in28.min;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int number = scanner.nextInt();

            boolean isPrime = isPrime(number);
            if (isPrime) {
                System.out.println(number + " is prime number");
            } else {
                System.out.println(number + " is not prime number");
            }
            System.out.println("Do you want to enter other number? ");
            String response = scanner.next();

            if(response.equalsIgnoreCase("no")){
                System.out.println(" Thank you for using the program: ");
                break;
            }
        }

    }

    public static Boolean isPrime(int number){

        for(int i = 2; i< number -1; i ++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
