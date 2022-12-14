package com.company.springann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    //Field Inhjects
//    @Autowired
    private FortuneService fortuneService;

    /*Construtor injection */
//    @Autowired
//    public FootballCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    /*Setter Injection*/
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    @Autowired
    @Qualifier("randomFortuneService")
    public void serviceFortume(FortuneService fortuneService) {
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
