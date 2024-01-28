package org.basic;

public class Multiply2Arrays {
    public static void main(String[] args) {
        int [] arr1 = {2,4,6,8};
        int [] arr2 = {1,3,5,7};

        if(arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++){
                System.out.println(arr1[i] * arr2[i]);
            }
        } else {
            System.out.println("Length of array is different");
        }
    }
}
