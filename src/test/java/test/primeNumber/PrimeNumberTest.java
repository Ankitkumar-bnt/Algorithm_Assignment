package test.primeNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.primeNumber.Q1PrimeNumber;

public class PrimeNumberTest {
	
	@Test
	public void testPrimeNumbers()
	{
		assertEquals(1, Q1PrimeNumber.isPrime(5));
	}
	
	@Test
	public void testNonPrimeNumber()
	{
		assertEquals(0, Q1PrimeNumber.isPrime(40));
	}
	
	@Test
	public void testForZeroNumber()
	{
		assertEquals(0, Q1PrimeNumber.isPrime(0));
	}
	
	@Test
	public void testForOneNumber()
	{
		assertEquals(0, Q1PrimeNumber.isPrime(1));
	}
	
	@Test
	public void testForTwoNumber()
	{
		assertEquals(1, Q1PrimeNumber.isPrime(2));
	}
	
	@Test
	public void testForNegativeNumber()
	{
		assertEquals(0, Q1PrimeNumber.isPrime(-99));
	}
}
