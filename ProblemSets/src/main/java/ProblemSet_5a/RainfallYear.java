package ProblemSet_5a;

public class RainfallYear {
	private int year;
	double[] rainfallMonths;
	
	public RainfallYear(int year) {
		this.year = year;
		rainfallMonths = new double[12];
	}
	
	public double calculateMeanRainfall() {
		double total = 0;
		for (int i = 0; i<= 11; i++)
		{
			if(rainfallMonths[i] != 0.0) {
			total = total + rainfallMonths[i];
			}
		}
		total = total / 12;
		return total;
	}
	
	public double calculateHighestRainfall() {
		double highest = 0;
		for(int i=0; i<=11; i++) {
			if (rainfallMonths[i] > highest) {
				highest = rainfallMonths[i];
			}
		}
		return highest;
	}
	
	public void enterData(double[] rainfall) {
		rainfallMonths = new double[12];
		rainfallMonths = rainfall;
	}

	public double getRainfallMonth(String month) {
		double rain = 0;
		switch(month.toUpperCase()) {
			case ("JANUARY"):
				rain = rainfallMonths[0];
			break;
			case ("FEBRUARY"):
				rain = rainfallMonths[1];
			break;
			case ("MARCH"):
				rain = rainfallMonths[2];
			break;
			case ("APRIL"):
				rain = rainfallMonths[3];
			break;
			case ("MAY"):
				rain = rainfallMonths[4];
			break;
			case ("JUNE"):
				rain = rainfallMonths[5];
			break;
			case ("JULY"):
				rain = rainfallMonths[6];
			break;
			case ("AUGUST"):
				rain = rainfallMonths[7];
			break;
			case ("SEPTEMBER"):
				rain = rainfallMonths[8];
			break;
			case ("OCTOBER"):
				rain = rainfallMonths[9];
			break;
			case ("NOVEMBER"):
				rain = rainfallMonths[10];
			break;
			case ("DECEMBER"):
				rain = rainfallMonths[11];
			break;
		}
		return rain;
	}
	
	public int getYear() {
	return year;	
	}
}
