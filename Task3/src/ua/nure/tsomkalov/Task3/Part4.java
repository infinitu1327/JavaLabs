package ua.nure.tsomkalov.Task3;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 implements java.lang.Iterable<String> {

    private static final String FILE_NAME = "part4.txt";

    private static final String ENCODING = "Cp1251";

    @Override
    public Iterator<String> iterator() {
        return new Parser(FILE_NAME,ENCODING).iterator();
    }

    public static void main(String[] args) throws FileNotFoundException {
        for (String word : new Part4()) {
            System.out.println(word);
        }
    }
}