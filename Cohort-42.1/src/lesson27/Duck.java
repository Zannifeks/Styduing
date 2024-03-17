package lesson27;

public class Duck implements Flyable, Runnable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck flying.");
    }

    @Override
    public void run() {
        System.out.println("Duck runs.");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
