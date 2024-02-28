package lesson19;

import java.util.ArrayList;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #19
 * @Author Rodion Shilinski
 * @Version 28.02.2024
 */
public class Lesson19 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        ra.add(8);
        ra.add(12);
        ra.add(-1);
        ra.add(15);
        System.out.println(ra);
        System.out.println(ra.get(2));
        ra.remove(2);
        System.out.println(ra);
    }
}
