package ProblemSet_2b;

public class Food {
	private String name;
	private double amountOfSugar;

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
