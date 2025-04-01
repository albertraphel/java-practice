package com.in28.min;

public class SumofSquares {
        public static long calculateSumOfSquares(int n) {
            // write your code here
            if(n < 0){
                return -1;
            }
            long result=0;
            for(long i=0; i < n; i++){
                result = result + i*i;
            }
            return result;
        }

    public static void main(String[] args) {
        System.out.println(calculateSumOfSquares(3));
    }
}
