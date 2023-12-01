package ProblemSet_9c;

public class Charge {
	private Service service;
	private double charge;

	/*
	 * Parameterised Constructor for 
	 * creating object and giving 
	 * values to variables
	 */
	public Charge(Service service, double charge) {
		this.service = service;
		if (charge > 0) {
			this.charge = charge;
		} else {
			throw new IllegalArgumentException();
		}
	}

	// Method for calculating VAT
	public double calculateVAT() {
		double output = 0;
		// Conditional statement for checking LOW, STANDard
		if (service.getRate() == VATRate.LOW) {
			output = 5;
		}
		if (service.getRate() == VATRate.STANDARD) {
			output = 20;
		}
		if (service.getRate() == VATRate.ZERO) {
			output = 0;
		}
		return output;
	}

	// Method for returning value of service
	public Service getService() {
		return service;
	}

	// Method for returning value of charge
	public double getCharge() {
		return charge;
	}

}
