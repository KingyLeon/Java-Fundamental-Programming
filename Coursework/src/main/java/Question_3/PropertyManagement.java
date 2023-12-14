package Question_3;

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
		double exempt = 0;
		double notExempt = 0;
		for (Property i : properties) {
			int Professional = 0;
			int Student = 0;
			for (ITenant t : i.getRooms().values()) {
				if (t.getType() == TenantType.PROFESSIONAL) {
					Professional++;
				} else {
					Student++;
				}
			}
			if (Professional == 0 && Student > 0) {
				exempt++;
			} else {
				notExempt++;
			}
		}
		return (exempt / (notExempt + exempt) * 100.0);
	}

	public String findProblematicProperty() {
		StringBuffer output = new StringBuffer();
		for (Property p : properties) {
			output.append(p.toString());
		}
		return output.toString();
	}

	public String displayInfographics() {
		int to25 = 0;
		int to35 = 0;
		int to49 = 0;
		int to60 = 0;
		int to100 = 0;
		int student = 0;
		int professional = 0;

		for (Property p : properties) {
			for (ITenant t : p.getRooms().values()) {
				if (t.getAge() < 26 && t.getAge() > 16) {
					to25++;
				} else if (t.getAge() > 25 && t.getAge() < 36) {
					to35++;
				} else if (t.getAge() > 35 && t.getAge() < 50) {
					to49++;
				} else if (t.getAge() > 49 && t.getAge() < 60) {
					to60++;
				} else if (t.getAge() > 60) {
					to100++;
				}

				if (t.getType() == TenantType.STUDENT) {
					student++;
				} else if (t.getType() == TenantType.PROFESSIONAL) {
					professional++;
				}
			}
		}
		StringBuffer output = new StringBuffer();
		output.append("Confirmed Tenant Summary:\n");
		output.append("17-25:" + to25 + "\n");
		output.append("26-35:" + to35 + "\n");
		output.append("36-49:" + to49 + "\n");
		output.append("50-60:" + to60 + "\n");
		output.append("60+:" + to100 + "\n");
		output.append("*****\n");
		output.append("Professional:" + professional + "\n");
		output.append("Student:" + student);
		return output.toString();

	}
}
