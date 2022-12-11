package com.company.springdi2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach cricketCoach = context.getBean("myCoach", Coach.class);
        String fortune = cricketCoach.getDailyFortune();
        String workout = cricketCoach.getDailyWorkout();
        System.out.println(fortune);
        System.out.println(workout);
    }
}
