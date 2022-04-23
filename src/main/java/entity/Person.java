package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // <- we instruct Spring to create an instance of the class and add it to its context.
public class Person {
    private String name = "Tengen";

    private final Parrot parrot; // <- we make the field final to ensure its value cannot change after initialization

    @Autowired // if you are using Spring 4.3 and above you can omit the @Autowired annotation
    public Person(Parrot parrot){ // <- DI using @Autowired through the constructor
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
