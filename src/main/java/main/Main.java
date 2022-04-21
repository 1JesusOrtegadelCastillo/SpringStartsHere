package main;

import config.ProjectConfig;
import entity.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        //3 - Setting up spring context

        // Defining Spring context, and modifying Spring instantiation to use ProjectConfig.class
        //configuration when context is initialized
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // calling the object instance (Bean) from spring context
        //Specifying which instance we are calling by adding a new parameter before Parrot.class
        Parrot p2 = context.getBean("parrot2", Parrot.class);
        System.out.println(p2.getName());

        // calling the last Bean
        Parrot p3 = context.getBean("parrot3", Parrot.class);
        System.out.println(p3.getName());




    }

}
