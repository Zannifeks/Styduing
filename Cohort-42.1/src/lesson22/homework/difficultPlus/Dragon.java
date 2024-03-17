package lesson22.homework.difficultPlus;

public class Dragon extends MonsterType{
    public Dragon(String name, int age, int hp) {
        super(name, age, hp);
    }
    protected void collect () {
        System.out.println("Collecting gold in his cave");
    }
}
