package com.company.core.courseNote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("courseNote/applicationContext-circular.xml");
        Department department = context.getBean("dept", Department.class);

    }
}
