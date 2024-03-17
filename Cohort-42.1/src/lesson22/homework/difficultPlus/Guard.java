package lesson22.homework.difficultPlus;

public class Guard extends HumanType{
    public Guard(String name, int age, int hp) {
        super(name, age, hp);
    }

    protected void duty () {
        System.out.println("Staying on guard");
    }
}
