package com.company.springdi2;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Hey happy people";
    }
}
