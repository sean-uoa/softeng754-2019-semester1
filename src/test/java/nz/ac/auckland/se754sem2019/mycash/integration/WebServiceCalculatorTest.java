package nz.ac.auckland.se754sem2019.mycash.integration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import nz.ac.auckland.se754sem2019.mycash.Dollar;
import nz.ac.auckland.se754sem2019.mycash.ICalculator;

public class WebServiceCalculatorTest {
	
	@Test
	public void testMultiplication() {
		// Given
		WebServiceCalculator wsCalculator = new WebServiceCalculator();
		
		// When
		int result = wsCalculator.multiply(5, 2);
		
		// Then
		assertEquals(10, result);
	}
	
	@Test
	public void testDivision() {
		// Given
				WebServiceCalculator wsCalculator = new WebServiceCalculator();
				
				// When
				int result = wsCalculator.divide(5, 2);
				
				// Then
				assertEquals(2, result);
	}
	

	@Test(expected=ArithmeticException.class)
	public void testDivisionByZero() {
		// Given
		WebServiceCalculator wsCalculator = new WebServiceCalculator();
		
		// When
		wsCalculator.divide(5, 0);
	}

}
