package ProblemSet_4a;

public class Day {
	private String name;
	private Session[] sessions;

	public Day(String Day) {
		this.sessions = new Session[4];
		this.name = Day;
	}

	public void setSession(int index, String moduleName, int startTime, int endTime) {
		sessions[index] = new Session(moduleName, startTime, endTime);
	}

	public Session getSessions(int index) {
		for (int i = index; i<= 4;) {
		Session storedSession = sessions[i];
		return storedSession;}
		return null;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString(){
		String output = "";
		for (int i = 0; i<4; i++) {
			if (sessions[i] != null) {
				output += (sessions[i].getSessionName() + ": " + sessions[i].getStartTime() + " - " + sessions[i].getEndTime() + "\n");
			}
		}
		return output;
	}

	public void display() {
		System.out.println(getName() + "\n" + toString());
	}
}
