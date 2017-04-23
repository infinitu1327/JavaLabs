package ua.nure.tsomkalov.Task3;


import sun.misc.Regexp;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.DoubleBuffer;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 implements java.lang.Iterable {

    private static final String FILE_NAME = "part4.txt";

    private static final String ENCODING = "Cp1251";

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    private static String load() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(FILE_NAME), ENCODING);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine())
            sb.append(scanner.nextLine()).append("\n");
        scanner.close();
        return sb.toString().trim();
    }


    public static void main(String[] args) throws FileNotFoundException {
        String str = load();

        Matcher m = Pattern.compile("").matcher(str);


        while (m.find()) {
            System.out.print(m.group());
        }
    }

}