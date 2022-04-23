package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // <- we instruct Spring to create an instance of the class and add it to its context.
public class Person {
    private String name = "Tengen";

    private Parrot parrot;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Autowired // Requesting Spring for a bean to inject from its context
    public void setParrot(Parrot parrot){ // <- Injecting Parrot bean into the setter
        this.parrot = parrot;
    }

}
