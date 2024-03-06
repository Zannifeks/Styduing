package lesson22.homework;

import lesson22.homework.test.Puma;

/**
 * AIT-TR, Java Basic, Cohort42.1, HM# 22
 * @author Rodion Shilinski
 * @version 06.03.2024
 */
public class HomeWork {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Big T");
        System.out.println(tiger);
        int tsize = tiger.size;
        System.out.println(tsize + "cm");
        tiger.walk();
        tiger.roar();
        tiger.bite();


        HomeCat hcat = new HomeCat("Barsik");
        System.out.println(hcat);
        int hcsize = hcat.size;
        System.out.println(hcsize + "cm");
        hcat.run();
        hcat.walk();
        hcat.purr();

        Manul manul = new Manul("Stepan");
        System.out.println(manul);
        int msize = manul.size;
        System.out.println(msize + "cm");
        manul.run();
        manul.scratch();
        manul.bite();

        Puma puma = new Puma("Makar");
        System.out.println(puma);
        // We cant use protected methods from another package same as private or default
        // Decision: Use public
        //int psize = puma.size;
    }
}
