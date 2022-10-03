package com.company.core.multilocations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ArtistConfig.class, InstrumentConfig.class);
        Artist artist = context.getBean(Artist.class);
        Instrument instrument = context.getBean(Instrument.class);
        System.out.println(artist);
        System.out.println(instrument);
    }
}
