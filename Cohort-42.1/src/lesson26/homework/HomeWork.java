package lesson26.homework;

public class HomeWork {
    public static void main(String[] args) {
        double sumArea = 0;
        double sumPerimeter = 0;
        Figure[] figures = {new Circle(5), new Triangle(5,5,5), new Rectangle(4, 5)};
        for (Figure figure : figures) {
            sumArea += figure.calcArea();
            sumPerimeter += figure.calcPerimeter();
        }
        System.out.println("allArea: " + sumArea + ", allPerimeter: " + sumPerimeter);
    }
}
