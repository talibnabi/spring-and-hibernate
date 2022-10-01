package com.company.core.courseNote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("courseNote/applicationContext-collaboration.xml");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
}
