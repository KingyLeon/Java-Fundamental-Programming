package ProblemSet_5b;

public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;

	public GasBill(String accountNumber, double amount, Customer customer) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
	}

	public boolean checkAccountAccuracy(String accountNumber) {
		String accountCheck = "G[0-9]{4}-[0-9]{4}-[0-9]{4}";
		return accountNumber.matches(accountCheck);
	}

	public String displayAccountDetails() {
		StringBuffer output = new StringBuffer();
		char initial = customer.getName();
		output.append("Gas Bill" + "\n");
		output.append(" Account Number:" + getAccountNumber() + "\n");
		output.append(" Customer:" + initial + ". ");
		output.append(customer.getSurname() + "\n");
		output.append(" Amount due:£" + String.format("%.2f",  amount));
		return output.toString();
	}

	public String displayAmountDue() {
		return ("" + amount);
	}

	public String getAccountNumber() {
		String output = "Invalid Account";
		if (checkAccountAccuracy(accountNumber)) {
		return accountNumber;
		}
		return output;
	}

	public String getCustomer() {
		return customer.toString();
	}
}
