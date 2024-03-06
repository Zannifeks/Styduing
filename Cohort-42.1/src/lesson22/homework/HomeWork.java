package lesson22.homework;

import lesson22.homework.test.Puma;

/**
 * AIT-TR, Java Basic, Cohort42.1, HM# 22
 * @author Rodion Shilinski
 * @version 06.03.2024
 */
public class HomeWork {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Big T", 6, 120);
        System.out.println(tiger);
        tiger.walk();
        tiger.roar();
        tiger.bite();


        HomeCat hcat = new HomeCat("Barsik", 3, 40);
        System.out.println(hcat);
        hcat.run();
        hcat.walk();
        hcat.purr();

        Manul manul = new Manul("Stepan", 2, 53);
        System.out.println(manul);
        manul.run();
        manul.scratch();
        manul.bite();

        Puma puma = new Puma("Makar", 3, 130);
        System.out.println(puma);
        // We cant use protected methods from another package same as private or default
        // Decision: Use public
        //int psize = puma.size;
    }
}
