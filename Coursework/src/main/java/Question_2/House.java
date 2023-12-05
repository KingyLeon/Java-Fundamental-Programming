package Question_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House extends Property {

	public House(int houseNumber, String street, String city, String postCode, int numberOfRooms) {
		super(houseNumber, street, city, postCode, numberOfRooms);
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAvailable() {
		boolean output = true;
		if (rooms.size() == numberOfRooms) {
			output = false;
		}
		return output;
	}

	@Override
	public void occupy(Room r, ITenant t) {
		if (isAvailable() == true) {
			System.out.println(rooms);
			rooms.put(r, t);
		}		
	}

	@Override
	public String displayOccupiedProperty() {
		// TODO Auto-generated method stub
		return null;
	}
}
