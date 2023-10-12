package ProblemSet_2c;

public class Module {
	String Name;
	Assessment assessment1;
	Assessment assessment2;
	Assessment assessment3;
	double average;

	public Module(Assessment assessment1,Assessment assessment2, Assessment assessment3 ) {
		this.assessment1 = assessment1;
		this.assessment2 = assessment2;
		this.assessment3 = assessment3;
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
