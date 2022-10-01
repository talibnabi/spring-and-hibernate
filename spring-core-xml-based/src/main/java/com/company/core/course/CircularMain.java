package com.company.core.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("course/applicationContext-circular.xml");
        Department department = context.getBean("dept", Department.class);

    }
}
