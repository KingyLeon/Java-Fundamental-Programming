package ProblemSet_8b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counting {
	public Counting() {

	}

	public String readTextFile(String file) {
		// Create new File type
		File myFile = new File(file);
		try {
			Scanner read = new Scanner(myFile);
			StringBuffer output = new StringBuffer();
			// Variable for tracking number of lines in file
			int counter = 1;
			// Loop that builds a string while file has a next line
			while (read.hasNextLine()) {
				output.append(displayLine(read.nextLine(), counter));
				// counter iterates
				counter++;
			}
			// Scanner is closed when file has no more lines
			read.close();
			return output.toString();
			// If file is not found, string is returned
		} catch (FileNotFoundException e) {
			return "File not found";
		}
	}

	// Method returns line from the file with the number of the line
	private String displayLine(String line, int counter) {
		return (line + " : " + counter + "\n");
	}
}
