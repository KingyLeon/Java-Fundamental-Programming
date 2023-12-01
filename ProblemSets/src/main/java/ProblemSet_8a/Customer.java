package ProblemSet_8a;

public class Customer {
	private String name;
	private String surname;

	// Parameterised Constructor
	public Customer(String name, String surname) {
		/*
		 * Checks if name + surname in valid format. Returns IllegalArgument Exception
		 * with a message
		 */
		if (validateInfo(name) != true ||
			validateInfo(surname) != true) {
			throw new IllegalArgumentException(
			"Name is not in the correct format");
		}
		setName(name);
		setSurname(surname);
	}

// Method for checking a string is in the regularExpression format
	public boolean validateInfo(String info) {
		String regularExpression = "[A-Z][a-z]*";
		return info.matches(regularExpression);
	}

	// Method for returning the first letter of name
	public char getName() {
		return name.charAt(0);
	}

	// Method for returning the surname
	public String getSurname() {
		return surname;
	}

	// Method for setting the surname
	public void setSurname(String surname) {
		this.surname = surname;
	}

	// Method for setting the name
	public void setName(String name) {
		this.name = name;
	}

	// Returns a formatted string
	@Override
	public String toString() {
		return (getName() + ". " + surname);
	}
}
