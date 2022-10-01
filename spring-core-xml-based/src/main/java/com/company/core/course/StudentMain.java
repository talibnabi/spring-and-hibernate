package com.company.core.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("course/applicationContext-collaboration.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
