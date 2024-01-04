package Question_3;

public enum Severity {
	HIGH(3), MEDIUM(2), LOW(1);

	private int weight;

	Severity(int weight) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}
}
