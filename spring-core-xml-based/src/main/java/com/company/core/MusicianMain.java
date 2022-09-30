package com.company.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicianMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-musician.xml");
        Musician musician = context.getBean("musician", Musician.class);
        System.out.println(musician);
    }
}
