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
		boolean fact = false;
		if(accountNumber.charAt(0) == 'G') {
			if(accountNumber.charAt(5) == '-') {
				if(accountNumber.charAt(10) == '-') {
					if (String.valueOf(Integer.parseInt((accountNumber).substring(1,5))) != "NumberFormatException"){
						if (String.valueOf(Integer.parseInt((accountNumber).substring(6,10))) != "NumberFormatException"){
							fact = true;
						}
					}
				}	
			}
		}
		return fact;
	}

	public String displayAccountDetails() {
		String output = null;
		String initial = customer.getName().substring(0,1);
		output = ("Gas Bill" + "\n");
		output = output + (" Account Number:" + getAccountNumber() + "\n");
		output = output + (" Customer:" + initial + ". "+ customer.getSurname() + "\n");
		output = output + " Amount due:£" + String.format("%.2f",  amount);
		return output;
	}

	public String displayAmountDue() {
		return ("" + amount);
	}

	public String getAccountNumber() {
		String output = "Invalid Account";
		if (checkAccountAccuracy(accountNumber) == true) {
		return accountNumber;
		}
		return output;
	}

	public String getCustomer() {
		return customer.toString();
	}
}
