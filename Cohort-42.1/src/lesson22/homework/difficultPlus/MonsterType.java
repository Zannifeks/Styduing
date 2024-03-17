package lesson22.homework.difficultPlus;

public class MonsterType extends Nps{
    public MonsterType(String name, int age, int hp) {
        super(name, age, hp);
    }

    protected void hunting () {
        System.out.println("Stealing humans");
    }
}
