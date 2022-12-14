package com.company.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("tennisCoach", Coach.class);
        TennisCoach tennisCoach=context.getBean("tennisCoach",TennisCoach.class);
        System.out.println(coach.getCoachInfo());
        System.out.println(coach.getDailyFortune());
        System.out.println(tennisCoach.getEmail());
        System.out.println(tennisCoach.getTeam());
    }
}
