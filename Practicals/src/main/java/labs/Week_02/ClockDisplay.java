package labs.Week_02;

import java.text.DecimalFormat;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;

	public ClockDisplay() {
		super();
		this.hours = new NumberInfo(24);
		this.minutes = new NumberInfo(60);
	}

	public void timeTick() {
		this.minutes.increment();
		if( this.minutes.getValue() == 0) {
			this.hours.increment();
		}
	}

	@Override
	public String toString() {
		DecimalFormat style = new DecimalFormat("00");
		return style.format(this.hours.getValue())+":"+style.format(this.minutes.getValue());
	}


}
