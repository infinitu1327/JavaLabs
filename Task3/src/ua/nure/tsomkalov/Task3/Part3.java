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
        Scanner s = new Scanner(new File(FILE_NAME), ENCODING);
        StringBuilder sb = new StringBuilder();

        while (s.hasNextLine()) {
            for (String word : s.nextLine().split(" ")) {
                String item;
                switch (type) {
                    case "string":
                        item = GetStrings(word);
                        if (item != null) {
                            sb.append(item).append(" ");
                        }
                        break;
                    case "int":
                        item = GetInts(word);
                        if (item != null) {
                            sb.append(item).append(" ");
                        }
                        break;
                    case "double":
                        item = GetDoubles(word);
                        if (item != null) {
                            sb.append(item).append(" ");
                        }
                        break;
                }
            }
        }

        return sb.toString();

    }

    private static String GetStrings(String word) {
        if (GetDoubles(word) != null || GetInts(word) != null) {
            return null;
        } else {
            return word;
        }
    }

    private static String GetInts(String word) {
        try {
            Integer num = Integer.parseInt(word);
            return word;
        } catch (Exception e) {
            return null;
        }
    }

    private static String GetDoubles(String word) {
        try {
            if (GetInts(word) == null) {
                Double num = Double.parseDouble(word);
                return word;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
}