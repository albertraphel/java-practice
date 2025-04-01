package digitalocean;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the String: ");
            String str = scanner.next();
            if (str.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            String reversedSB = reverseUsingStringBuilder(str);
            if (str.equals(reversedSB)) {
                System.out.println(str + " is palindrome");
            } else {
                System.out.println(str + " is not palindrome");
            }

            System.out.println("Another logic");
            isPalindrome(str);
        }
        scanner.close();
    }

    public static String reverseUsingStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void isPalindrome(String s) {

        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(s + (isPalindrome ? " is " : " is not ") + "a palindrome");
    }
}
