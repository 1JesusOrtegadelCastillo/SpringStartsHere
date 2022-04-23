package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // <- we instruct Spring to create an instance of the class and add it to its context.
public class Person {
    private String name = "Miguel";

    @Autowired
    private Parrot parrot; // <- we instruct Spring to inject an appropriate value from its context.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
