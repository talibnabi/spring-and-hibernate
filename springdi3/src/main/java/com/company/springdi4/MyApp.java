package com.company.springdi4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("footballCoach", Coach.class);
        System.out.println(coach.getCoachInfo());
        System.out.println(coach.getDailyFortune());
    }
}
