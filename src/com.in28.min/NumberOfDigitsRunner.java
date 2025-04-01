package com.in28.min;

import java.util.Scanner;

public class NumberOfDigitsRunner {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        while(true){

            int number = scanner.nextInt();
            int count = 0;
            if(number < 0 ){
                System.out.println("Enter valid number");
            } else if(number == 0){
                count = 1;
            } else {
                while(number !=0 ){
                    number = number/10;
                    count++;
                }
            }
            System.out.println("Number of digits = " + count);
            String response = scanner.next();
            if(response.equalsIgnoreCase("no")){
                System.out.println("Thanks for using the program!");
                break;
            }
        }
    }
}
