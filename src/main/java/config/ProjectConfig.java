package config;

import entity.Parrot;
import entity.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//2 - Creating a configuration file
@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){ // instance parrot 1
        Parrot p = new Parrot();
        p.setName("Jerry");
        return p;
    }

    @Bean
    public Parrot parrot2(){ // instance parrot 2
        Parrot p = new Parrot();
        p.setName("Tom"); // <--- here's Tom
        return p;
    }

    @Bean
    public Person person (
            @Qualifier("parrot2") Parrot parrot){ // Using @Qualifier you specify a specific bean from the context.
        Person p = new Person();
        p.setName("Leonidas");
        p.setParrot(parrot);
        return p;
    }

}
