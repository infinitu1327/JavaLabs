package ua.nure.tsomkalov.Task3;

import java.util.Iterator;

class Parser implements Iterable<String> {

	public Parser(String fileName, String encoding) {
		// ...
	}

	private class Itr implements Iterator<String> {

		public boolean hasNext() {
			return false;
		}

		public String next() {
			return null;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	public Iterator<String> iterator() {
		return new Itr();
	}

}