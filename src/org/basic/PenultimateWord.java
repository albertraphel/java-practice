package org.basic;

import java.util.Scanner;

public class PenultimateWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = in.nextLine();

        String [] words = s.split("[ ]+");
        System.out.println("Penultimae word: " + words[words.length -2]);
    }
}
