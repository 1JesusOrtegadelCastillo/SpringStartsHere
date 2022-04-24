package entity;

public class Parrot {

    private String name;

    public Parrot(){
        System.out.println("Parrot created"); // two instances created inside Spring context (parrot1 and parrot2)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " +  name;
    }
}
