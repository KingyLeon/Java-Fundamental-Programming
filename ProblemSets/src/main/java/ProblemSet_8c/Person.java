package ProblemSet_8c;

public class Person {
	private String forename;
	private String surname;
	private int age;

	// Constructor for initialising a person with the variables
	public Person(String forename, String surname, int age) {
		setForename(forename);
		setSurname(surname);
		setAge(age);
		
	}
	// Value for getting value of forename
	public String getForename() {
		return forename;
	}
	// Method for setting value of forename
	public void setForename(String forename) {
		this.forename = forename;
	}
	// Method for getting value of surname
	public String getSurname() {
		return surname;
	}
	// Method for setting value of surname
	public void setSurname(String surname) {
		this.surname = surname;
	}
	// Method for getting value of age
	public int getAge() {
		return age;
	}
	// Method for setting value of age
	public void setAge(int age) {
		this.age = age;
	}

	// Method for returning formatted string using all variables
	public String toString() {
		return (forename + " " + surname + " (" + age + ")");
	}
}
