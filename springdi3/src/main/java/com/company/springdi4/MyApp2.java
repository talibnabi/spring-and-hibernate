package com.company.springdi4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach myCoach1 = context.getBean("myCoach", Coach.class);
        Coach myCoach2 = context.getBean("myCoach", Coach.class);
        System.out.println(myCoach1==myCoach2);
        context.close();
    }
}
