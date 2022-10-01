package com.company.core.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("course/applicationContext-depends-on.xml");
        context.getBean("init-dependent", InitializerDependent.class).print();
    }
}
