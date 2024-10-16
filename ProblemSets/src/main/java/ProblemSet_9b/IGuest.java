package ProblemSet_9b;

public interface IGuest {
	public void addCharge(Service s, double c);

	double calculateTotalChargeWithoutVAT();

	double calculateVATChargeAtRate(VATRate r);

	double calculateTotalChargeIncVat();

	String toString();
}
