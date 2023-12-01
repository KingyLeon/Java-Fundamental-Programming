package ProblemSet_9b;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest {
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private List<Charge> charges;

	/*
	 * parameterised constructor for initialising the "Guest" object and their
	 * charges, no validation
	 */
	public Guest(String forename, String surname, String address, String telephone) {
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		charges = new ArrayList<Charge>();
	}

	@Override
	// Method for adding a new item to the arrayList "charges"
	public void addCharge(Service s, double c) {
		Charge newCharge = new Charge(s, c);
		charges.add(newCharge);
	}

	@Override
	// Method for calculating non taxed total charge
	public double calculateTotalChargeWithoutVAT() {
		double totalCharge = 0;
		/*
		 * Iterate through charges and returning sum of all charges
		 */
		for (int i = 0; i < charges.size(); i++) {
			// Calling getCharge() method from Charge class for each item
			totalCharge += charges.get(i).getCharge();
		}
		return totalCharge;
	}

	@Override
	/*
	 * A method that calculates the total VAT charge for items with a specific
	 * VATRate
	 */
	public double calculateVATChargeAtRate(VATRate r) {
		double vat = 0;
		// Iteration loop for the "charges" arrayList
		for (int i = 0; i < charges.size(); i++) {
		// validation for each charge
			if (charges.get(i).getService().getRate() == r) {
				vat += (charges.get(i).getCharge() * charges.get(i).calculateVAT()) / 100;
			}
		}
		return vat;
	}

	@Override
	/*
	 * Method for calculating total charge plus the total VAT charge
	 */
	public double calculateTotalChargeIncVat() {
		double charge = 0;
		double vat = 0;
		// calculating all charge and vat from list
		for (int i = 0; i < charges.size(); i++) {
			charge += charges.get(i).getCharge();
			vat += (charges.get(i).getCharge() * charges.get(i).calculateVAT()) / 100;
		}
		return (charge + vat);
	}

	// Method for returning guest details in certain format
	public String toString() {
		StringBuffer output = new StringBuffer();
		output.append(forename);
		output.append(" " + surname);
		output.append(", " + address);
		output.append(", " + telephone);
		return output.toString();
	}

	// Method for retrieving the forename
	public String getForename() {
		return forename;
	}

	// Method for retrieving the surname
	public String getSurname() {
		return surname;
	}

	// Method for retrieving the address
	public String getAddress() {
		return address;
	}

	// Method for retrieving the telephone number
	public String getTelephone() {
		return telephone;
	}

	// Method for retrieving the list of Charges
	public List<Charge> getCharges() {
		return charges;
	}
}
