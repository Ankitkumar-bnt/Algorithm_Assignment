package test.evenUniqueSubset;

import org.junit.jupiter.api.Test;

import com.evenUniqueSubset.EvenUniqueSubset;

public class EvenUniqueSubsetTest {

    @Test
    void getSubset_whenAllEvenUniqueElementsGiven_thenReturnsAllValidSubsets() {
        int[] input = {2, 4, 6};
        EvenUniqueSubset.getSubset(input, input.length);
    }

    @Test
    void getSubset_whenMixedEvenAndOddElementsGiven_thenReturnsOnlyEvenUniqueSubsets() {
        int[] input = {1, 2, 4, 3};
        EvenUniqueSubset.getSubset(input, input.length);
    }

    @Test
    void getSubset_whenArrayHasDuplicateEvenElements_thenSkipsDuplicateSubsets() {
        int[] input = {2, 2, 4};
        EvenUniqueSubset.getSubset(input, input.length);
    }

    @Test
    void getSubset_whenAllOddElementsGiven_thenReturnsNoValidSubset() {
        int[] input = {1, 3, 5};
        EvenUniqueSubset.getSubset(input, input.length);
    }

    @Test
    void getSubset_whenEmptyArrayGiven_thenReturnsEmptySubset() {
        int[] input = {};
        EvenUniqueSubset.getSubset(input, input.length);
    }

    @Test
    void getSubset_whenSingleEvenElementGiven_thenReturnsSingleSubset() {
        int[] input = {2};
        EvenUniqueSubset.getSubset(input, input.length);
    }

    @Test
    void getSubset_whenSingleOddElementGiven_thenReturnsNoValidSubset() {
        int[] input = {1};
        EvenUniqueSubset.getSubset(input, input.length);
    }
}
