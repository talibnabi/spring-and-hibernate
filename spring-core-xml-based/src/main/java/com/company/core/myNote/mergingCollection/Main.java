package com.company.core.myNote.mergingCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myNote/app-context-collection-merge.xml");
        Azerbaijan azerbaijan = context.getBean(Azerbaijan.class);
        System.out.println(azerbaijan.getProperties());
    }
}
