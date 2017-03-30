package ua.nure.tsomkalov.Task1;

public class Part4 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        System.out.println(sum(m));
    }

    private static int sum(int m){
        int res = m;

        for (int i = m; i > 1; i--) {
            res = (i - 1) * (1 - res);
        }

        return res;
    }
}
