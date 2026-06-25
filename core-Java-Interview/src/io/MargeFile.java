package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MargeFile {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("marge.txt");

		BufferedReader br = new BufferedReader(new FileReader("marge1.txt"));

		String s1 = br.readLine();

		while (s1 != null) {
			fw.write(s1 + "\n");
			s1 = br.readLine();
		}

		br.close();

		br = new BufferedReader(new FileReader("marge2.txt"));

		String s2 = br.readLine();

		while (s2 != null) {
			fw.write(s2 + "\n");
			s2 = br.readLine();
		}
		
		br.close();

		br = new BufferedReader(new FileReader("marge3.txt"));

		String s3 = br.readLine();

		while (s3 != null) {
			fw.write(s3 + "\n");

			s3 = br.readLine();

			br.close();

		}

		br.close();
		fw.close();

		System.out.println("Merge completed");
	}
}
