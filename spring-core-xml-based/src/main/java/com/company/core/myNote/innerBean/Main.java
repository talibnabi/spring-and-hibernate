package com.company.core.myNote.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myNote/app-context-inner-bean.xml");
        Person person = context.getBean(Person.class);
        Person person1 = context.getBean(Person.class);
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
    }
}
