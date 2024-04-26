package lesson42.homework;

import java.util.*;

public class Homework {
    public static void main(String[] args) {

        //task 1
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer even : numbers) {
            if (even % 2 == 0) {
                evenNumbers.add(even);
            }
        }

        System.out.println(numbers);
        System.out.println(evenNumbers);

        //task 2
        List<Word> words = new ArrayList<>(List.of(
                new Word("hEllO"),
                new Word("JaVa"),
                new Word("LAMBDA")
        ));

        System.out.println(words);

        //task3



    }
}
