package lesson22.homework.difficultPlus;

public class Villager extends HumanType{
    public Villager(String name, int age, int hp) {
        super(name, age, hp);
    }

    protected void workOnFields () {
        System.out.println("Working on fields");
    }
}
