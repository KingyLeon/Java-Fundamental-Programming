package ProblemSet_8b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counting {
	public Counting() {

	}

	public String readTextFile(String file) {
		File myFile = new File(file);
		try {
			Scanner read = new Scanner(myFile);
			StringBuffer output = new StringBuffer();
			int counter = 1;
			while (read.hasNextLine()) {
				output.append(displayLine(read.nextLine(), counter));
				counter++;
			}
			read.close();
			return output.toString();
		} catch (FileNotFoundException e) {
			return file;
		}
	}

	private String displayLine(String line, int counter) {
		return (line + " : " + counter + "\n");
	}
}
