package test.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.factorial.FindFactorial;

public class FactorialTest {

    @Test
    void factorial_whenPositiveNumberGiven_thenReturnsFactorial() {
        assertEquals(120, FindFactorial.factorial(5));
    }

    @Test
    void factorial_whenZeroGiven_thenReturnsOne() {
        assertEquals(1, FindFactorial.factorial(0));
    }

    @Test
    void factorial_whenNegativeNumberGiven_thenReturnsZero() {
        assertEquals(0, FindFactorial.factorial(-5));
    }

    @Test
    void factorial_whenOneGiven_thenReturnsOne() {
        assertEquals(1, FindFactorial.factorial(1));
    }

    @Test
    void factorial_whenLargeNumberGiven_thenReturnsCorrectFactorial() {
        assertEquals(3628800, FindFactorial.factorial(10));
    }

    @Test
    void factorial_whenTwoGiven_thenReturnsTwo() {
        assertEquals(2, FindFactorial.factorial(2));
    }

    @Test
    void factorial_whenThreeGiven_thenReturnsSix() {
        assertEquals(6, FindFactorial.factorial(3));
    }
}
