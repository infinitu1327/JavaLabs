package ua.nure.tsomkalov.Task1;

public class Part3 {
    public static boolean isPrime(int m) {
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        System.out.println(isPrime(m));
    }
}
