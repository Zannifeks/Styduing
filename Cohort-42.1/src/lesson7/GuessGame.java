package lesson7;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int num = random.nextInt(11);
            int attempt = 0;
            int answer = -1;
            while (answer != num && attempt < 3) {
                attempt++;
                System.out.println("Guess the number from 0 to 10: ");
                answer = scanner.nextInt();
                if (answer < num) {
                    System.out.println("YOur number less then my.");
                } else if (answer > num) {
                    System.out.println("Your number greater then my.");
                }
            }
            if (answer == num) {
                System.out.println("You won the game!");
                if (attempt > 1) {
                    System.out.println("You used " + attempt + " attempts");
                } else {
                    System.out.println("You used " + attempt + " attempt");
                }
            } else {
                System.out.println("You lose the game!");
            }
            System.out.println("Want to play again? (1 = YES) (0 = NO)");
        } while (scanner.nextInt() == 1);
    }
}