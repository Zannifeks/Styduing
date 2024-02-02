package lesson9;

public class Lesson9    {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1};
        printArray(arr);

        int[] arr2 = {-4, -1, -7, -9, -5};
        printArray(arr2);

        int aa = 2;
        int bb = 2;
        int r1 = add (aa, bb);
        int r2 = add (-4,12,5,7);
        System.out.println(r1 + ", " + r2);
    }

    static int add (int a, int b) {
        int c = a + b;
        return c;
    }

    static int add(int... a) {
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }

    static void printArray (int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
