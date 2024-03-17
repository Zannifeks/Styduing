package lesson27;

/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson# 27
 *
 * @version 15.03.2024
 */
public class Lesson27 {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(5), new Rectangle(3,4), new Triangle(4,5,3)};
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName());
            System.out.println(figure.calcArea());
            System.out.println(figure.calcPerimeter());
        }

    }
}
