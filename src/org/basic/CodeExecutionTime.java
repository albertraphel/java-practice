package org.basic;

public class CodeExecutionTime {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i< 1000; i++){
            System.out.print(i);
        }
        System.out.println("\nTime taken: "+ (System.currentTimeMillis() -startTime));
    }
}
