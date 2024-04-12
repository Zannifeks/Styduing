package lesson35.homework;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        String text = "To be or not to be that is the question " +
                "Whether it is nobler in the mind to suffer " +
                "The slings and arrows of outrageous fortune " +
                "Or to take arms against a sea of troubles " +
                "And by opposing end them To die to sleep " +
                "No more and by a sleep to say we end";
        String[] words = text.toLowerCase().split(" ");
        Set<String> singleWords = new TreeSet<>(List.of(words));
        // make counter for text.
        //int count = 0;


        //if (.lenght)
        System.out.println(Arrays.toString(words));
        System.out.println(singleWords);
    }
}
