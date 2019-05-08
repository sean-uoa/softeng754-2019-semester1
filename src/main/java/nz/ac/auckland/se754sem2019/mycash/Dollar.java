package nz.ac.auckland.se754sem2019.mycash;

public class Dollar {

	private int amount;
	
	public Dollar(int amount) {
		this.amount = amount;
	}
	
	public Dollar times(int multiplier) {
		this.amount *= multiplier;
		return this;
	}
	
	@Override
	public String toString() {
		return "$"+this.amount;
	}
}
