package ua.nure.tsomkalov.Task1;

import java.util.ArrayList;

public class Part5 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        System.out.println(luckyCount(m));
    }

    private static int luckyCount(int length) {
        int count = 0;

        for (double i = Math.pow(10, length - 1); i < Math.pow(10, length); i++) {
            int x = (int) Math.pow(10, length / 2);

            if (Part2.numsSum((int) (i / x)) == Part2.numsSum((int) i % x)) {
                count++;
            }
        }

        return count;
    }
}
