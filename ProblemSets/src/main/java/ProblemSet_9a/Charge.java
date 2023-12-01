package ProblemSet_9a;

public class Charge {
	private Service service;
	private double charge;

	// Create object and giving values to variables
	public Charge(Service service, double charge) {
		this.service = service;
		if (charge > 0) {
			this.charge = charge;
		} else {
			throw new IllegalArgumentException();
		}
	}

	// Method for calculating VAT, 0% for LOW, 5% for LOW, 20% for STANDRD
	public double calculateVAT() {
		double output = 0;
		// Conditional statement for checking LOW, STANDARD and ZERO
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
