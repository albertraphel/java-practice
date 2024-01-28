package org.exception;

public class IllegalArgument {
    public static void main(String[] args) {
        try {
            System.out.println(checkEven(9));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    private static int checkEven(int i) {
        if(i%2 != 0){
            throw new IllegalArgumentException("Number is not even");
        }
        return i%2;
    }
}
