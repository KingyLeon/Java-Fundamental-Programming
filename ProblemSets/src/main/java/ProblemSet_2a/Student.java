package ProblemSet_2a;

public class Student {

	// Define Student attributes
	static String forename = " ";
	static String surname = " ";
	static int age;
	
	public Student(String Forename, String Surname, int Age) {
		forename = Forename;
		surname = Surname;
		age = Age;
	}
	
	public static int getAge() {
		return age;
	}
	
	public String getFullname() {
		String Fullname = (forename + " " + surname);
		return Fullname;
	}
	
	public static void setAge(int Age) {
		age = Age;
	}
	
	public static void setForename(String Forename) {
		forename = Forename;
	}
	
	public static void setSurname(String Surname) {
		surname = Surname;
	}
	
}
