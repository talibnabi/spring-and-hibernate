package com.company.springann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("footballCoach", Coach.class);
        System.out.println(coach.getCoachFortune());
        System.out.println(coach.getDailyWorkOut());
    }
}
