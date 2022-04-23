package main;

import config.ProjectConfig;
import entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        //creating an instance of the Spring context based on the configuration of ProjectConfig.class
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person parrot's name: " + p.getParrot());

    }
}
