package ds.stack;

import java.util.Stack;

public class StringReverse {

    public static String reverse(String string) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = string.toCharArray();


        for (char c : charArray) {
            stack.push(c);
        }

        for (int i = 0; i < string.length(); i++) {
            charArray[i] = stack.pop();
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("Before Reverse: " + str);
        System.out.println("After Reverse: " + reverse(str));
    }
}
