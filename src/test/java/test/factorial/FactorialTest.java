package test.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.factorial.FindFactorial;

public class FactorialTest {

	@Test
	void checkFactorialTest()
	{
		assertEquals(120, FindFactorial.factorial(5));
	}
	
	@Test
	void checkFactorialForZeroTest()
	{
		assertEquals(1, FindFactorial.factorial(0));
	}
	
	@Test
	void checkFactorialForNegativeTest()
	{
		assertEquals(0, FindFactorial.factorial(-5));
	}
	
}
