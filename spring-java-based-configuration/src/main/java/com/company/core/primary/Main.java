package com.company.core.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(VehicleConfiguration.class);
        context.getBean(Person.class).driveVehicle();
    }
}
