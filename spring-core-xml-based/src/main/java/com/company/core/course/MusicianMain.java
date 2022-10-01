package com.company.core.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicianMain {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-musician.xml");
//        Musician musician = context.getBean("musician", Musician.class);
//        System.out.println(musician);
        ApplicationContext context = new ClassPathXmlApplicationContext("course/applicationContext-innerBean.xml");
        Musician musician = context.getBean("musician", Musician.class);
        musician.setMusicianName("Alisa");
        Instrument instrument=new Instrument();
        instrument.setInstrumentName("Tar");
        musician.setInstrument(instrument);
        System.out.println(musician);
    }
}
