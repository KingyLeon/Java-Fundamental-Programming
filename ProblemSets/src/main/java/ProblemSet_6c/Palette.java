package ProblemSet_6c;

public class Palette {
	private P_COLOUR[] primaryColours;

	public Palette() {
		this.primaryColours = new P_COLOUR[3];
	}

	public Palette(P_COLOUR[] colour) {
		try {
			this.primaryColours = new P_COLOUR[3];
			for (int i = 0; i < colour.length; i++) {
				if (colour != null) {
					this.primaryColours[i] = colour[i];
				}
			}
		} catch (Exception exception1) {
			throw new IllegalArgumentException();
		}
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

	public String mixColours() {
		// RED + BLUE + YELLOW = BLACK

		StringBuffer mix = new StringBuffer();
		String mixString = "";
		String finalOut;
		for (int i = 0; i < 3; i++) {
			if (primaryColours[i] != null) {
				mix.append(primaryColours[i] + ", ");
			}
		}
		mixString = mix.toString();
		if (mixString.length() > 0) {
			mixString = mixString.substring(0, mixString.length() - 2);
		}

		switch (mixString) {
		case ("RED, YELLOW"):
			finalOut = "ORANGE";
			break;
		case ("YELLOW, ORANGE"):
			finalOut = "ORANGE";
			break;
		case ("BLUE, YELLOW"):
			finalOut = "GREEN";
			break;
		case ("YELLOW, BLUE"):
			finalOut = "GREEN";
			break;
		case ("RED, BLUE"):
			finalOut = "PURPLE";
			break;
		case ("BLUE, RED"):
			finalOut = "PURPLE";
			break;
		case ("RED, BLUE, YELLOW"):
			finalOut = "BLACK";
			break;
		case ("RED, YELLOW, BLUE"):
			finalOut = "BLACK";
			break;
		case ("YELLOW, RED, BLUE"):
			finalOut = "BLACK";
			break;
		case ("YELLOW, BLUE, RED"):
			finalOut = "BLACK";
			break;
		case ("BLUE, RED, YELLOW"):
			finalOut = "BLACK";
			break;
		case ("BLUE, YELLOW, RED"):
			finalOut = "BLACK";
			break;
		default:
			finalOut = mixString;
		}
		return finalOut;
	}

	public String display() {
		StringBuffer output = new StringBuffer();
		String msg;
		for (int i = 0; i < 3; i++) {
			if (primaryColours[i] != null) {
				output.append(primaryColours[i] + ", ");
			}
		}
		output.replace(output.length() - 2, output.length(), " = " + mixColours());
		msg = output.toString();
		return msg;
	}
}
