package ProblemSet_2b;

public class Food {
	String name;
	double amountOfSugar;
	
	public Food(String food, double sugar) {
		name = food;
		amountOfSugar = sugar;
	}
	
	public double getAmountOfSugar() {
		return amountOfSugar;
	}
	
	public String getName() {
		return name;
	}
}
