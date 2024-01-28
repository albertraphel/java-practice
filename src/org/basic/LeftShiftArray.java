package org.basic;

import java.util.Arrays;

public class LeftShiftArray {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,9,5,7,1,0};
        int first = arr[0];
        System.out.println("Before left shift: "+ Arrays.toString(arr));
        for(int i=1; i< arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;

        System.out.println("After left shift: "+ Arrays.toString(arr));
    }
}
