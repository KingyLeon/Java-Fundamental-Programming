package ProblemSet_2a;

public class Student {

	// Define Student attributes
	private  String forename = " ";
	private  String surname = " ";
	private  int age;
	
	public Student(String Forename, String Surname, int Age) {
		forename = Forename;
		surname = Surname;
		age = Age;
	}

	public  int getAge() {
		return age;
	}

	public String getFullname() {
		String Fullname = (forename + " " + surname);
		return Fullname;
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
