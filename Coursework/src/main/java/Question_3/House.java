package Question_3;

public class House extends Property {

	public House(int houseNumber, String street, String city, String postCode, int numberOfRooms) {
		super(houseNumber, street, city, postCode, numberOfRooms);
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(getHouseNumber() + " ");
		output.append(getStreet() + ", ");
		output.append(getCity() + " ");
		output.append(getPostCode() + " (");
		output.append(getNumberOfRooms() + " bedroom house :");
		output.append(getAvailableRooms() + " available)");
		return output.toString();
	}

	@Override
	public double getPrice() {
		int output = 0;
		for (Room key : getRooms().keySet()) {
			if (key != null) {
				output += key.getPrice();
			}
		}
		return output;
	}

	@Override
	public boolean isAvailable() {
		return !(rooms.size() == getNumberOfRooms());
	}

	@Override
	public void occupy(Room r, ITenant t) {
		if (isAvailable() == true) {
			rooms.put(r, t);
		}
	}

	@Override
	public String displayOccupiedProperty() {
		StringBuilder output = new StringBuilder();
		output.append(toString() + "\n\t");
		int sum = 0;
		for (Room i : rooms.keySet()) {
			output.append("Room: " + i.getPrice() + "\n\t");
			sum += i.getPrice();
		}
		if (getAvailableRooms() == 0) {
			output.append("Total: £" + String.format("%.2f", (sum * 12.0)));
			output.append(" (Council Tax: £" + getCouncilTax() + ")\n");
		} else {
			output.delete(output.length() - 1, output.length());
		}
		return output.toString();
	}
}
