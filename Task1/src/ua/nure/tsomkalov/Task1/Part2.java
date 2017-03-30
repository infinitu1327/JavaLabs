package ua.nure.tsomkalov.Task1;

public class Part2 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        System.out.println(numsSum(m));
    }

    public static int numsSum(int m) {
        int res = 0;

        while (m > 0) {
            res += m % 10;
            m = m / 10;
        }

        return res;
    }
}
