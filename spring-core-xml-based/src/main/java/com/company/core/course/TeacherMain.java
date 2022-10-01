package com.company.core.course;

import com.company.core.course.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-collaboration.xml");
        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
}
