package Question_1;

import java.util.ArrayList;
import java.util.List;

// COME BACK AND COMMENT PLEASE MY LOVE
public class PropertyManagement {
	private List<House> properties;

	public PropertyManagement() {
		properties = new ArrayList<>();
	}

	public void addProperty(House p) {
		properties.add(p);
	}

	public void addTenant(House p, Room r, ITenant t) {
		if (properties.contains(p)) {
			if (p.isAvailable()) {
				p.occupy(r, t);
			}
		} else {
			throw new IllegalArgumentException("House Full");
		}
	}

	public String displayProperties() {
		String output = "";
		for (int i = 0; i < properties.size(); i++) {
			output += properties.get(i).toString() + "\n";
		}
		return output;
	}

	public void removeProperty(House p) {
		if (properties.contains(p)) {
			properties.remove(p);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
