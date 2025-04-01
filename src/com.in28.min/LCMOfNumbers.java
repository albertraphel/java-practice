package com.in28.min;

public class LCMOfNumbers {

    int n1 = 0;
    int n2 = 0;
    public LCMOfNumbers(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public int lcmCalculator(){
        if(this.n1 <0 || this.n2 < 0){
            return -1;
        }
        if(this.n1 == 0 || this.n2 ==0){
            return 0;
        }

        int max = Math.max(this.n1, this.n2);
        int lcm = max;

        while(true){
            if(lcm%n1 ==0 && lcm%n2 == 0){
                return lcm;
            }
            lcm = lcm + max;

        }
    }
}
