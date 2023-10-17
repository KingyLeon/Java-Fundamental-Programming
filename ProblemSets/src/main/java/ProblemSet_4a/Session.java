package ProblemSet_4a;

public class Session {
	private String sessionName;
	private int startTime;
	private int endTime;

	public Session(String sessionName, int startTime, int endTime) {
		this.sessionName = sessionName;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public String getSessionName() {
		return sessionName;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}
