package nz.ac.auckland.se754sem2019.mycash;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DollarMultiplicationTest {
	
	@Test
	public void testMuliplication() {
		// Preconditions
		Dollar five = new Dollar(5);
		
		// Actions
		Dollar result = five.times(2);
		
		// Postconditions
		assertEquals(new Dollar(10), result);
	}
}
