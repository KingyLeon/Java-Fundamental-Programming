package Question_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		if (validatePostCode(postCode) != true) {
			throw new IllegalArgumentException("Invalid Postcode");
		}

		this.city = city;
		this.houseNumber = houseNumber;
		this.street = street;
		this.postCode = postCode;
		this.numberOfRooms = numberOfRooms;
		rooms = new HashMap<>();
	}

	// Return number of un-populated rooms
	public int getAvailableRooms() {
		int output = numberOfRooms;
		for (ITenant value : rooms.values()) {
			if (value != null) {
				System.out.println("Value is ran");
				output = output - 1;
			}
		}
		return output;
	}

	public double getPrice() {
		int output = 0;
		for (Room key : rooms.keySet()) {
			if (key != null) {
				output += key.getPrice();
			}
		}
		return output;
	}

	public boolean isAvailable() {
		boolean output = true;
		if (rooms.size() == numberOfRooms) {
			output = false;
		}
		return output;
	}

	public void occupy(Room r, ITenant t) {
		if (isAvailable() == true) {
			System.out.println(rooms);
			rooms.put(r, t);
		}
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(houseNumber + " ");
		output.append(street + ", ");
		output.append(city + " ");
		output.append(postCode + " (");
		output.append(numberOfRooms + " bedroom house :");
		output.append(getAvailableRooms() + " available)");
		return output.toString();
	}

	private boolean validateCity(String input) {

		String regularExpression ="[A-Z][a-z]+" ;
		boolean output;
		if (input.matches(regularExpression)) {
			output = true;
		} else {
			output = false;
		}

		return output;
	}

	private boolean validatePostCode(String input) {

		String regularExpression1 = "[A-Z]{2}[0-9]{2}[A-Z]{2}";
		String regularExpression2 = "[A-Z]{2}[0-9] [0-9][A-Z]{2}";
		boolean output;
		if (input.matches(regularExpression1) || input.matches(regularExpression2)) {
			output = true;
		} else {
			output = false;
		}

		return output;
	}
}
