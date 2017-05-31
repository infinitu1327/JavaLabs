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
        String text = Part1.load(FILE_NAME, ENCODING);

        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(new File(FILE_NAME), ENCODING);
        while (s.hasNextLine()) {
            for (String word : s.nextLine().split(" ")) {
                if (!hasDuplication(word)) {
                    sb.append(word).append(" ");
                }
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    private static boolean hasDuplication(String word) {
        char[] letters = word.toCharArray();

        for (char ch : letters) {
            if (word.indexOf(ch) != word.lastIndexOf(ch)) return true;
        }

        return false;
    }
}