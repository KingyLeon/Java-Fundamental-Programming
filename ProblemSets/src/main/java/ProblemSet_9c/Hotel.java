package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String name;
	private List<IGuest> guests;

	/*
	 * parameterised Constructor for assigning hotel name and initialising guest
	 * list
	 */
	public Hotel(String name) {
		this.name = name;
		guests = new ArrayList<>();
	}

	// Method for adding a new guest to the guests ArrayList
	public void addGuest(IGuest guest) {
		guests.add(guest);
	}

	/*
	 * Method for printing full list of guests at specific hotel. Formatting for
	 * guests is done in the "Guest" class
	 */
	public String printGuestList() {
		StringBuffer output = new StringBuffer();
		output.append(name + " Hotel" + "\n");
		output.append("Guest List" + "\n");
		for (int i = 0; i < guests.size(); i++) {
			output.append(guests.get(i) + "\n");
		}
		return output.toString();
	}

	// Public method for returning name to other classes
	public String getName() {
		return name;
	}

	// public method for returning the list "guests" to other classes
	public List<IGuest> getGuests() {
		return guests;
	}

}
