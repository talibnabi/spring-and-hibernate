package com.company.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration {
    @Bean("artist")
    public Artist artist() {
        return new Artist(1L, "Alisa", "Aslan");
    }
}
