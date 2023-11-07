package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String name;
	private List<IGuest> guests;
	
	public Hotel(String name) {
		this.name = name;
		guests = new ArrayList<>();
	}
	
	public void addGuest(IGuest guest) {
		guests.add(guest);
	}
	
	public String printGuestList() {
		StringBuffer output = new StringBuffer();
		output.append(name + " Hotel" + "\n");
		output.append("Guest List" + "\n");
		for(int i =0; i < guests.size() ; i ++) {
			output.append(guests.get(i) + "\n");
		}
		return output.toString();
	}

	public String getName() {
		return name;
	}

	public List<IGuest> getGuests() {
		return guests;
	}
	
	
}
