package com.in28.min;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2,5,3,7,5};
int [] reversed = reverseArray(array);
        for(int i =0; i< reversed.length-1;i++){
            System.out.println(reversed[i]);
        }
    }

    private static int[] reverseArray(int[] array) {
        int [] reversed = new int[array.length];
        int j =0;
        for(int i = array.length-1; i > 0 ; i--){
            reversed[j] = array[i];
            j++;
        }

        return reversed;
    }


}
