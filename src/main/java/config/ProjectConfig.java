package config;

import entity.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//2 - Creating a configuration file

// the configuration annotation helps spring to understand
// that his class is a configuration class.
@Configuration
public class ProjectConfig {

    // @Bean annotations tells Spring that this method has to be called when it initializes its context
    // and add the returned value into Spring context
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Rengoku"); //just setting a name
        return p;
    }

}
