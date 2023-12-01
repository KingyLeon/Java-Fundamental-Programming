package ProblemSet_8c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonTracker {
	private List<Person> peopleList;

	public PersonTracker() {
		peopleList = new ArrayList<>();
	}

	public String readTextFile(String file) {
		// Set format the file should be in
		String fileExpression = "[A-Z]*[a-z]*.txt";
		// if file matches, create a new file type
		if (file.matches(fileExpression)) {
			File myFile = new File(file);
			/*
			 * Reads a file and builds a string of each lines contents
			 */
			try {
				Scanner read = new Scanner(myFile);
				StringBuffer output = new StringBuffer();
				while (read.hasNextLine()) {
					String line = read.nextLine();
					breakLine(line.toString());
					output.append(line + "/n");
				}
				read.close();
				return output.toString();
			} catch (FileNotFoundException e) {
				// If file is not found, String is returned
				return "File not found";
			}
		}
		return "";
	}

	public void addPerson(String n, String s, int a) {
		Person newPerson = new Person(n, s, a);
		if (peopleList.contains(newPerson)) {
			System.out.println("Person already in list");
		} else {
			peopleList.add(newPerson);
		}
	}

	public String displayList() {
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < peopleList.size(); i++) {
			output.append(peopleList.get(i) + "\n");
		}
		return output.toString();
	}

	// Passes a name, and splits based upon the spaces present
	private void breakLine(String line) {
		String[] comp = line.split(" ");
		String f = comp[0];
		String s = comp[1];
		int a = Integer.valueOf(comp[2]);
		addPerson(f, s, a);
	}

	// Method for returning the people stored in peopleList
	public String getPeopleList() {
		return peopleList.toString();
	}
}
