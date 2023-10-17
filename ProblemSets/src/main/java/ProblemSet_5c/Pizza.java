package ProblemSet_5c;

public class Pizza {
	private String[] toppings;
	
	public Pizza() {
		toppings = new String[10];
	}
		
	public void addToppings(String[] toppings) {
		this.toppings = new String[10];
		for(int i = 0; i < toppings.length ; i++) {
			if (this.toppings[i] == null) {	
				this.toppings[i] = toppings[i];
			}
		}
	}

	public String printToppings() {
		String output = "";
		for (int i = 0 ; i< 10 ; i++) {
			if (toppings[i] != null) {
			output = output + toppings[i] + ",";
			}
		}
		return output.substring(0, output.length() - 1);
	}

	public double calculateCost() {
		int count = 0;
		for (int i = 0 ; i < 10 ; i++) {
			if(toppings[i] != null) {
				count = count + 1;
			}
		}
		System.out.println(count);
		switch (count) {
		case 0:
			return 0;
		case 1: 
			return 9.99;
		case (2 | 3):
			return 10.99;
		case (4 | 5):
			return 11.99;
		case (6):
			return 12.99;
		case (7):
			return 13.99;
		case (8):
			return 14.99;
		case (9):
			return 15.99;
		case (10):
			return 14.99;
		default:
			return 0;
			}
		}
	}
