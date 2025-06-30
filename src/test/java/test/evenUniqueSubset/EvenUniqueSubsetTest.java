package test.evenUniqueSubset;

import org.junit.jupiter.api.Test;

import com.evenUniqueSubset.EvenUniqueSubset;

public class EvenUniqueSubsetTest {

	@Test
	public void getSubset_whenAllEvenUniqueElementsGiven_thenReturnsAllValidSubsets() {
	    int[] input = {2, 4, 6};
	    EvenUniqueSubset.getSubset(input, input.length);
	}

	@Test
	public void getSubset_whenMixedEvenAndOddElementsGiven_thenReturnsOnlyEvenUniqueSubsets() {
	    int[] input = {1, 2, 4, 3};
	    EvenUniqueSubset.getSubset(input, input.length);
	}

	@Test
	public void getSubset_whenArrayHasDuplicateEvenElements_thenSkipsDuplicateSubsets() {
	    int[] input = {2, 2, 4};
	    EvenUniqueSubset.getSubset(input, input.length);
	}
}
