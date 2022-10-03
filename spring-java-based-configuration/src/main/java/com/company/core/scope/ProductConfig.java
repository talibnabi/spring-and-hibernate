package com.company.core.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.company.core.scope")
public class ProductConfig {
    @Bean
    public Product laptop() {
        return new Product(1, "LapTop");
    }

    @Bean
    public Product mobile() {
        return new Product(2, "Mobile");
    }

//    @Bean
//    public Cart shoppingCart() {
//        return new Cart();
//    }
}
