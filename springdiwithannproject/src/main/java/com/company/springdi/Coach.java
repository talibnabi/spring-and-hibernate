package com.company.springdi;

import java.io.IOException;
import java.util.List;

public interface Coach {
    String getDailyWorkout();

    List<String> getDailyFortune() throws IOException;
}
