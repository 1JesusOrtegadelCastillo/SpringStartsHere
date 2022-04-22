package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//2 - Creating a configuration file

// the configuration annotation helps spring to understand
// that his class is a configuration class.
@Configuration
//With @ComponentScan and basePackages we tell spring where to 
//look for classes annotated with stereotype annotations.
@ComponentScan(basePackages = "entity")
public class ProjectConfig {

}
