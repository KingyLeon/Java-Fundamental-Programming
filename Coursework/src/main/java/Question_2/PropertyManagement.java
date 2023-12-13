package Question_2;

import java.util.ArrayList;
import java.util.List;

public class PropertyManagement {
	private List<Property> properties;

	public PropertyManagement() {
		properties = new ArrayList<>();
	}

	public void addProperty(Property p) {
		if (!properties.contains(p)) {
			properties.add(p);
		}
	}

	public void addTenant(Property p, Room r, ITenant t) {
		p.occupy(r, t);
	}

	public String displayProperties() {
		StringBuffer output = new StringBuffer();
		for (Property i : properties) {
			if (i.getAvailableRooms() == 0) {
				output.append(i.displayOccupiedProperty());
			} else {
				output.append(i.toString() + "\n");
			}
		}
		System.out.println(output.toString());
		return output.toString();
	}

	public void removeProperty(Property p) {
		if (properties.contains(p)) {
			properties.remove(p);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int numberOfPropertyType(String type) {
		int output = 0;
		int houseCount = 0;
		int flatCount = 0;
		for (Property i : properties) {
			if (i instanceof House && type.toLowerCase() == "house") {
				houseCount++;
			} else if (i instanceof Flat && type.toLowerCase() == "flat") {
				flatCount++;
			}
		}
		if (houseCount > flatCount) {
			output = houseCount;
		} else if (flatCount > houseCount) {
			output = flatCount;
		}
		return output;
	}

	public double percentageCouncilTaxExemption() {
		int exempt;
		int notExempt;
		for (Property i : properties) {
			int Professional = 0;
			int Student = 0;
			for (ITenant t : i.getRooms().values()) {
				if ( t.getType() == TenantType.PROFESSIONAL) {
					Professional++;
				}
				else {
					Student++;
				}
			}
			}
	}
}
