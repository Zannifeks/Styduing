package homework;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to search: ");
        int a = sc.nextInt();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Search index is: " + Search(arr, a));
    }

    static int Search(int[] arr, int x) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                idx = i;
            }
        }
        return idx;
    }
}
