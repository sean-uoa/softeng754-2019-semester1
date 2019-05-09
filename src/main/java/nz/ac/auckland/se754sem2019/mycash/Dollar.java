package nz.ac.auckland.se754sem2019.mycash;

public class Dollar {

	private int amount;
	private ICalculator calculator;
	
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
	
	public Dollar dividedBy(int denominator) throws NegativeNumberException{
		if (denominator < 0) {
			throw new NegativeNumberException();
		}
		this.amount /= denominator;
		return this;
	}

	public void setCalculator(ICalculator calculator) {
		this.calculator = calculator;
	}

	public boolean isCalculatorNull() {
		return this.calculator == null;
	}

	public Dollar timesWithCalculator(int multiplier) {
		
		return null;
	}
	
	
}
