package lesson22.homework;

public class Animal {

    private String name;

    protected int age;

    protected int size;

    public Animal(String name, int age, int size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public void walk () {
        System.out.println("Walking...");
    }

    public void run () {
        System.out.println("Running...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                '}';
    }
}
