package com.company.springdi;

import java.io.IOException;


public interface Coach {
    String getDailyWorkout();

    String getDailyFortune() throws IOException;
}
