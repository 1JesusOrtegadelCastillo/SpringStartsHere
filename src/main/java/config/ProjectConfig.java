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
    Parrot parrot1(){ // identifier used by the context is parrot1 not Rengoku
        var p = new Parrot();
        p.setName("Rengoku"); //just setting a name
        return p;
    }

    @Bean
    Parrot parrot2(){ // identifier used by the context is parrot1 not Rick
        var p = new Parrot();
        p.setName("Rick");
        return p;
    }

    @Bean
    Parrot parrot3(){ // identifier used by the context is parrot1 not Peacemaker
        var p = new Parrot();
        p.setName("Peacemaker");
        return p;
    }
}
