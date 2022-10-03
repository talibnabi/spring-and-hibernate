package com.company.core.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        Product product = context.getBean(Product.class);
        Address address=context.getBean(Address.class);
        System.out.println(product);
        System.out.println(address);
    }
}
