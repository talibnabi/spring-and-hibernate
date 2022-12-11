package com.company.springcorefirst;

public class MyApp {
    public static void main(String[] args) {
        Coach coach=new BaseballCoach();
        Coach coach1=new TrackCoach();
        String daily=coach.getDailyWorkout();
        String daily2=coach1.getDailyWorkout();
        System.out.println(daily);
        System.out.println(daily2);
    }
}

