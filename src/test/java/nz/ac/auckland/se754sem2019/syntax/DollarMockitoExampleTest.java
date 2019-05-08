package nz.ac.auckland.se754sem2019.syntax;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import nz.ac.auckland.se754sem2019.mycash.Dollar;

public class DollarMockitoExampleTest {

	@Test
	public void shouldReturnEmptyValueWhenInvokeAUnmodifiedMethodOfAMockObject() {
		
		// Given
		Dollar mockedFive = Mockito.mock(Dollar.class);
		
		// When
		Dollar result = mockedFive.times(2);
		
		// Then
		assertNull(result);
	}
}
