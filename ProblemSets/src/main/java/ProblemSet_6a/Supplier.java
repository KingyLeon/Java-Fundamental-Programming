package ProblemSet_6a;

public class Supplier {
	private String name;
	private String phone;
	
	public Supplier(String name, String phone) {
		this.name = name;
		String phoneFormat = "01483[-][0-9]{6}";
		String phoneFormat2 = "01483[0-9]{6}";
		if (phone.matches(phoneFormat) || phone.matches(phoneFormat2)) {
		this.phone = phone;
		}
		else {
			throw new IllegalArgumentException();
			}
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
		}
		 
	public String toString() {
		return (name);
	}
}
