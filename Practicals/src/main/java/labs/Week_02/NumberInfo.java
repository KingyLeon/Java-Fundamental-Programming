package labs.Week_02;

public class NumberInfo {
	private int limit;
	private int value;

	public NumberInfo(int limit) {
		super();
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void increment(){
		this.value += 1; 
		if(this.value == this.limit) {
			this.value = 0;
		}
	}
}