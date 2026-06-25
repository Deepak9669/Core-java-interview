package io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteLineByLine {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("keyboard.txt");

		PrintWriter out = new PrintWriter(file);

		out.println("Hello Bhai");

		out.println("Good morning");
		
//		System.out.println(out);

		file.close();
		out.close();

	}
}
