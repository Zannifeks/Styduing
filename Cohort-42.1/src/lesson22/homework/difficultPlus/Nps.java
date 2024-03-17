package lesson22.homework.difficultPlus;

public class Nps {

    protected String name;

    protected int age;

    protected int hp;

    public Nps(String name, int age, int hp) {
        this.name = name;
        this.age = age;
        this.hp = hp;
    }

    public void walk () {
        System.out.println("Walking...");
    }

    public void run () {
        System.out.println("Running...");
    }

    public void eat () {
        System.out.println("Eating...");
    }

}
