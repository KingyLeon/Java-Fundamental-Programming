package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class StudentTracker {

	private List<Student> studentList;
	private Map<Integer, Student> moduleList;

	public StudentTracker() {
		studentList = new ArrayList<Student>();
		initialiseMap();
	}

	public void addStudent(Student s, List<Module> mList) {
		studentList.add(s);
		// addModuleList()
		for (int i = 0; i < mList.size(); i++) {
			s.addModuleList(mList.get(i));
			moduleList.put(s.getUrn(), s);
		}
	}

	private void initialiseMap() {
		moduleList = new HashMap<>();
	}

	public String printStudents() {
		StringBuffer output = new StringBuffer();
		for (int i = 0; i < studentList.size(); i++) {
			output.append(studentList.get(i).getName() + "(" + studentList.get(i).getUrn() + ")\n");
		}
		return output.toString();
	}

	public String printModules(int urn) {
		StringBuffer output = new StringBuffer();
		output.append("URN " + urn + " is enrolled in:" + "\n");
		output.append(moduleList.get(urn).printModules());
		return output.toString();
	}
}
