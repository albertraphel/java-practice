package com.in28.min;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.setSpeed(100);
        System.out.println("Ducati speed:" + ducati.getSpeed());

        honda.setSpeed(50);
        System.out.println("Honda speed: " + honda.getSpeed());

        ducati.increaseSpeed(50);
        System.out.println("After increase ducati speed: "+ ducati.getSpeed());

        honda.increaseSpeed(50);
        System.out.println("After increase honda speed: "+ honda.getSpeed());

        ducati.decreaseSpeed(25);
        System.out.println("After decreasing ducati speed: "+ ducati.getSpeed());

        honda.decreaseSpeed(25);
        System.out.println("After decreasing honda speed: "+ honda.getSpeed());



    }
}
