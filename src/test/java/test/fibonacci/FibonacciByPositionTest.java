package test.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fibonacci.FibonacciByPosition;

public class FibonacciByPositionTest {

    @Test
    void series_whenPositionOneGiven_thenReturnsOne() {
        assertEquals(0, FibonacciByPosition.series(1));
    }

    @Test
    void series_whenPositionTwoGiven_thenReturnsOne() {
        assertEquals(1, FibonacciByPosition.series(2));
    }

    @Test
    void series_whenPositionFiveGiven_thenReturnsFive() {
        assertEquals(5, FibonacciByPosition.series(5));
    }

    @Test
    void series_whenPositionTenGiven_thenReturnsFiftyFive() {
        assertEquals(55, FibonacciByPosition.series(10));
    }

    @Test
    void series_whenZeroGiven_thenReturnsZero() {
        assertEquals(0, FibonacciByPosition.series(0));
    }

    @Test
    void series_whenNegativePositionGiven_thenReturnsZero() {
        assertEquals(0, FibonacciByPosition.series(-5));
    }
}
