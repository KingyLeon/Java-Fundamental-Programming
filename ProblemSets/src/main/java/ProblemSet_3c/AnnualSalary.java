package ProblemSet_3c;

public class AnnualSalary {

	double salary;
	double PERSONAL_ALLOWANCE = 121570;
	
	
	public double getSalary() {
		return salary;
	}
		
	public void setSalary(double Salary ) {
		this.salary = Salary;
	}
	
	public double calculateTax() {
		double Tax = 0;
		double basic = 12570;
		double higher = 50270;
		double additional = 125140;
		if (salary > additional) {
			Tax = (salary - additional)*0.45;
			Tax = Tax + ((additional - higher) *0.4);
			Tax = Tax + ((higher - basic) *0.2);
			return Tax;
		}
		else if (salary > higher) {
			Tax = Tax + ((salary - higher) *0.4);
			Tax = Tax + ((higher - basic) *0.2);
			return Tax;
		}
		else if (salary > basic) {
			Tax = Tax + ((salary - basic) *0.2);
			return Tax;
		}
		return Tax;
	}
}
