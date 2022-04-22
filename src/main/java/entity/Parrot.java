package entity;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// By using the @Component annotation over the class, we instruct Spring to create
// an instance of this class and add it to its context.
@Component
public class Parrot {

    //Creating a class with only 1 attribute

    private String name;

    public Parrot(){ }

    @PostConstruct
    public void init(){
        this.name = "Giuseppe";
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
