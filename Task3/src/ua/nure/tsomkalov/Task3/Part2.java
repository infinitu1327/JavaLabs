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

        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(text);
        while (scanner.hasNextLine()) {
            for (String word : scanner.nextLine().split(" ")) {
                if (!hasDuplication(word)) {
                    stringBuilder.append(word);
                }
                stringBuilder.append(" ");
            }
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }

    private static boolean hasDuplication(String word) {
        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (word.indexOf(letter) != word.lastIndexOf(letter)) return true;
        }

        return false;
    }
}