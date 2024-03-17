package lesson22.homework.difficultPlus;

public class Goblin extends MonsterType{
    public Goblin(String name, int age, int hp) {
        super(name, age, hp);
    }

    protected void ambush () {
        System.out.println("Sitting in ambush");
    }
}
