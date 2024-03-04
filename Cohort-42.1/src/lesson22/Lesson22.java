package lesson22;
/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson# 22
 * @author Rodion Shilinski
 * @version 28.02.2024
 */
public class Lesson22 {
    public static void main(String[] args) {
        Horse horse = new Horse("Thunder");
        System.out.println(horse);
        horse.run();

        Pegasus pegasus = new Pegasus("Peggy");
        System.out.println(pegasus);
        pegasus.run();
        pegasus.walk();
        pegasus.fly();
    }
}
