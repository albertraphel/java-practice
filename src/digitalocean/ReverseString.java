package digitalocean;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        System.out.println("Before reversal");
        System.out.println(s);
        System.out.println("After reversal");
        reverseString(s);
    }

    public static void reverseString(String s){
       char[] charArray = s.toCharArray();
       for(int i = charArray.length; i>0; i--){
           System.out.print(charArray[i-1]);
       }
    }
}
