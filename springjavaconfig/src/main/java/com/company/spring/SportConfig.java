package com.company.spring;

//import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.company.spring")
public class SportConfig {
    @Bean
    public FortuneService happyFortuneService() {
        HappyFortuneService happyFortuneService=new HappyFortuneService();
        return happyFortuneService;
    }

    @Bean
    public Coach tennisCoach() {
        TennisCoach tennisCoach = new TennisCoach(happyFortuneService());
        return tennisCoach;
    }
}
