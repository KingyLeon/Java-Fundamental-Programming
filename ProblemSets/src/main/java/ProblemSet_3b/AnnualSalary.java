package ProblemSet_3b;

public class AnnualSalary {

	private double salary;
	private final double PERSONAL_ALLOWANCE = 121570;
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double Salary ) {
		this.salary = Salary;
	}
	
	public double calculateTax() {
		double Tax = 0;
		double higher = 50270;
		double additional = 125140;
		if (salary > additional) {
			Tax = (salary - additional)*0.45;
			Tax = Tax + ((additional - higher) *0.4);
			Tax = Tax + ((higher - PERSONAL_ALLOWANCE) *0.2);
			return Tax;
		}
		else if (salary > higher) {
			Tax = Tax + ((salary - higher) *0.4);
			Tax = Tax + ((higher - PERSONAL_ALLOWANCE) *0.2);
			return Tax;
		}
		else if (salary > PERSONAL_ALLOWANCE) {
			Tax = Tax + ((salary - PERSONAL_ALLOWANCE) *0.2);
			return Tax;
		}
		return Tax;
	}
}
