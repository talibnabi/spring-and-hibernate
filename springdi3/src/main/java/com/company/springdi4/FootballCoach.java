package com.company.springdi4;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void startup() {
        System.out.println("Start up.");
    }

    public void shutdown() {
        System.out.println("Shut down.");
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
