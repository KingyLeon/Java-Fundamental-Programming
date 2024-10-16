package Question_3;

public class Complaint {
	private String title;
	private Severity severity;

	public Complaint(String title, Severity severity) {
		this.title = title;
		this.severity = severity;
		if (title == null || severity == null) {
			throw new NullPointerException();
		}
	}

	public String getTitle() {
		return title;
	}

	public Severity getSeverity() {
		return severity;
	}
}