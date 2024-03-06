package lesson22.homework;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void walk () {
        System.out.println("Walking...");
    }

    public void run () {
        System.out.println("Running...");
    }

    @Override
    public String toString () {
        return "Animal " +
                "named as " + name + '\'' +
                '.';
    }
}
