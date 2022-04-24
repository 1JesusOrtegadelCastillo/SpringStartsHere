package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "Giyu";

    private final Person person;

    @Autowired
    public Parrot(Person person){ //// to create the Parrot instance, Spring needs to have a Person bean.
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
