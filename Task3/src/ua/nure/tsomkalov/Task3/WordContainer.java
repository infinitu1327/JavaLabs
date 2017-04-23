package ua.nure.tsomkalov.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WordContainer {

    private ArrayList<Word> words;

    private class Word {

        public Word(String content) {
            this.content = content;
            frequency=1;
        }

        private String content;

        private int frequency;

        @Override
        public String toString() {
            return content+":"+frequency;
        }
    }

    public WordContainer() {
        words=new ArrayList<Word>();
    }

    public void add(String s) {
        for (Word word:words) {
            if (word.content.equals(s)){
                word.frequency++;
                return;
            }
        }
        words.add(new Word(s));
    }

    public void print() {
        words.sort(Comparator.comparingInt(w->w.frequency));

        for (Word word:words) {
            System.out.println(word);
        }
    }
}
