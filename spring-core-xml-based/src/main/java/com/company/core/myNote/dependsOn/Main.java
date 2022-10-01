package com.company.core.myNote.dependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("myNote/app-context-depends-on.xml");
        context.getBean(Aitaj.class);
        context.getBean(Lamiya.class);
        context.getBean(Alisa.class);
    }
}
