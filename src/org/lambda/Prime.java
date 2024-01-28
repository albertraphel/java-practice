package org.lambda;

import java.util.function.Predicate;

public class Prime {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = (n) -> {
            if (n <= 1) {
                return false;
            }
            for(int i=2; i<= Math.sqrt(n); i++){
                if(n%2 == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(isPrime.test(5));
        System.out.println(isPrime.test(6));
        System.out.println(isPrime.test(7));
    }
}
