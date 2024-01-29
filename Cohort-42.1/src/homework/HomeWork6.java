package homework;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #6
 * @author Shilinski Rodion
 * @version 26.01,2024
 */

public class HomeWork6 {
    public static void main(String[] args) {

        //task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2 or 3");
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

        String java;
        int count = 0;
        String task5 = "Please type 'Java' to end the task. ";
        do {
            count++;
            System.out.println(task5);
            java = scanner.next();
            task5 = "Sorry its wrong. Try again! ";
        } while (!java.equalsIgnoreCase("Java"));
        String attempt = (count == 1) ? " attempt" : " attempts";
        System.out.println("Congratulations!!! You solved it!");
        System.out.println("You used " + count + attempt + " to solved it");
    }
}