package org.basic;

import java.util.Scanner;

public class LowercaseASentence {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = in.nextLine();
        System.out.println(s.toLowerCase());
    }
}
