package org.basic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");

        char [] letters = in.nextLine().toCharArray();

        System.out.println("Revere string: ");

        for(int i = letters.length -1; i >= 0; i--){
            System.out.print(letters[i]);
        }
    }
}
