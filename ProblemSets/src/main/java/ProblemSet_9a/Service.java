package ProblemSet_9a;

public class Service {
	private String code;
	private String name;
	private VATRate rate;

	// Parameterised Constructor for defining
	public Service(String code, String name, VATRate rate) {
		// Conditional statement to check for NullPointerException
		if (code == null || name == null) {
			throw new NullPointerException();
		}
		// Conditional statement to check for IllegalArgumentException for Code
		if (code.matches("[A-Z]{4}[0-9]{5}")) {
			this.code = code;
			this.name = name;
			this.rate = rate;
		} else {
			throw new IllegalArgumentException();
		}
	}

	// Method for returning the value of code
	public String getCode() {
		return code;
	}

	// Method for returning the value of code

	public String getName() {
		return name;
	}

	// Method for returning the value of code
	public VATRate getRate() {
		return rate;
	}

}
