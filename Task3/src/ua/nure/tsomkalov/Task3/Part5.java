package ua.nure.tsomkalov.Task3;

public class Part5 {

	private static final String FILE_NAME = "part5.txt";

	private static final String ENCODING = "Cp1251";

	public static void main(String[] args) {
		WordContainer wordContainer = new WordContainer();
		Parser parser = new Parser(FILE_NAME, ENCODING);		
		for (String str : parser) {
			wordContainer.add(str);
		}
		wordContainer.print();
	}

}