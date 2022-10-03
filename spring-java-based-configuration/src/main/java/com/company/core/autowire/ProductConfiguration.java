package com.company.core.autowire;

import com.company.core.autowire.Address;
import com.company.core.autowire.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
    @Bean
    public Product product() {
        Product product = new Product();
        product.setId(1);
        product.setProductDesc("Meal");
        return product;
    }

    @Bean
    public Address address() {
        return new Address(1, "Baku");
    }
}
