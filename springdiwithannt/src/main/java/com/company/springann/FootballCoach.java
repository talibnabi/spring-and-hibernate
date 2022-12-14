package com.company.springann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    private final FortuneService fortuneService;

//    @Autowired
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "30 minutes worked.";
    }

    @Override
    public String getCoachFortune() {
        return fortuneService.getFortune();
    }
}
