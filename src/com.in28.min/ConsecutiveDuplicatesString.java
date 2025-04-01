package com.in28.min;

public class ConsecutiveDuplicatesString {
    public static void main(String[] args) {
        System.out.println(hasConsecutiveDuplicates("Hello"));
    }

    public static boolean hasConsecutiveDuplicates(String str) {

        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }

        return false;
    }
}
