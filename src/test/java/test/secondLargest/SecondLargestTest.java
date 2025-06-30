package test.secondLargest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.secondLargest.SecondLargest;

public class SecondLargestTest {

	@Test
	void secondLargest_whenHaveElement_thenReturnsSecondMax()
	{
		assertEquals(2, SecondLargest.print2largest(new int[] {-1, 5, -9, 2, 1}));
	}
	
	@Test
	void secondLargest_whenHaveLessThanTwoElement_thenReturnsNegativeOne()
	{
		assertEquals(-1, SecondLargest.print2largest(new int[] {-1}));
	}
	
	@Test
	void secondLargest_whenHaveAllPositiveElement_thenReturnsSecondMax()
	{
		assertEquals(8, SecondLargest.print2largest(new int[] {8, 5, 10, 2, 1}));
	}
	
	@Test
	void secondLargest_whenHaveAllNegativeElement_thenReturnsSecondMax()
	{
		assertEquals(-2, SecondLargest.print2largest(new int[] {-1, -5, -9, -2, -10}));
	}
	
	@Test
	void secondLargest_whenHaveDuplicateElement_thenReturnsSecondMax()
	{
		assertEquals(5, SecondLargest.print2largest(new int[] {11, 5, 5, 2, 11, 3}));
	}
}
