package lesson25.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW# 25
 *
 * @version 11.03.2024
 */

public class HomeWork {
    public static void main(String[] args) {
        Human[] humans = {new Human(10, 15), new Amateur(15, 10), new Pro(20, 5)};
        for (Human human : humans) {
            System.out.println(human.run());
        }
    }

}
