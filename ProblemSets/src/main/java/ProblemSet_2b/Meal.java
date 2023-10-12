package ProblemSet_2b;

public class Meal {
	private Food mainCourse;
	private Food desert;

	public Meal (Food main, Food dessert) {
		this.mainCourse = main;
		this.desert = dessert;
	}

	public double calculateTotalSugarLevel() {
		return (mainCourse.getAmountOfSugar() + desert.getAmountOfSugar());
	}

	public String toString() {
		return ("Meal [mainCourse = " + mainCourse.getName() + ", dessert = " + desert.getName() + "]");
	}
}