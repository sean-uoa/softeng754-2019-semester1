package nz.ac.auckland.se754sem2019.mycash;

public class Dollar {

	int amount;
	
	public Dollar(int amount) {
		this.amount = amount;
	}
	
	public void times(int multiplier) {
		this.amount = this.amount*2;
	}
}
