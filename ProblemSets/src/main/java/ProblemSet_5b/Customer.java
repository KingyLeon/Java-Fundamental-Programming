package ProblemSet_5b;

public class Customer {
	private String name;
	private String surname;

	public Customer(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public char getName() {
		char initial = name.substring(0, 1).charAt(0);
	return initial;
	}

	public String getSurname() {
		return surname;
	}
	
	public String toString() {
		return getName() + ". "+ surname;
	}
}
