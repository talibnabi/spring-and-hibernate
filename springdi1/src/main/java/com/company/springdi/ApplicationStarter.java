package com.company.springdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStarter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        String workOut = coach.getDailyWorkout();
        System.out.println(workOut);
        context.close();
    }
}
