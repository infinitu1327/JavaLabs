package ua.nure.tsomkalov.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {

    private static final String FILE_NAME = "part1.txt";

    private static final String ENCODING = "Cp1251";

    private static final String REG_EXP = "\\S{3,}";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(toAnotherCase());
    }

    static String load(String fileName, String encoding) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName), encoding);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine())
            sb.append(scanner.nextLine()).append("\n");
        scanner.close();
        return sb.toString().trim();
    }

    private static String toAnotherCase() throws FileNotFoundException {
        StringBuffer stringBuffer = new StringBuffer();

        String text = load(FILE_NAME, ENCODING);

        Pattern pattern = Pattern.compile(REG_EXP);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String group = matcher.group();
            matcher.appendReplacement(stringBuffer, toInvariantCase(group));
        }
        matcher.appendTail(stringBuffer);

        return stringBuffer.toString();
    }

    private static String toInvariantCase(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (Character.isUpperCase(letter)) {
                stringBuilder.append(Character.toLowerCase(letter));
            } else {
                stringBuilder.append(Character.toUpperCase(letter));
            }
        }

        return stringBuilder.toString();
    }
}