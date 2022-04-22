package config;

import entity.Parrot;
import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//2 - Creating a configuration file
@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Donatello");
        return p;
    }

    @Bean
    public Person person(){
        Person p = new Person();
        p.setName("Jose");
        p.setParrot(parrot()); // <-- here's the direct call to the parrot() method.
        return p;
    }

}
