package lesson22.homework;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void purr () {
        System.out.println("Purring...");
    }

    public void scratch () {
        System.out.println("Scratching...");
    }

    public void bite() {
        System.out.println("Bites..");
    }

}
