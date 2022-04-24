package config;

import entity.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//2 - Creating a configuration file
@Configuration
@ComponentScan(basePackages = "/entity/")
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
}
