package com.company.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArtistMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-setter.xml");
        Artist artist = context.getBean("artist",Artist.class);
        System.out.println(artist);
    }
}
