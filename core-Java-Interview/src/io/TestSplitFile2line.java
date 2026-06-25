package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestSplitFile2line {
	public static void main(String[] args) throws Exception {

		File file = new File("SplitFile.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		int fileNo = 1;

		String line = br.readLine();

		while (line != null) {

			BufferedWriter bw = new BufferedWriter(new FileWriter("Split" + fileNo + ".txt"));

			// 2 lines per file
			for (int i = 1; i <= 2 ; i++) {

				if (line == null) {

					break;
			}

				bw.write(line);
				bw.newLine();

				line = br.readLine();
			}

			bw.close();

			System.out.println("createFile" + fileNo);

			fileNo++;
		}

		br.close();
	}

}
