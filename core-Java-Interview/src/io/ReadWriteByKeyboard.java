package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

import javax.sound.sampled.Line;

public class ReadWriteByKeyboard {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		FileWriter fw = new FileWriter("sandeep.txt");

		System.out.println("Enter Here.......");

		String str = reader.readLine();

		while (!str.equals("stop")) {

			fw.write(str);

			System.out.println(str);

			str = reader.readLine();
		}

		reader.close();
		fw.close();
	}
}
