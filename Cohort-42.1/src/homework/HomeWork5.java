package homework;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #5
 * @Author Shilinski Rodion
 * @Version 26.01,2024
 */

public class HomeWork5 {
    public static void main(String[] args) {

        //task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int number1 = scanner.nextInt();
        System.out.println("Second number: ");
        int number2 = scanner.nextInt();
        boolean x1 = number1 % 2 == 0;
        boolean y1 = number1 % 3 == 0;
        boolean x2 = number2 % 2 == 0;
        boolean y2 = number2 % 3 == 0;
        boolean z1 = x1 && y1;
        boolean z2 = x2 && y2;
        System.out.println("Number: " + number1 + " even: " + x1 + ", multiple 3: " + y1 + " even and multiple 3: " + z1);
        System.out.println("Number: " + number2 + " even: " + x2 + ", multiple 3: " + y2 + " even and multiple 3: " + z2);

        //task 2

        System.out.println("Enter number from 1 to 3: ");
        int number = scanner.nextInt();
        String[] wrong = {"invalid number", "one", "two", "three"};
        String result = (number >= 1 && number <= 3) ? wrong[number] : wrong[0];
        System.out.println("You entered: " + result);

        //task 3

        Random random = new Random();

        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);

        System.out.println("Random numbers: " + a + "," + b + "," + c + "," + d + ";");
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("The maximum is: " + max);

        int n1 = random.nextInt(101);
        int n2 = random.nextInt(101);
        int n3 = random.nextInt(101);
        int n4 = random.nextInt(101);
        int n12 = n1 < n2? n2 : n1;
        int n34 = n3 < n4? n4 : n3;
        int max1 = n12 < n34? n34 : n12;
        System.out.println(n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", max: " + max1);

        //task 4

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter four digit number: ");
        String four = scanner1.nextLine();
        if (four.length() !=4) {
            System.out.println("Error: try again with fort digit number.");
            System.exit(1);
        }
            int char1 = four.charAt(0) - '0';
            int char2 = four.charAt(1) - '0';
            int char3 = four.charAt(2) - '0';
            int char4 = four.charAt(3) - '0';
            boolean lucky = (char1 + char2) == (char3 + char4);
            if (lucky) {
                System.out.println("It's your day and the lucky number.");
            } else {
                System.out.println("Sorry, it's not lucky try again");
            }
    }
}
