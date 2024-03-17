package lesson23;


import lesson22.TriangleRectangle;

public class Lesson23 {
    public static void main(String[] args) {
        Lesson23 lesson23 = new Lesson23();
        // toString()
        System.out.println(lesson23);
        System.out.println(lesson23.hashCode());
        // hashCode()
        System.out.println(Integer.toHexString(lesson23.hashCode()));
        //getClass
        System.out.println(lesson23.getClass().getSimpleName());
        // equals
        String s1 = "qwerty";
        String s2 = "qwerty";
        String s3 = "qwertz";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        TriangleRectangle tr1 = new TriangleRectangle(4, 6);
        TriangleRectangle tr2 = new TriangleRectangle(4, 6);
        System.out.println("Triangles: " + tr1.equals(tr2));

    }

    @Override
    public String toString() {
        return "Lesson23{}";
    }
}
