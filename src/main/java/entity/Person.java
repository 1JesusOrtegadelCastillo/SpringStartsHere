package entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Spring creates a bean of type Person. But also needs to provide a value for the constructor's parameter
//If multiple beans of the same type are available, Spring will choose the bean with the same name as the parameter.
@Component

public class Person {

    private String name = "Venom";

    private final Parrot parrot;

    public Person(Parrot parrot2){ // <- this parameter (parrot2 of type Parrot)
        this.parrot = parrot2;
    }

    //Or using @Qualifier like this
    //public Person(@Qualifier("parrot2") Parrot parrot){
      //  this.parrot = parrot;
   // }

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
