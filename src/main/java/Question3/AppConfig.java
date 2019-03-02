package Question3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Samsung getSamsung(){
        return new Samsung();
    }

    @Bean
    public Nokia getNokia(){
        return new Nokia();
    }



}
