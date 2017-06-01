package ua.nure.tsomkalov.Task3;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser implements Iterable<String> {

	private static final String REG_EXP = "[A-zА-яёіїє]+";

	private Matcher matcher;

	Parser(String fileName, String encoding) {
		try {
			String text = Part1.load(fileName, encoding);
			matcher = Pattern.compile(REG_EXP).matcher(text);
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}

	private class Itr implements Iterator<String> {

		public boolean hasNext() {
			return matcher.find();
		}

		public String next() {
			return matcher.group();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	public Iterator<String> iterator() {
		return new Itr();
	}
}