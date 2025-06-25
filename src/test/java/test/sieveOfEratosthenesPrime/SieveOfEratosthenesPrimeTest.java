package test.sieveOfEratosthenesPrime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.sieveOfEratosthenesPrime.SieveOfEratosthenesPrime;

public class SieveOfEratosthenesPrimeTest {

	@Test
	public void testPrimesUpTo10() {
		boolean[] sieve = SieveOfEratosthenesPrime.sieveOfEratosthenes(10);
		List<Integer> actualPrimes = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			if (sieve[i]) {
				actualPrimes.add(i);
			}
		}

		List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7);
		assertEquals(expectedPrimes, actualPrimes);
	}

	@Test
	public void testPrimesUpTo2() {
		boolean[] sieve = SieveOfEratosthenesPrime.sieveOfEratosthenes(2);
		List<Integer> actualPrimes = new ArrayList<>();

		for (int i = 0; i <= 2; i++) {
			if (sieve[i]) {
				actualPrimes.add(i);
			}
		}

		List<Integer> expectedPrimes = Arrays.asList(2);
		assertEquals(expectedPrimes, actualPrimes);
	}
	
	@Test
	public void testPrimesUpTo5() {
	    boolean[] sieve = SieveOfEratosthenesPrime.sieveOfEratosthenes(5);
	    List<Integer> actualPrimes = new ArrayList<>();

	    for (int i = 0; i <= 5; i++) {
	        if (sieve[i]) {
	            actualPrimes.add(i);
	        }
	    }

	    List<Integer> expectedPrimes = Arrays.asList(2, 3, 5);
	    assertEquals(expectedPrimes, actualPrimes);
	}


}
