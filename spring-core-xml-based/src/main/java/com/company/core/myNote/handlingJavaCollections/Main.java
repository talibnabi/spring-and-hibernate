package com.company.core.myNote.handlingJavaCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myNote/app-context-collection-handling.xml");
        CollectionHolder holder = context.getBean(CollectionHolder.class);
        System.out.println(holder.getMyList());
        System.out.println(holder.getMySet());
        System.out.println(holder.getMyMap());
        System.out.println(holder.getProperties());
        System.out.println(holder.getMySoldier());
    }
}
