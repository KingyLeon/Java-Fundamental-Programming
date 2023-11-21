package ProblemSet_9a;

public class Service {
	private String code;
	private String name;
	private VATRate rate;

	// Parameterised Constructor for defining
	public Service(String code, String name, VATRate rate) {
		// Conditional statement to check NullPointerException and throw it if present
		if (code == null || name == null) {
			throw new NullPointerException();
		}
		// Conditional statement check for IllegalArgumentException and throws it
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

	// Method for returning the value of name
	public String getName() {
		return name;
	}

	// Method for returning the value of rate
	public VATRate getRate() {
		return rate;
	}

}
