package ua.nure.tsomkalov.Task3;

import java.io.*;
import java.util.Scanner;

public class Part3 {

    private static final String FILE_NAME = "part3.txt";

    private static final String ENCODING = "Cp1251";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner s = new Scanner(System.in);
        String line;
        while (s.hasNextLine() && !"stop".equals(line = s.nextLine())) {
            System.out.println(GetData(line));
        }
    }

    private static String GetData(String type) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME), ENCODING);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()) {
            for (String word : scanner.nextLine().split(" ")) {
                String item = null;
                switch (type) {
                    case "string":
                        item = GetStrings(word);
                        break;
                    case "int":
                        item = GetInts(word);
                        break;
                    case "double":
                        item = GetDoubles(word);
                        break;
                }

                if (item != null) {
                    stringBuilder.append(item).append(" ");
                }
            }
        }

        return stringBuilder.toString();
    }

    private static String GetStrings(String word) {
        if (GetDoubles(word) == null && GetInts(word) == null) {
            return word;
        }

        return null;
    }

    private static String GetInts(String word) {
        try {
            Integer num = Integer.parseInt(word);
            return word;
        } catch (Exception ignored) {
        }

        return null;
    }

    private static String GetDoubles(String word) {
        try {
            if (GetInts(word) == null) {
                Double num = Double.parseDouble(word);
                return word;
            }
        } catch (Exception ignored) {
        }

        return null;
    }
}