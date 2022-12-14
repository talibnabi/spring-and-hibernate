package com.company.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        FortuneService coach = context.getBean("randomFortune", FortuneService.class);
        System.out.println(coach.getFortune());
        context.close();
    }
}
