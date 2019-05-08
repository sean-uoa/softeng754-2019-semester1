package nz.ac.auckland.se754sem2019.mycash;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DollarDivisionTest {

	@Test
	public void testDollarDivision() {
		// Given
		Dollar ten = new Dollar(10);
		
		// When
		Dollar result = ten.dividedBy(2);
		
		// Then
		assertEquals(new Dollar(5), result);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDollarDividedByZero() {
		// Given
		Dollar ten = new Dollar(10);
		
		// When
		ten.dividedBy(0);
	}
	
	@Test(expected = NegativeNumberException.class)
	public void shouldThrowExceptinWhenDividedByMinusTwo() {
		// Given
		Dollar ten = new Dollar(10);
		
		// When
		ten.dividedBy(-2);
	}
	
	@Test(timeout=2000)
	public void testDivisionTimeout() {
		for( ; ; ) {

		}
	}
}
