package test.fibonacciNthSerise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fibonacciNthSerise.FibonacciNthSerise;

public class FibonacciNthSeriseTest {

    @Test
    void seriesList_whenLimitFiveGiven_thenReturnsFirstFiveElements() {
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5);
        assertEquals(expected, FibonacciNthSerise.seriesList(5));
    }

    @Test
    void seriesList_whenLimitOneGiven_thenReturnsSingleElement() {
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, FibonacciNthSerise.seriesList(1));
    }

    @Test
    void seriesList_whenLimitTenGiven_thenReturnsFirstTenElements() {
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        assertEquals(expected, FibonacciNthSerise.seriesList(10));
    }

    @Test
    void seriesList_whenLimitZeroGiven_thenReturnsOne() {
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, FibonacciNthSerise.seriesList(0));
    }

    @Test
    void seriesList_whenLimitTwoGiven_thenReturnsTwoElements() {
        List<Integer> expected = Arrays.asList(1, 1);
        assertEquals(expected, FibonacciNthSerise.seriesList(2));
    }

    @Test
    void seriesList_whenLimitThreeGiven_thenReturnsThreeElements() {
        List<Integer> expected = Arrays.asList(1, 1, 2);
        assertEquals(expected, FibonacciNthSerise.seriesList(3));
    }

    @Test
    void seriesList_whenLargeLimitGiven_thenReturnsCorrectSize() {
        int limit = 20;
        List<Integer> result = FibonacciNthSerise.seriesList(limit);
        assertEquals(limit, result.size());
    }
}
