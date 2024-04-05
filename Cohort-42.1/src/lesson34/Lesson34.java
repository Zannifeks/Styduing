package lesson34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson34 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(5, 3, 6, 2, 4, 1));
        Collections.sort(ints);
        System.out.println(ints);

        List<Person> persons = new ArrayList<>(List.of(
                new Person("John", 35),
                new Person("Mark", 21),
                new Person("Luke", 40),
                new Person("Luke", 26)));
        Collections.sort(persons);
        System.out.println(persons);

        Comparator<Person> nameAgeComparator = (o1, o2) -> {
            int nameCompare = o1.getName().compareTo(o2.getName());
            if (nameCompare == 0) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return nameCompare;
        };
        //Comparator<Person> ageComparator = (o1, o2) -> (Integer.compare(o1.getAge(), o2.getAge()));
        //Comparator<Person> ageComparator = (o1, o2) -> (o1.getAge() < o2.getAge()) ? -1 : ((o1.getAge() == o2.getAge()) ? 0 : 1);


        Collections.sort(persons, (o1, o2) -> (Integer.compare(o1.getAge(), o2.getAge())));
        System.out.println(persons);
    }
}
