package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"services", "proxies", "repositories"}) //inside brackets
public class ProjectConfiguration {
}
