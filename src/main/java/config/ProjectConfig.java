package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//2 - Creating a configuration file
@Configuration
@ComponentScan(basePackages = "/entity/")
public class ProjectConfig {

}
