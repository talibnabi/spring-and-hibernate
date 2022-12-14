package com.company.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
//@Scope("prototype")
public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("START UP");
    }

    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("CLEAN UP");
    }

    @Autowired
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
