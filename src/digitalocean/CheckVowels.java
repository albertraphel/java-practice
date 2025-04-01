package digitalocean;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        checkVowel(s);
    }

    public static void checkVowel(String s){
        System.out.println(s.toLowerCase().matches(".*[aeiou].*"));
    }
}
