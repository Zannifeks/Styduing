package lesson28;

public class OuterAndInnerStaticClass {

    private String field = "field2";

    private void printText() {
        System.out.println("private method print Text.");
    }

    public void useInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getField());
        innerClass.innerPrintText();
    }
    static class InnerClass {
        String getField() {
            return "static class field";
        }
        void innerPrintText() {
            System.out.println("Pepega");
        }
    }
}
