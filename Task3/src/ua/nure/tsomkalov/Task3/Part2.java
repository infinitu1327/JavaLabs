package ua.nure.tsomkalov.Task3;

import java.io.*;
import java.util.Scanner;

public class Part2 {

    private static final String FILE_NAME = "part2.txt";

    private static final String ENCODING = "Cp1251";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(RemoveDuplicated());
    }

    private static String RemoveDuplicated() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(new File(FILE_NAME), ENCODING);
        while (s.hasNextLine()) {
            for (String word : s.nextLine().split(" ")) {
                if (!IsDuplicated(word)) {
                    sb.append(word).append(" ");
                }
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    private static boolean IsDuplicated(String word) {
        String[] chars = word.split("");
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length - 1; j > i; j--) {
                if (chars[i].equals(chars[j])) return true;
            }
        }
        return false;
    }
}