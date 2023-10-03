package ProblemSet_2c;

public class Module {
	String Name;
	Assessment assessment1;
	Assessment assessment2;
	Assessment assessment3;
	double average;
	public Module(Assessment Assessment1,Assessment Assessment2, Assessment Assessment3 ) {
		assessment1 = Assessment1;
		assessment2 = Assessment2;
		assessment3 = Assessment3;
	}
	
	public double calculateAverage() {
		double average1 = 0.4*((assessment1.getMark() + assessment2.getMark()) / 2.0);
		double average2 = 0.6*(assessment3.getMark());
		average = average1 + average2;
		return average;
	}
	
	public String toString() {
		return ("COM1027 (" + (calculateAverage()) +"%)");
	}
}
