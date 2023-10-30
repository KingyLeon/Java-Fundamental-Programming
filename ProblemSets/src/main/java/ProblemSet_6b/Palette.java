package ProblemSet_6b;

public class Palette {
	private P_COLOUR[] primaryColours;

	public Palette() {
		this.primaryColours = new P_COLOUR[3];
	}

	public Palette(P_COLOUR[] colour) {
		this.primaryColours = colour;
	}

	public void addColour(P_COLOUR colour) {
		for (int i = 0; i < 3; i++) {
			if (primaryColours[i] != colour && primaryColours[i] == null) {
				primaryColours[i] = colour;
				break;
			}
		}
	}

	public String getColours() {
		StringBuffer output = new StringBuffer();
		String msg;
		for (int i = 0; i < 3; i++) {
			if (primaryColours[i] != null) {
				output.append(primaryColours[i] + ", ");
			}
		}
		msg = output.toString();
		if (msg.length() > 0) {
			msg = msg.substring(0, msg.length() - 2);
		}

		if (msg.length() == 0) {
			msg = "No colours added";
		}
		return msg;
	}
}
