package com.company.spring;

//import org.springframework.stereotype.Component;


import org.springframework.beans.factory.annotation.Value;

//@Component
public class TennisCoach implements Coach {

    private final FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getCoachInfo() {
        return "Tennis coach.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
