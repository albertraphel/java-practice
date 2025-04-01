package com.in28.min;

import java.util.Scanner;

public class PrintNumberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        while(true){

            int number = scanner.nextInt();
            for(int i = 0; i<=number; i++){
                for (int j=0; j<=i; j++) {
                    System.out.print(j +" ");
                }
                System.out.println();
            }

            System.out.println("Do you want to enter other number?");
            String response = scanner.next();
            if(response.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the program");
                break;
            }
        }
    }
}
