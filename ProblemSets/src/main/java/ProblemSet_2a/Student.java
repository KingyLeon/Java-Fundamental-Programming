package ProblemSet_2a;

public class Student {

	// Define Student attributes
	private  String forename = " ";
	private  String surname = " ";
	private  int age;

	public Student(String forename, String surname, int age) {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}

	public  int getAge() {
		return age;
	}

	public String getFullname() {
		String fullname = (forename + " " + surname);
		return fullname;
	}

	public  void setAge(int age) {
		this.age = age;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
