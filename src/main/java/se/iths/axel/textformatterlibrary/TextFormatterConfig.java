package se.iths.axel.textformatterlibrary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextFormatterConfig {

    @Bean
    public TextFormatter textFormatter() {
        return new TextFormatter();
    }
}
