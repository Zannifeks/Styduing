package lesson22.homework.difficultPlus;

public class HumanType extends Nps{
    public HumanType(String name, int age, int hp) {
        super(name, age, hp);
    }

    protected void taxes () {
        System.out.println("Paying taxes for their kingdom");
    }
}
