package homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #5
 * @Author Shilinski Rodion
 * @Version 26.01,2024
 */

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

        //task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2 pr 3");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Wrong number!");
        }

        //task 2

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7: ");
        int wDays = scanner1.nextInt();
        switch (wDays) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("You entered wrong number");
        }

        //task 3

        int task = 1;
        while (task <= 10) {
            System.out.println("Task " + task);
            task++;
        }

        //task 4

        int a = 1;
        do {
            a++;
            if (a % 5 == 0) {
                System.out.println(a);
            }
        } while (a <= 100);

        //task 5

        Scanner scanner2  =new Scanner(System.in);
        System.out.println("Type 'Jabka' to end the task: ");        /// Перевести всё в charAt посмотрим что выйдет
        String jabka = scanner2.nextLine();
        do {
            if (jabka.equals("Jabka")) {
                //System.out.println("False try again: ");
            } else {
                System.out.println("False try again: ");
            }
        } while (jabka.equals("Jabka")); {
            System.out.println("Congratulations");
        }
    }
}
