package test.smallestAndSecondSmallest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import com.smallestAndSecondSmallest.SmallestAndSecondSmallest;

public class SmallestAndSecondSmallestTest {

    @Test
    public void minAnd2ndMin_whenDistinctElementsGiven_thenReturnsSmallestAndSecondSmallest() {
        int[] input = {4, 2, 5, 1, 3};
        int[] expected = {1, 2};
        assertArrayEquals(expected, SmallestAndSecondSmallest.minAnd2ndMin(input));
    }

    @Test
    public void minAnd2ndMin_whenArrayHasTwoElements_thenReturnsBothInOrder() {
        int[] input = {8, 3};
        int[] expected = {3, 8};
        assertArrayEquals(expected, SmallestAndSecondSmallest.minAnd2ndMin(input));
    }

    @Test
    public void minAnd2ndMin_whenArrayHasAllSameElements_thenReturnsInvalidPair() {
        int[] input = {5, 5, 5, 5};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, SmallestAndSecondSmallest.minAnd2ndMin(input));
    }

    @Test
    public void minAnd2ndMin_whenArrayHasOneElement_thenReturnsMinusOnePair() {
        int[] input = {7};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, SmallestAndSecondSmallest.minAnd2ndMin(input));
    }

    @Test
    public void minAnd2ndMin_whenArrayHasNegativeNumbers_thenReturnsCorrectPair() {
        int[] input = {-8, -2, -6, -1, -3};
        int[] expected = {-8, -6};
        assertArrayEquals(expected, SmallestAndSecondSmallest.minAnd2ndMin(input));
    }
}
