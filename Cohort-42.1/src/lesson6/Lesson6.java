package lesson6;

import java.util.Scanner;

/**
 *Lesson #6
 */
public class Lesson6 {
    public static void main(String[] args) {
//Switch
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 1, 2 pr 3");
//        int n = scanner.nextInt();
//        switch (n) {
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            default:
//                System.out.println("Wrong number!");
//        }
        //loop while
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        //while string
        String str ="4317";
        System.out.println(str);
        int p = 0;
        do {
            System.out.println(str.charAt(p));
            p++;
        } while (p < str.length());
    }
}
