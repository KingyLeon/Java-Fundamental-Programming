package ProblemSet_7c;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String urn;
	private List<Module> moduleList;

	public Student(String name, String urn) {
		moduleList = new ArrayList<Module>();
		if (name.substring(0) != name.substring(0).toUpperCase())
			this.name = name;
		String urnRegularExpression = "[0-9]{5}";
		if (urn.matches(urnRegularExpression)) {
			this.urn = urn;
		} else {
			this.urn = "00000";
		}
	}

	public void addModuleList(Module m) {
		moduleList.add(m);
	}

	public String printModules() {
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < moduleList.size(); i++) {
			if (moduleList.get(i) != null) {
				output.append(moduleList.get(i).getName());
				output.append(", ");
			}
		}
		output.delete(output.length() - 2, output.length());
		return output.toString();
	}

	public int getUrn() {
		int urn = Integer.valueOf(this.urn);
		return urn;
	}

	public String getName() {
		return this.name;
	}
}
