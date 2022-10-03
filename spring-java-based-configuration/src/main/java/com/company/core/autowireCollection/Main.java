package com.company.core.autowireCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
        ProductViewer viewer = context.getBean(ProductViewer.class);
        viewer.viewProduct();
    }
}
