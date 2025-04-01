package com.in28.min;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        while(true){
            int number = scanner.nextInt();
            int result = 0;

            while(number != 0){
                result = result * 10 + number%10;
                number = number/10;
            }
            System.out.println("Reversed number: " + result);
            String response = scanner.next();
            if(response.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the program");
                break;
            }
        }
    }
}
