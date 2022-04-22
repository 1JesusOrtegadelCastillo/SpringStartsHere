package main;

import config.ProjectConfig;
import entity.Parrot;
import entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        //creating an instance of the Spring context based on the configuration of ProjectConfig.class
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Gets a reference to the Person bean from Spring context
        Person person = context.getBean(Person.class);

        //Gets a reference to the Parrot bean from Spring context
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name is: " + person.getName());

        System.out.println("Parrot's name is: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());

    }
}
