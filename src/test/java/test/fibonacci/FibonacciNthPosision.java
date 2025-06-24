package test.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fibonacci.FibonacciByPosition;

public class FibonacciNthPosision {

	@Test
	void checkFifthThPosition()
	{
		assertEquals(5, FibonacciByPosition.series(5));
	}
	
	@Test
	void checkFirstPosition()
	{
		assertEquals(0, FibonacciByPosition.series(1));
	}
	
	@Test
	void checkTenThPosition()
	{
		assertEquals(55, FibonacciByPosition.series(10));
	}
}
