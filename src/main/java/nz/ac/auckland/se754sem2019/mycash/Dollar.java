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
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Dollar && this.amount == ((Dollar) other).amount) {
			return true;
		}
		return false;
	}
	
	public Dollar dividedBy(int denominator) {
		this.amount /= denominator;
		return this;
	}
}