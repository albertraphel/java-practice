package org.basic;

import java.util.Scanner;

public class CapitalizeFirstLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = in.nextLine();

        String uppercase = "";

        Scanner s = new Scanner(sentence);
        while(s.hasNext()){
            String word = s.next();
            uppercase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(uppercase);
    }
}
