package ProblemSet_7b;

import java.util.List;

public class Student {
	private String name;
	private String urn;
	private List<Module> moduleList;

	public Student(String name, String urn) {
		this.name = name;
		this.urn = urn;
	}

	public void addModuleList(Module m) {

	}

	public String printModules() {
		return "";
	}

	public int getUrn() {
		int urn = Integer.valueOf(this.urn);
		return urn;
	}

	public String getName() {
		return this.name;
	}
}
