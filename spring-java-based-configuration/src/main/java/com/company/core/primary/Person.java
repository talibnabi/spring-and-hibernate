package com.company.core.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    @Autowired
    @Qualifier("car")
    private Vehicle vehicle;

    public void driveVehicle() {
        vehicle.drive();
    }
}
