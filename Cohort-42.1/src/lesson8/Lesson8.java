package lesson8;

import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = {5, 3, 4 , -1 ,6};
        array[0] = 12;
        String[] strings;
        System.out.println(array[0] + " " + array2[3]);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array2));
    }
}
