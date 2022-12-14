package com.company.springdi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class MyCoach implements Coach {
    private FortuneService service;

    public MyCoach(@Qualifier("randomFortune") FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "My coach is working";
    }

    @Override
    public String getDailyFortune() throws IOException {
        return service.getFortune();
    }
}
