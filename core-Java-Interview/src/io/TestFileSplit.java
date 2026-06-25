package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFileSplit {

	public static void main(String[] args) throws Exception {
		
		File file = new File("SplitFile.txt");
		
		BufferedReader fileToCount = new BufferedReader(new FileReader(file));
		
		int count = 0;
		String s = fileToCount.readLine();
		
		while(s != null) {
			count++;
			s = fileToCount.readLine();
			
		}
		System.out.println("Total Line : "+ count);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = br.readLine();
		for(int i=1; i <= 2; i++) {
			
			
			System.out.println("createFile" + i + " " + line);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("Split" + i + ".txt"));
			
			bw.write(line);
			bw.close();
		}
		
		br.close();
		fileToCount.close();
	}
}
