package com.company.core.courseNote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailMenu {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("courseNote/applicationContext-collection-merge.xml");
        EmailDetails details = context.getBean("emailDetails", EmailDetails.class);
        System.out.println(details.getDetails());
    }
}
