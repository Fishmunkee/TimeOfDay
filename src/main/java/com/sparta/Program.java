package com.sparta;

public class Program {
    public static void main(String[] args) {
       int timeOfDay = 24;
       // short-circuiting operation - requires all to be true otherwise it short circuits the return and returns false
        String result = greeting(timeOfDay);
        System.out.println(result);
    }

    public static String greeting(int timeOfDay) {
        String greeting;
        if (timeOfDay < 0 || timeOfDay > 23) {
            greeting = "Error: Invalid selection!";
        } else if (timeOfDay >= 0 && timeOfDay <= 4){
            greeting = "Go back to sleep!";
        } else if (timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        } else if (timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
    }
}