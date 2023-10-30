package ProblemSet_8a;

public class Customer {
	private String name;
	private String surname;

	public Customer(String name, String surname) {
		if (validateInfo(name) != true || validateInfo(surname) != true ) {
			throw new IllegalArgumentException();
		}
		setName(name);
		setSurname(surname);
	}

	public boolean validateInfo(String info) {
		String regularExpression = "[A-Z][a-z]*";
		return info.matches(regularExpression);
	}

	public char getName() {
		return name.charAt(0);
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return (getName() + ". " + surname) ;
	}
}
