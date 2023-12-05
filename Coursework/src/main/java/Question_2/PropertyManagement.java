package Question_2;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	private List<House> properties;

	public PropertyManagement() {
		properties = new ArrayList<>();
	}

	public void addProperty(House p) {
		properties.add(p);
	}

	public void addTenant(House p, Room r, ITenant t) {
		p.occupy(r, t);
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
		}
		else {
			throw new IllegalArgumentException();
		}
	}
}
