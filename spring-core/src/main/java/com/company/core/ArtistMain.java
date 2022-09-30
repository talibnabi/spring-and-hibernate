package com.company.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArtistMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        Artist artist = context.getBean("artist", Artist.class);
        System.out.println(artist);
    }
}
