package com.company.spring;


public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Happy fortune.";
    }
}
