package lesson22;

public class Horse {
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("running...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                '}';
    }
}
