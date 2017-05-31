package ua.nure.tsomkalov.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class WordContainer {

    private List<Word> words;

    private class Word {

        Word(String content) {
            this.content = content;
            frequency = 1;
        }

        private String content;

        private int frequency;

        @Override
        public String toString() {
            return content + ":" + frequency;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }

            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            return ((Word) obj).content.equals(this.content);
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + content.hashCode();
            result = 31 * result + frequency;
            return result;
        }
    }

    WordContainer() {
        words = new ArrayList<Word>();
    }

    void add(String s) {
        for (int i = 0; i < words.size(); i++) {
            Word w = words.get(i);
            if (w.content.equals(s)) {
                w.frequency++;
                for (int j = i; j >= 0; j--) {
                    Word w2 = words.get(j);
                    if (w2.frequency < w.frequency) {
                        Word temp = w;
                        words.set(i, w2);
                        words.set(j, temp);
                    }
                }
                return;
            }
        }
        words.add(new Word(s));
    }

    void print() {
        for (Word word : words) {
            System.out.println(word);
        }
    }
}
