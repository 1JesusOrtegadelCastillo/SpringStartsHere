package config;

import entity.Parrot;
import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//2 - Creating a configuration file
@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){ // instance of Parrot 1
        Parrot p = new Parrot();
        p.setName("Jerry");
        return p;
    }

    @Bean
    public Parrot parrot2(){ // instance of Parrot 2
        Parrot p = new Parrot();
        p.setName("Tom"); // <--- here's Tom
        return p;
    }

    @Bean
    public Person person (Parrot parrot2){ // the name of the parameter matches the name of the bean representing Tom.
        Person p = new Person();
        p.setName("Leonidas");
        p.setParrot(parrot2); 
        return p;
    }

}
