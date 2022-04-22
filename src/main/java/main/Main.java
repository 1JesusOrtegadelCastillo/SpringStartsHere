package main;

import config.ProjectConfig;
import entity.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args){

        //3 - Setting up spring context

        // Defining Spring context, and modifying Spring instantiation to use ProjectConfig.class
        //configuration when context is initialized
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot(); // creating the instance we want to add to Spring context.
        x.setName("Timmy"); // setting name

        Supplier<Parrot> parrotSupplier = () -> x; // defining a supplier

        context.registerBean("parrot1", Parrot.class, parrotSupplier); //calling register bean to add instance to Spring context.

        //we can also set a primary bean just like with the @Primary annotation:
        //context.registerBean("parrot2", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

        Parrot p = context.getBean(Parrot.class); // referring to the Parrot bean and putting it inside a variable
        System.out.println(p.getName()); // printing its name in the console to verify it's working
    }
}
