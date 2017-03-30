package ua.nure.tsomkalov.Task1;

import java.util.SortedSet;

public class Part10 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        print(triangle(m));
    }

    private static int[][] triangle(int m) {
        int[][] triangle = new int[m][];

        for (int i = 0; i < m; i++) {
            triangle[i] = new int[i + 1];
            int num = 1;
            triangle[i][0] = num;

            for (int j = 1; j <= i; j++) {
                num *= (i - j + 1);
                num /= j;
                triangle[i][j] = num;
            }
        }
        return triangle;
    }

    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
