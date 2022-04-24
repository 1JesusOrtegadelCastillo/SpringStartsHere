package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // <- we instruct Spring to create an instance of the class and add it to its context.
public class Person {

    private String name = "Tomassinho";

    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot){ // to create the Person instance, Spring needs to have a Parrot bean.
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
