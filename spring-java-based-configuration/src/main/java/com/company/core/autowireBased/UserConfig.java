package com.company.core.autowireBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    public UserRepo userRepo() {
        return new UserRepo();
    }

    //    @Bean
//    public UserService userService() {
//        return new UserService(userRepo());
//    }
    @Bean
    public UserService userService() {
        return new UserService();
    }
}
