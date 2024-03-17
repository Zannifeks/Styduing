package lesson27;

public class Cat implements Runnable, Jumpable, Swimmable {
    @Override
    public void jump() {
        System.out.println("Cat jumps.");
    }

    @Override
    public void run() {
        System.out.println("Cat runs.");
    }

    @Override
    public void swim() {
        System.out.println("Cat swims.");
    }
}
