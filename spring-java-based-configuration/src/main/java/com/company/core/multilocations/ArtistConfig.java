package com.company.core.multilocations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(InstrumentConfig.class)
public class ArtistConfig {
    @Value("#{instrument}")
    private Instrument instrument;

    @Bean
    public Artist artist() {
        return new Artist(instrument);
    }
//    @Bean
//    public Artist artist() {
//        return new Artist(new Instrument("Tar"));
//    }
}
