package com.company.core.autowireCollection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    @Bean("Meal")
    public Product product1() {
        return new Product(1, "Meal");
    }

    @Bean("Tobacco")
    public Product product2() {
        return new Product(2, "Tobacco");
    }

    @Bean("Sushi")
    public Product product3() {
        return new Product(3, "Sushi");
    }

    @Bean("Dead")
    public Product product4() {
        return new Product(4, "Dead");
    }


    @Bean
    public ProductViewer productViewer() {
        return new ProductViewer();
    }
}
