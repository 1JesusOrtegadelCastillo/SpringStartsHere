package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//2 - Creating a configuration file

// the configuration annotation helps spring to understand
// that his class is a configuration class.
@Configuration
@ComponentScan(basePackages = "entity")
public class ProjectConfig {

}
