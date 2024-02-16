package lesson15;

/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson #15
 *
 * @Version 16.02.2024
 */
public class Lesson15 {
    public static void main(String[] args) {
        int a = 10;
        Cat cat = new Cat("Tom", "black", 3, 10);
        cat.voice();
        System.out.println(cat.name + ", " + cat.colour + ", " + cat.age);

        Cat cat1 = new Cat("Garfild", "red", 5, 10);
        cat1.voice();
        System.out.println(cat1.name + ", " + cat1.colour + ", " + cat1.age);
        cat1.eat(5);
        System.out.println(cat1.wellFed());
    }
}
