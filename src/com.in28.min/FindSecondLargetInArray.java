package com.in28.min;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindSecondLargetInArray {
    public static void main(String[] args) {
        int[] array = {1, 22, 13, 43, 5};
        System.out.println( findSecondLargestElement(array));
    }

    public static int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        if(array.length < 1){
            return -1;
        }
        Arrays.sort(array);

        if(array[array.length-1] != array[0] ){
            return array[array.length-2];
        } else {
            return -1;
        }

    }
}
