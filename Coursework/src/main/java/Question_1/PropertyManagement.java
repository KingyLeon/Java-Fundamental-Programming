package Question_1;

import java.util.ArrayList;
import java.util.List;

// COME BACK AND COMMENT PLEASE MY LOVE
public class PropertyManagement {
	private List<House> properties;
	
	// Initialise List of Properties
	public PropertyManagement() {
		properties = new ArrayList<>();
	}
	//Adds new property to property list
	public void addProperty(House p) {
		if (!properties.contains(p)) {
			properties.add(p);
		}
	}
	/* Takes a house and if present in
	 *  list, tenant is added to the room
	 *  if the room is also available
	 */
	public void addTenant(House p, Room r, ITenant t) {
		if (properties.contains(p)) {
			if (p.isAvailable()) {
				p.occupy(r, t);
			}
		} else {
			throw new IllegalArgumentException("House Full");
		}
	}
	// Displays all properties in the list
	public String displayProperties() {
		String output = "";
		for (int i = 0; i < properties.size(); i++) {
			output += properties.get(i).toString() + "\n";
		}
		return output;
	}
	/* Removes a property from the
	 * list if it is present in the list
	 */
	public void removeProperty(House p) {
		if (properties.contains(p)) {
			properties.remove(p);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
