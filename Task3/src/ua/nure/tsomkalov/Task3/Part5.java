package ua.nure.tsomkalov.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part5 {

    private static final String FILE_NAME = "part5.txt";

    private static final String ENCODING = "Cp1251";

    public static void main(String[] args) throws FileNotFoundException{
        WordContainer wordContainer = new WordContainer();
        Scanner s = new Scanner(new File(FILE_NAME), ENCODING);
        while (s.hasNextLine()) {
            for (String word : s.nextLine().split(" ")) {
                wordContainer.add(word);
            }
        }
        wordContainer.print();
    }
}