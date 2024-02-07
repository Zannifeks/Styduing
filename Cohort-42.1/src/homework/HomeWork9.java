package homework;

import java.util.Random;

public class HomeWork9 {
    public static void main(String[] args) {

    }

    static int[] createFilledArray (int len, int bound) {
        int[] a = new int[len];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(bound);
        }
        return a;
    }

    static void task1(int n) {
        for (int i =1; i <= n; i++) {
            
        }
    }
}
