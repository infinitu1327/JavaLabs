package ua.nure.tsomkalov.Task3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Demo {

	private static final InputStream STD_IN = System.in;

	private static final String ENCODING = "Cp1251";
	
	private static final String[] NO_ARGS = new String[] {};

	public static void main(String[] args) throws IOException {
		System.out.println("========== PART1");
		Part1.main(NO_ARGS);

		System.out.println("========== PART2");
		Part2.main(NO_ARGS);

		System.out.println("========== PART3");
		// set the mock input
		System.setIn(new ByteArrayInputStream("string\nint\ndouble".getBytes(ENCODING)));
		Part3.main(NO_ARGS);
		// restore the standard input
		System.setIn(STD_IN);

		System.out.println("========== PART4");
		Part4.main(NO_ARGS);

		System.out.println("========== PART5");
		Part5.main(NO_ARGS);
	}

}