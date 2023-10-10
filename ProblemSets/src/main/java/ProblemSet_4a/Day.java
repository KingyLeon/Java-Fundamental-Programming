package ProblemSet_4a;

public class Day {
	private String name;
	private Session[] sessions;
	private Session storedSession;

	public Day(String Day) {
		this.sessions = new Session[4];
		this.name = Day;
	}

	public void setSession(int index, String moduleName, int startTime, int endTime) {
		sessions[index] = new Session(moduleName, startTime, endTime);
	}

	public Session getSessions(int index) {
		for (int i = index; i<= 4; i++) {
		Session storedSession = sessions[i];
		System.out.println(storedSession.toString());
		return storedSession;
		}
		return storedSession;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString(){
		return (storedSession.getSessionName() + ": " + storedSession.getStartTime() + " - " + storedSession.getEndTime() + "\n");
	}

	public void display() {
		System.out.println(getName() + "\n" + toString());
	}
}
