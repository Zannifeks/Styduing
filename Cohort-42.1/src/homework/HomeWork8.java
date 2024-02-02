package homework;

import java.util.Arrays;
import java.util.Random;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #8
 * @author Shilinski Rodion
 * @version 1.02,2024
 */

public class HomeWork8 {
    public static void main(String[] args) {

        //task 1

        for ( int i = 1; i <= 10; i++) {
            System.out.println("Task " + i);
        }

        //task 2

        int[] array = {12, 565, 23, 45 ,12, 65, 34 , 27, 58, 55, 4535, 3451, 76, 14, 78, 234, 656 , 5680, 453, 764};
        for (int i : array) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        //task 3

        String[] s = {"Dog", "Cat", "Panda", "Elephant"};
        String strmaxLenhgt = "";
        for (String str : s) {
            if (str.length() > strmaxLenhgt.length()) {
                strmaxLenhgt = str;
            }
        }
        for (char chr : strmaxLenhgt.toCharArray()) {
            System.out.println(chr);
        }

        //task 4

        Random random = new Random();
        int[] n = new int[100];
        int sum = 0;
        //filling array with random int numbers
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(100);
        }
        int max = n[0];
        int min = n[0];
        //execute array
        for (int i : n) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < max) {
                min = i;
            }
        }
        System.out.println("Max = " + max + " Min = " + min + " Average = " + (sum / (double) n.length) + " " + (sum / n.length));

        //task 5

        String exp = "16 + 23 - 123 + 8";

        String[] tokens = new String[10];
        int idx = 0;
        String number = "";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            switch (ch) {
                case '+', '-', '*', '/':
                    tokens[idx] = number;
                    tokens[idx + 1] = String.valueOf(ch);
                    idx += 2;
                    number = "";
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    number += ch;
                    break;
            }
        }
        if (!number.isEmpty()) {
            tokens[idx] = number;
            idx++;
        }
        System.out.println(Arrays.toString(tokens));
        System.out.println(idx);
    }
}
