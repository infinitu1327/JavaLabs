package ua.nure.tsomkalov.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class Part5 implements Iterable<String>{

    private static final String FILE_NAME = "part5.txt";

    private static final String ENCODING = "Cp1251";

    public Iterator<String> iterator(){
        return new Parser(FILE_NAME,ENCODING).iterator();
    }

    public static void main(String[] args){
        WordContainer wordContainer = new WordContainer();

        for (String word:new Part5()) {
            wordContainer.add(word);
        }

        wordContainer.print();
    }
}