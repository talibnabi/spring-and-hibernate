package com.company.core.multilocations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstrumentConfig {
    @Bean
    public Instrument instrument() {
        return new Instrument("Piano");
    }
}
