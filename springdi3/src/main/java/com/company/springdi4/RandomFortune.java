package com.company.springdi4;


import java.util.Random;

public class RandomFortune implements FortuneService {
    private static final Random random = new Random();
    private static final String[] fortuneArr = {"Happy", "Bad","Normal"};

    @Override
    public String getFortune() {
        return getRandomFortuneFromArray(fortuneArr);
    }

    private static String getRandomFortuneFromArray(String[] arr) {
        int randomIndex = random.nextInt(arr.length);
        return fortuneArr[randomIndex];
    }
}
