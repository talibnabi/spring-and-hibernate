package com.company.springdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStarter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach1 = context.getBean("myCoach2", Coach.class);
        String workOut = coach.getDailyWorkout();
        String workOut2 = coach1.getDailyWorkout();
        System.out.println(workOut);
        System.out.println(workOut2);
        String fortune = coach.getDailyFortune();
        String fortune2 = coach1.getDailyFortune();
        System.out.println(fortune);
        System.out.println(fortune2);
        context.close();
    }
}
