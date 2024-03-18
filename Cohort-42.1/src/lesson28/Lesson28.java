package lesson28;

/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson# 28
 *
 * @version 15.03.2024
 */
public class Lesson28 {
    public static void main(String[] args) {
        OuterAndInnerClass outerAndInnerClass = new OuterAndInnerClass();
        outerAndInnerClass.useInnerClass();

        OuterAndInnerStaticClass outerAndInnerStaticClass = new OuterAndInnerStaticClass();
        outerAndInnerStaticClass.useInnerClass();

        OuterAndInnerStaticClass.InnerClass innerClass = new OuterAndInnerStaticClass.InnerClass();
    }
}
