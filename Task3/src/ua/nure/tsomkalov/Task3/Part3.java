package ua.nure.tsomkalov.Task3;

import java.io.*;
import java.util.Scanner;

public class Part3 {

	private static final String FILE_NAME = "part3.txt";

	private static final String ENCODING = "Cp1251";

	public static void main(String[] args)throws FileNotFoundException {
		switch (args[0]){
			case "string":
				System.out.println(GetStrings());
				break;
			case "int":
				System.out.println(GetInts());
				break;
			case "double":
				System.out.println(GetDoubles());
				break;
		}

	}

	private static Scanner GetScanner()throws FileNotFoundException{
		return new Scanner(new File(FILE_NAME), ENCODING);
	}

	private static String GetStrings()throws FileNotFoundException{
		Scanner s=GetScanner();
		StringBuilder sb=new StringBuilder();

		while(s.hasNextLine()){
			for(String word:s.nextLine().split(" ")){
				try {
					Integer num=Integer.parseInt(word);
					Double d=Double.parseDouble(word);

				}
				catch (Exception e){
					sb.append(word).append(" ");
				}
			}
		}

		return sb.toString();
	}

	private static String GetInts()throws FileNotFoundException{
		Scanner s=GetScanner();
		StringBuilder sb=new StringBuilder();

		while(s.hasNextLine()){
			for(String word:s.nextLine().split(" ")){
				try {
					Integer num=Integer.parseInt(word);
					sb.append(num).append(" ");
				}
				catch (Exception e){

				}
			}
		}

		return sb.toString();
	}

	private  static String GetDoubles()throws FileNotFoundException{
		Scanner s=GetScanner();
		StringBuilder sb=new StringBuilder();

		while(s.hasNextLine()){
			for(String word:s.nextLine().split(" ")){
				try {
					Double num=Double.parseDouble(word);
					sb.append(num).append(" ");
				}
				catch (Exception e){

				}
			}
		}

		return sb.toString();
	}

}