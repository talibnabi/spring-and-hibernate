package com.company.springcorefirst;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringsecurityApplication {

    public static void main(String[] args) {
        /*
        We can achieve Inversion of Control through various mechanisms such as:
        Strategy design pattern, Service Locator pattern, Factory pattern, and Dependency Injection (DI).
        * */

        /*https://martinfowler.com/articles/injection.html
        * */

        /**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();
    }

}
