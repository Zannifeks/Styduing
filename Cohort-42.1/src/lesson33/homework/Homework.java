package lesson33.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        List<Integer> listThree = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 0));

//        System.out.println(getIntersectionOfLists(listOne, listTwo));
//        System.out.println(getIntersectionOfLists(listOne, listThree));
//        System.out.println(listOne.retainAll(listTwo));
//        System.out.println(listOne.retainAll(listThree));
    }

//    static <t> List<T> intersection(List<T> list1, List<T> list2) {
//        List<T> result = new ArrayList<>(list1)
//    }

    static <T> List<T> getIntersectionOfLists(List<T> listOne, List<T> listTwo) {
        List<T> result = new ArrayList<>();
        for (T item : listOne) {
            if (listTwo.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
