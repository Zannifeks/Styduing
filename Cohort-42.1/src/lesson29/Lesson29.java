package lesson29;

public class Lesson29 {
    public static void main(String[] args) {
        RubberList rubberList = new RubberList();
        System.out.println(rubberList);
        rubberList.add(20);
        rubberList.add(3);
        rubberList.add(2024);
        rubberList.add(-8);
        System.out.println(rubberList);
        //get
        System.out.println(rubberList.get(2));
        //remove
        rubberList.remove(0);
        System.out.println(rubberList);
        rubberList.remove(2);
        System.out.println(rubberList);
    }
}
