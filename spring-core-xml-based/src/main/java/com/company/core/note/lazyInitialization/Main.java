package com.company.core.note.lazyInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("note/app-context-lazy.xml");
        System.out.println("Application started.");
        context.getBean("holiday", Holiday.class);
        context.getBean("workday", Workday.class);
    }
}
