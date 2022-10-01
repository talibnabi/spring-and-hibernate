package com.company.core.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("course/applicationContext-constructor.xml");
        Person person = context.getBean("person4", Person.class);
        System.out.println(person);
    }
}
