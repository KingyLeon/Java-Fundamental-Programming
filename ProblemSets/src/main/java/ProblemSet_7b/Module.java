package ProblemSet_7b;

public class Module {
	private String name;
	
	public Module(String name) {
		this.name = name;
	}
	
	public String getName() {
		String regularExpression = "COM[0-9]{4}";
		if (name.matches(regularExpression)) {
		return this.name;
		}
		return "Error";
	}
}
