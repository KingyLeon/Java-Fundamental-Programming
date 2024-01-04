package Question_2;

public class Flat extends Property {
	private double MAINTENANCE_COSTS = 500.0;
	private int floor;

	public Flat(int houseNumber, String street, String city, String postCode, int numberOfRooms, int floor) {
		super(houseNumber, street, city, postCode, numberOfRooms);
		this.floor = floor;
		if (floor < 0) {
			throw new IllegalArgumentException();
		}
	}

	@Override
	// Return total price of all rooms
	public double getPrice() {
		int output = 0;
		for (Room key : rooms.keySet()) {
			if (key != null) {
				output += key.getPrice();
			}
		}
		return output;
	}

	@Override
	// Returns if rooms are available
	public boolean isAvailable() {
		boolean output = false;
		if (rooms.isEmpty()) {
			output = true;
		}
		return output;
	}

	@Override
	// Inserts new key and values into rooms map
	public void occupy(Room r, ITenant t) {
		if (t.getType() == TenantType.PROFESSIONAL) {
			rooms.put(r, t);
			setRooms(rooms);
			// Only professionals can occupy
		}
	}

	@Override
	/*
	 * displays all of the rooms, their prices and number available
	 */
	public String displayOccupiedProperty() {
		StringBuilder output = new StringBuilder();
		output.append(toString() + "\n");
		int sum = 0;
		for (Room i : rooms.keySet()) {
			output.append("room: " + i.getPrice() + "\n");
			sum += i.getPrice();
		}
		sum += MAINTENANCE_COSTS;
		output.append("Total: £" + sum);
		output.append(" (Council Tax: £" + getCouncilTax());
		return output.toString();
	}

	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(getHouseNumber() + " ");
		output.append(getStreet() + ", ");
		output.append(getCity() + " ");
		output.append(getPostCode() + " (");
		output.append(getNumberOfRooms() + " bedroom flat on ");
		output.append(floor + " floor :");
		output.append(getAvailableRooms() + " available)");
		return output.toString();
	}
}
