package ProblemSet_3c;

public class AnnualSalary {

	double salary;
	double personalAllowance = 12570;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double Salary ) {
		this.salary = Salary;
	}

	public double calculateTax() {
		double tax = 0;
		double higher = 50270;
		double additional = 125140;
		if (salary > additional) {
			tax = (salary - additional)* 0.45;
			tax = tax + ((additional - higher) * 0.4);
			tax = tax + ((higher - personalAllowance) * 0.2);
			return tax;
		} else if (salary > higher) {
			tax = tax + ((salary - higher) * 0.4);
			tax = tax + ((higher - personalAllowance) * 0.2);
			return tax;
		} else if (salary > personalAllowance) {
			tax = tax + ((salary - personalAllowance) * 0.2);
			return tax;
		}
		return tax;
	}
}
