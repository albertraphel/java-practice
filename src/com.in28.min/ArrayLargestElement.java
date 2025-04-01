package com.in28.min;

public class ArrayLargestElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        System.out.println(doesHaveElementGreaterThan(array, number));
    }

    public static boolean doesHaveElementGreaterThan(int[] array, int number) {

        // TODO: Write your code

        if(array.length ==0){
            return false;
        }
        for(int i:array){
            if(i>number){
                return true;
            }

        }
        return false;
    }
}
