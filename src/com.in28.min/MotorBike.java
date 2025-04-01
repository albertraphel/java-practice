package com.in28.min;

public class MotorBike {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0){
            System.out.println("Not a valid number");
        }
        this.speed = speed;
    }

    public void increaseSpeed(int speedToIncrease){
        this.setSpeed(this.speed + speedToIncrease);
    }

    public void decreaseSpeed(int speedToDecrease){
        this.setSpeed(this.speed - speedToDecrease);
    }
}
