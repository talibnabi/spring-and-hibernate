package com.company.springdi4;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getCoachInfo() {
        return "30 years old.";
    }
}
