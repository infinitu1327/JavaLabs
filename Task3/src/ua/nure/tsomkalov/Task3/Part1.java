package ua.nure.tsomkalov.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part1 {

    private static final String FILE_NAME = "part1.txt";

    private static final String ENCODING = "Cp1251";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.print(ToAnotherCase());
    }

    private static String ToAnotherCase() throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(new File(FILE_NAME), ENCODING);
        while (s.hasNextLine()) {
            for (String word : s.nextLine().split(" ")) {
                if (word.length() > 3) {
                    for (String ch : word.split("")) {
                        if (IsUpper(ch)) {
                            sb.append(ch.toLowerCase());
                        } else {
                            sb.append(ch.toUpperCase());
                        }
                    }
                    sb.append(" ");
                } else {
                    sb.append(word).append(" ");
                }
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    private static boolean IsUpper(String ch) {
        return ch.toUpperCase().equals(ch);
    }
}