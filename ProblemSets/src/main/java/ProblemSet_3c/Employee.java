package ProblemSet_3c;
public class Employee {

	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position position;

	public Employee(int id, String forename,
			String surname,
			AnnualSalary salary,
			Position position) {
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.position = position;
		this.id = id;
	}
	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public double getSalary() {
		return salary.getSalary();
	}

	public String getPositionName() {
		return position.getRoleName();
	}

	public int getId() {
		return id;
	}

	public void displayEmployeeName() {
	 System.out.println(forename + " " + surname);
	}

	public boolean eligibleForBonus() {
		if (salary.getSalary() >= 40000) {
			return true;
		}
		return false;
	}

	public String toString() {
		String output = surname + ", " + forename 
				+ " (" + id + "): " + position.getRoleName();
		output = output +  " at £" 
		+ salary.getSalary() + " (£" + salary.calculateTax();
		if (eligibleForBonus() == true) {
		return (output + " tax) and is eligible for bonus.");
	}
		return (output + " tax) and is not eligible for bonus.");

	}
}
