package ProblemSet_4c;

public class Student {
	private char initial;
	private String surname;
	private Module[] modules;

	public Student(char initial, String surname) {
		this.initial = initial;
		this.surname = surname;
		this.modules = new Module[8];
	}

	int calculateYearAverage() {
		double output = 0;
		for (int i = 0; i < 8; i++) {
			output += modules[i].getAverage();
		}
		output = output / 8;
		return (int) output;
	}

	public String displayArray() {
		String output = "";
		for (int i = 0; i < 8; i++) {
			if (modules[i] != null) {
				output = output
					+ modules[i].getCode()
					+ ": " + modules[i].getAverage()
					+ "\n";
			}
		}
		output = output
				+ "Year Average: "
				+ calculateYearAverage() + "%";
		return output;
	}

	public Module getModules(int index) {
		System.out.println(modules[index].getCode());
		Module output = modules[index];
		return output;
	}
	public String getStudentDetails() {
		return (initial + ". " + surname 
				+ " "
				+ calculateYearAverage()
				+ "%");
	}

	public void setModules(int index,
			String code,
			double average) {
		modules[index] = new Module(code, average);
	}
}
