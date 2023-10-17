package ProblemSet_2b;

public class Meal {
	private Food mainCourse;
	private Food dessert;

	public Meal(Food main, Food dessert) {
		this.mainCourse = main;
		this.dessert = dessert;
	}

	public double calculateTotalSugarLevel() {
		double output = mainCourse.getAmountOfSugar();
				output = output + dessert.getAmountOfSugar();
		return (mainCourse.getAmountOfSugar() + dessert.getAmountOfSugar());
	}

	public String toString() {
		String output = "Meal [mainCourse = " + mainCourse.getName();
		output = output + ", dessert = " + dessert.getName() + "]";
		return (output);
	}
}
