package ua.nure.tsomkalov.Task1;

public class Part8 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        print(table(m, n));
    }

    private static void print(char[][] table) {
        for (char[] row : table) {
            for (char sym : row) {
                System.out.print(sym + " ");
            }

            System.out.println();
        }
    }

    private static char[][] table(int m, int n) {
        char[][] table = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    table[i][j] = 'Ч';
                } else {
                    table[i][j] = 'Б';
                }
            }
        }
        return table;
    }
}
