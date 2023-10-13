package ProblemSet_5b;

public class Customer {
	private String name;
	private String surname;
	
	public Customer(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
	public String toString() {
		return name.substring(0, 1) + ". "+ surname;
	}
}
