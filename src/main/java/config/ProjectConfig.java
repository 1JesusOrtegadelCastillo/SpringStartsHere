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
    public Person person(Parrot parrot){ // <- Dependency Injection (receiving a parameter of type Parrot)
        Person p = new Person();
        p.setName("Jose");
        p.setParrot(parrot); // <-- setting the reference of the parameter (Parrot) to return Person attribute
        return p;
    }

}
