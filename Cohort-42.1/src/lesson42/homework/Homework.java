package lesson42.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {

        //task 1
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());


//        List<Integer> evenNumbers = new ArrayList<>();
//        for (Integer even : numbers) {
//            if (even % 2 == 0) {
//                evenNumbers.add(even);
//            }
//        }

        System.out.println(numbers);
        System.out.println(evenNumbers);

        //task 2
        List<Word> words = new ArrayList<>(List.of(
                new Word("hEllO"),
                new Word("JaVa"),
                new Word("LAMBDA")
        ));

        System.out.println(words);

        List<String> strList = List.of("hEllO", "JaVa", "LAMBDA");

        List<String> updWords = strList.stream()
                .map(word ->word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.toList());

        System.out.println("Unconverted list: " + strList);
        System.out.println("Converted list: " + updWords);
        
        //task3



    }
}
