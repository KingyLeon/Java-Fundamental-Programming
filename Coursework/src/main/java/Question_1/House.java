package Question_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ProblemSet_7c.Student;

public class House {
	private int houseNumber;
	private String street;
	private String city;
	private String postCode;
	private int numberOfRooms;
	private Map<Room, ITenant> rooms;

	public House(int houseNumber, String street, String city, String postCode, int numberOfRooms) {
		if (validateCity(city) != true) {
			throw new IllegalArgumentException("Invalid City");
		}
		this.city = city;
		if (validatePostCode(postCode) != true) {
			throw new IllegalArgumentException("Invalid Postcode");
		}
		this.houseNumber = houseNumber;
		this.street = street;
		this.postCode = postCode;
		this.numberOfRooms = numberOfRooms;

		rooms = new HashMap<>(numberOfRooms);
		/*
		 * for (int i = 1; i <= numberOfRooms; i++) { Room room = new Room(0);
		 * rooms.put(room, null); }
		 */
	}

	// Return number of unpopulated rooms
	public int getAvailableRooms() {
		int output = 0;
		for (ITenant value : rooms.values()) {
			if (value == null) {
				output++;
			}
		}
		return output;
	}

	public double getPrice() {

		return 0;
	}

	public boolean isAvailable() {

		return true;
	}

	public void occupy(Room r, ITenant t) {
		if (isAvailable() == true) {
			System.out.println(rooms);

		}
	}

	public String toString() {
		return "";
	}

	private boolean validateCity(String input) {

		return true;
	}

	private boolean validatePostCode(String input) {
		return true;
	}
}
