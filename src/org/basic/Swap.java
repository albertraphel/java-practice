package org.basic;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b =27;
        int temp;

        System.out.println("Before swap : a = " + a + " b= " + b);

        temp = a;
        a=b;
        b=temp;

        System.out.println("After swap : a = " + a + " b= " + b);


        System.out.println("Without using 3rd variable");

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swap: a = "+ a + " b= " +b);
    }
}
