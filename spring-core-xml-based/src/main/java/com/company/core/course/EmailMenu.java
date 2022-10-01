package com.company.core.course;

import com.company.core.course.EmailDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailMenu {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-collection-merge.xml");
        EmailDetails details = context.getBean("emailDetails", EmailDetails.class);
        System.out.println(details.getDetails());
    }
}
