package com.company.springdi;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "30 minutes track workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
