package test.smallestAndSecondSmallest;

import org.junit.jupiter.api.Test;

import com.smallestAndSecondSmallest.SmallestAndSecondSmallest;

public class SmallestAndSecondSmallestTest {

	@Test
	public void minAnd2ndMin_whenDistinctElementsGiven_thenReturnsSmallestAndSecondSmallest() {
	    int[] input = {4, 2, 5, 1, 3};
	    SmallestAndSecondSmallest.minAnd2ndMin(input);
	}

	@Test
	public void minAnd2ndMin_whenArrayHasTwoElements_thenReturnsBothInOrder() {
	    int[] input = {8, 3};
	    SmallestAndSecondSmallest.minAnd2ndMin(input);
	}

	@Test
	public void minAnd2ndMin_whenArrayHasAllSameElements_thenReturnsInvalidPair() {
	    int[] input = {5, 5, 5, 5};
	    SmallestAndSecondSmallest.minAnd2ndMin(input);
	}

	@Test
	public void minAnd2ndMin_whenArrayHasOneElement_thenReturnsMinusOnePair() {
	    int[] input = {7};
	    SmallestAndSecondSmallest.minAnd2ndMin(input);
	}
}
