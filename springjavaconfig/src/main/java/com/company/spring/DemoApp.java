package com.company.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getCoachInfo());
    }
}
