package com.company.core.courseNote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CollectionHolderMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("courseNote/applicationContext-collection.xml");
        CollectionHolder holder = context.getBean("myCollection", CollectionHolder.class);
//        List<String> myList = holder.getMyList();
//        System.out.println(holder.getMyList());
//        myList.set(0,"Alisa");
        System.out.println(holder.getMyList());
        System.out.println(holder.getMySet());
        System.out.println(holder.getMyMap());
        System.out.println(holder.getPlayers());
        System.out.println(holder.getProperties());
    }
}
