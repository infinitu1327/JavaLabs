package ua.nure.tsomkalov.Task3;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 implements java.lang.Iterable<String> {

    private static final String FILE_NAME = "part4.txt";

    private static final String ENCODING = "Cp1251";

    private static final String REG_EXP = "[A-zА-яёіїє]+";

    static class WordsIterator implements Iterator<String> {
        private Matcher m;

        WordsIterator(String fileName) {
            try {
                String str = Part1.load(fileName, ENCODING);
                m = Pattern.compile(REG_EXP).matcher(str);
            } catch (Exception e) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public boolean hasNext() {
            return m.find();
        }

        @Override
        public String next() {
            return m.group();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<String> iterator() {
        return new WordsIterator(FILE_NAME);
    }

    public static void main(String[] args) throws FileNotFoundException {
        for (String word : new Part4()) {
            System.out.println(word);
        }
    }
}