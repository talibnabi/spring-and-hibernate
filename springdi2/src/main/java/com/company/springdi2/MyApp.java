package com.company.springdi2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach cricketCoach = context.getBean("myCoach", Coach.class);
        CricketCoach cricketCoach1 = context.getBean("myCoach", CricketCoach.class);
        String fortune = cricketCoach.getDailyFortune();
        String workout = cricketCoach.getDailyWorkout();
        System.out.println(fortune);
        System.out.println(workout);
//        cricketCoach1.setEmailAddress("talibnabiyev@gmail.com");
//        cricketCoach1.setTeam("NRDTLN");
        System.out.println("EMAIL: " + cricketCoach1.getEmailAddress());
        System.out.println("TEAM: " + cricketCoach1.getTeam());
    }
}
