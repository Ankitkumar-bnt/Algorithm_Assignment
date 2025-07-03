package test.countPairsWithGivenSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.countPairsWithGivenSum.CountPairsWithGivenSum;

public class CountPairsWithGivenSumTest {

    @Test
    void countPairsWithGivenSum_whenArrayAndTargetGiven_thenReturnsCount() {
        assertEquals(2, CountPairsWithGivenSum.getPairsCount(new int[] {1, 5, 7, 1}, 6));
    }

    @Test
    void countPairsWithGivenSum_whenArrayGivenTargetNotMatched_thenReturnsNegativeOne() {
        assertEquals(-1, CountPairsWithGivenSum.getPairsCount(new int[] {1, 5, 7, 1}, 10));
    }

    @Test
    void countPairsWithGivenSum_whenArrayElementSameAndTargetGiven_thenReturnsCount() {
        assertEquals(6, CountPairsWithGivenSum.getPairsCount(new int[] {1, 1, 1, 1}, 2));
    }

    @Test
    void countPairsWithGivenSum_whenEmptyArrayGiven_thenReturnsNegativeOne() {
        assertEquals(-1, CountPairsWithGivenSum.getPairsCount(new int[] {}, 5));
    }

    @Test
    void countPairsWithGivenSum_whenSingleElementArrayGiven_thenReturnsNegativeOne() {
        assertEquals(-1, CountPairsWithGivenSum.getPairsCount(new int[] {4}, 4));
    }

    @Test
    void countPairsWithGivenSum_whenNegativeNumbersGiven_thenReturnsCount() {
        assertEquals(1, CountPairsWithGivenSum.getPairsCount(new int[] {-1, -5, -3, 8}, -4));
    }

    @Test
    void countPairsWithGivenSum_whenAllZeroesAndZeroTargetGiven_thenReturnsCount() {
        assertEquals(6, CountPairsWithGivenSum.getPairsCount(new int[] {0, 0, 0, 0}, 0));
    }
}
