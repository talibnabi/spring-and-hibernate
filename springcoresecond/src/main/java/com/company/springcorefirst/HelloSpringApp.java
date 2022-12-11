package com.company.springcorefirst;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach coach1 = context.getBean("myCoach2", Coach.class);
        Coach coach2 = context.getBean("myCoach", Coach.class);
        //call methods on the bean
        String workout = coach1.getDailyWorkout();
        String workout2 = coach2.getDailyWorkout();
        System.out.println(workout);
        System.out.println(workout2);
        //close the context
        context.close();
    }
}
