package homework;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String a = scanner.next();
        System.out.println("Enter your second name: ");
        String b = scanner.next();
        System.out.println("Enter your age: ");
        String c = scanner.next();
        System.out.println("Enter your gender: ");
        String d = scanner.next();
        System.out.println("Enter your city: ");
        String e = scanner.next();
        System.out.println("Enter your hight: ");
        String f = scanner.next();
        System.out.println("My name is " + a + " " + b + ", " + "I'm " + c + " "
                + "years old, " + "I'm " + d + ", " + "I'm from " + e + ", "
                + "My hight is " + f + ".");

    }
}
