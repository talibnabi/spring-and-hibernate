package com.company.springdi2;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CRICKET COACH");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Yes 30 minute";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
