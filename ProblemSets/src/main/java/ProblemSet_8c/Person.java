package ProblemSet_8c;

public class Person {
	private String forename;
	private String surname;
	private int age;

	public Person(String forename, String surname, int age) {
		setForename(forename);
		setSurname(surname);
		setAge(age);
		
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return (forename + " " + surname + " (" + age + ")");
	}
}
