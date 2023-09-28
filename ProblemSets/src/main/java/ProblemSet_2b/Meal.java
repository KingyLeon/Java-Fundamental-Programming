package ProblemSet_2b;

public class Meal {
	Food mainCourse;
	Food desert;
	
	public Meal (Food Main, Food Desert) {
		mainCourse = Main;
		desert = Desert;
	}
	
	public double calculateTotalSugarLevel() {
		return (mainCourse.getAmountOfSugar() + desert.getAmountOfSugar());
	}
	
	public String toString() {
		
		return ("Meal [mainCourse = " + mainCourse.getName() + ", dessert = " + desert.getName() + "]");
	}
}
