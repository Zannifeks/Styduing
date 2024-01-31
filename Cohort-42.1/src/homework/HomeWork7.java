package homework;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #7
 * @author Shilinski Rodion
 * @version 31.01,2024
 */

public class HomeWork7 {
    public static void main(String[] args) {

        // define using classes
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // define using variables
        int damageRadius = 10;
        double g = 9.81;
        int angle;
        int speed;
        double difference;
        // generate distance to target

        double distance = random.nextInt(1000) + 100;
        do {
            // enter speed and angle
            System.out.println("Enter start speed (m/s): ");
            speed = scanner.nextInt();
            System.out.println("Enter angle in degrees [0..89] : ");
            angle = scanner.nextInt();
            // calculating
            double realDistance = speed * speed * Math.sin(Math.toRadians(angle * 2)) / g;
            difference = distance - realDistance;
            // analise
            if (Math.abs(difference) < damageRadius) {
                System.out.println("You hit the target" + realDistance);
            } else {
                if (difference < 0) {
                    System.out.println("Overflight " + realDistance + " " + distance);
                } else {
                    System.out.println("Underflight " + realDistance + " " + distance);
                }
            }
        } while (Math.abs(distance) > damageRadius);
    }
}