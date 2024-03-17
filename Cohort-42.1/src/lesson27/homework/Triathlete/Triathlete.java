package lesson27.homework.Triathlete;

public class Triathlete implements Runner, Swimmer{
    @Override
    public void run() {
        System.out.println("Triathlete running");
    }

    @Override
    public void swim() {
        System.out.println("Triathlete swimming");
    }


}
