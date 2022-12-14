package com.company.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("footballCoach", Coach.class);
        Coach coach1 = context.getBean("footballCoach", Coach.class);
        System.out.println(coach);
        System.out.println(coach1);
        System.out.println(coach==coach1);
        context.close();
    }
}
