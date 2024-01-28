package org.exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("Result:: " + divideNumbers(5, 0));
        }  catch (ArithmeticException e){
            System.out.println("Error::" +e.getMessage());
        }

    }

    private static int divideNumbers(int i, int j) {

        if(j == 0 ){
            throw new ArithmeticException("Cannt divide by zero");
        }
        return i / j;
    }
}
