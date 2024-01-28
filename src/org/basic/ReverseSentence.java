package org.basic;

public class ReverseSentence {
    public static void main(String[] args) {
        String s= "This is my entertainment";
        String [] splitted = s.split(" ");
        for(int i = splitted.length -1; i  >= 0; i--){
            System.out.println(splitted[i]);
        }

    }
}
