package homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #4
 * @Author Rodion Shilinski
 * @Version 25.01.2024
 */

public class HomeWork3 {
    public static void main(String[] args) {
        //task 1
        int q = 0;
        int w = 1;
        int e = 2;
        int r = 3;
        int t = 4;
        int y = 5;
        int u = 6;
        int i = 7;
        int o = 8;
        int p = 9;
        int h = (q + w + e + r + t + y + u + i + o + p) / 10;
        System.out.println(h);
        //task 2
        int a = 1000;
        int b = 500;
        int s = ((a + b) * 10) / 100;
        int g = (a + b) - s;
        System.out.println(g);
        System.out.println("10% Discount");
        //task 3
        int mo = 1;
        int tu = 2;
        int we = 0;
        int th = 4;
        int fr = 6;
        int sa = 6;
        int su = 5;
        int sum_of_days = (mo + tu + we + th + fr + sa + su) / 7;
        System.out.println("Averege temperatur for the week: " +  sum_of_days + "°");
        //task 4
        int number1 = 69;
        int number2 = 94;
        System.out.println("Reminder of" + number1 + "divided on 2: " + number1 % 2);
        System.out.println("Reminder of" + number2 + "divided on 2: " + number2 % 2);
        System.out.println("Reminder of" + number1 + "divided on 3: " + number1 % 3);
        System.out.println("Reminder of" + number2 + "divided on 3: " + number2 % 3);
        //task 5
        int x = 3;
        x += x++;
        System.out.println(x);
        /*
        It will be 6
         */
    }
}
