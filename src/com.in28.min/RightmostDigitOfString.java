package com.in28.min;

public class RightmostDigitOfString {
    public static void main(String[] args) {

        System.out.println(getRightmostDigit("asd3f"));

    }

    public static int getRightmostDigit(String str) {

        if(str.isEmpty()){
            return -1;
        }

        for(int i = str.length()-1; i >= 0; i--){
            if(Character.isDigit(str.charAt(i))){
                return Character.getNumericValue(str.charAt(i));
            }
        }
        // TODO: Write your code here

        return -1;
    }
}
