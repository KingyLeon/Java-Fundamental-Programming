package Question_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Property {
	private int houseNumber;
	private String street;
	private String city;
	private String postCode;
	private int numberOfRooms;
	protected Map<Room, ITenant> rooms;
	protected double councilTax;
	private List<Complaint> complaints;

	public Property(int houseNumber, String street, String city, String postCode, int numberOfRooms) {
		if (!validateCity(city)) {
			throw new IllegalArgumentException("Invalid City");
		}
		if (!validatePostCode(postCode)) {
			throw new IllegalArgumentException("Invalid Postcode");
		}

		this.city = city;
		this.houseNumber = houseNumber;
		this.street = street;
		this.postCode = postCode;
		this.numberOfRooms = numberOfRooms;
		rooms = new HashMap<>();
		complaints = new ArrayList<>();
	}

	public int getAvailableRooms() {
		int output = numberOfRooms;
		for (ITenant value : rooms.values()) {
			if (value != null) {
				output = output - 1;
			}
		}
		return output;
	}

	public void setCouncilTax(double Tax) {
		TenantType[] occupants = new TenantType[rooms.size()];
		int iteration = 0;
		int student = 0;
		int professional = 0;
		for (ITenant i : rooms.values()) {
			occupants[iteration] = i.getType();
			iteration++;
		}

		for (TenantType i : occupants) {
			if (i == TenantType.STUDENT) {
				student++;
			}
			if (i == TenantType.PROFESSIONAL) {
				professional++;
			}
		}
		if (professional == 0 && student > 0) {
			this.councilTax = 0;
		} else if ((student == 0 && professional == 0) || professional > 1) {
			this.councilTax = Tax;
		} else if (professional == 1) {
			this.councilTax = Tax * 0.75;
		}
	}

	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(houseNumber + " ");
		output.append(street + ", ");
		output.append(city + " ");
		output.append(postCode + " (");
		output.append(numberOfRooms + " bedroom ");
		return output.toString();
	}

	private boolean validateCity(String input) {
		String regex = "[A-Z][a-z]+";
		return input.matches(regex);
	}

	private boolean validatePostCode(String input) {
		String regex1 = "GU[0-9]{2}[A-Z]{2}";
		String regex2 = "GU[0-9] [0-9][A-Z]{2}";
		boolean output;
		if (input.matches(regex1) || input.matches(regex2)) {
			output = true;
		} else {
			output = false;
		}
		return output;
	}

	public void addComplaint(Complaint c) {
		complaints.add(c);
	}

	public int calculateImpact() {
		int output = 0;
		for (Complaint c : complaints) {
			output += c.getSeverity().getWeight();
		}
		return output;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getPostCode() {
		return postCode;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public Map<Room, ITenant> getRooms() {
		return rooms;
	}

	public void setRooms(Map<Room, ITenant> rooms) {
		this.rooms = rooms;
	}

	public double getCouncilTax() {
		return councilTax;
	}

	public abstract double getPrice();

	public abstract boolean isAvailable();

	public abstract void occupy(Room r, ITenant t);

	public abstract String displayOccupiedProperty();

}
