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
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);




    }

}
