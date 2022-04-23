package entity;

public class Parrot {

    private String name;

    public Parrot(){
        System.out.println("Parrot created"); // <- no-args constructor to test
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot " +
                "name = '" + name + '\'';
    }
}
