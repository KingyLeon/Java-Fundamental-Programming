package ProblemSet_4b;

public class Classroom {
	private String room;
	private final int CAPACITY = 20;
	private Student[] maxStudents;

	public Classroom(String room) {
		this.room = room;
		this.maxStudents = new Student[CAPACITY];
		}

	public void addStudents(int index, char initial, String surname) {
		maxStudents[index] = new Student(initial, surname);
	}

	public int howManyStudents() {
		int count = 0;
		for (int i =0; i<maxStudents.length; i++) {
			if (maxStudents[i] != null) {
				count = count +1;
			}
		}
		return count;
	}

	public String getRoom() {
		return room;
	}

	public int getCapacity() {
		return CAPACITY;
	}

	public String getSummary() {
		int arrayLength = maxStudents.length;
		String students = "";
		if (howManyStudents() == 0) {
			students = "No students added";
		}
		for (int i = 0; i < arrayLength; i ++ ) {
			if (maxStudents[i] != null) {
			students = students + maxStudents[i].getStudentDetails() +"\n";
			}
		}
		return students;
	}
}
