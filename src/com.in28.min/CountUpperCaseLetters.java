package com.in28.min;

public class CountUpperCaseLetters {
    public static void main(String[] args) {
        System.out.println(countUpperCase("HGkjbaskjdhfkjhGHkjlbhdfkljbkljglGULUIG;KJUKJgjB "));
    }

    public static int countUpperCase(String str){

        if(str.isEmpty()){
            return -1;
        }

        int count =0;

        for(int i=0; i< str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
