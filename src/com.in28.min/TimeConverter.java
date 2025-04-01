package com.in28.min;

public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        if(hours<0){
            return -1;
        }
        int minutes = hours*60;
        return minutes;
    }

    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        if(days<0){
            return -1;
        }

        return days*12*60;
    }

    public static void main(String[] args) {
        System.out.println(convertDaysToMinutes(2));
        System.out.println(convertHoursToMinutes(2));
    }
}
