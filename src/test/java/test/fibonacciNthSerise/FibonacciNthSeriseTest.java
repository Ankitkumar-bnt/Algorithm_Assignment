package test.fibonacciNthSerise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.fibonacci.FibonacciByPosition;
import com.fibonacciNthSerise.FibonacciNthSerise;

public class FibonacciNthSeriseTest {

	@Test
	void checkFifthThSeries()
	{
		List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5);
		assertEquals(expected, FibonacciNthSerise.seriesList(5));
	}
	
	@Test
	void checkFirstSeries()
	{
		List<Integer> expected = Arrays.asList(1);
		assertEquals(expected, FibonacciNthSerise.seriesList(1));
	}
	
	@Test
	void checkTenThSeries()
	{
		List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
		assertEquals(expected, FibonacciNthSerise.seriesList(10));
	}
	
}
