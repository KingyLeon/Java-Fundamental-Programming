package ProblemSet_4c;

public class Module {
	private String code;
	private double average;

	public Module(String name, double mark) {
		this.code = name;
		this.average = mark;
	}

	public String getCode() {
		return code;
	}

	public double getAverage() {
		return average;
	}

	public String toString() {
		return (code + ": " + average);
	}
}
