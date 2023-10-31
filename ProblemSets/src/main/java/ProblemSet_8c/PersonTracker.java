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
		String fileExpression = "[A-Z]*[a-z]*.txt";
		if (file.matches(fileExpression)) {
			File myFile = new File(file);
			try {
				Scanner read = new Scanner(myFile);
				StringBuffer output = new StringBuffer();
				while (read.hasNextLine()) {
					String line = read.nextLine();
					breakLine(line.toString());
				}
				read.close();
				return output.toString();

			} catch (FileNotFoundException e) {
				return file;
			}
		}
		return "";
	}

	public void addPerson(String n, String s, int a) {
		Person newPerson = new Person(n, s, a);
		if (peopleList.contains(newPerson)) {
		}
		peopleList.add(newPerson);
	}

	public String displayList() {
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < peopleList.size(); i++) {
			output.append(peopleList.get(i) + "\n");
		}
		return output.toString();
	}

	private void breakLine(String line) {
		String[] Comp = line.split(" ");
		String f = Comp[0];
		String s = Comp[1];
		int a = Integer.valueOf(Comp[2]);
		addPerson(f, s, a);
	}

	public String getPeopleList() {
		StringBuffer output = new StringBuffer();
		return peopleList.toString();
	}
}
