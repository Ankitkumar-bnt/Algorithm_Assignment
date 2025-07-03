package test.immdiateSmallerElement;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.immdiateSmallerElement.ImmdiateSmallerElement;

public class ImmdiateSmallerElementTest {

    @Test
    void immediateSmaller_whenAllDescendingArrayGiven_thenReturnsAllNextElements() {
        int[] input = {9, 7, 5, 3};
        int[] expected = {7, 5, 3, -1};
        assertArrayEquals(expected, ImmdiateSmallerElement.immediateSmaller(input));
    }

    @Test
    void immediateSmaller_whenAllAscendingArrayGiven_thenReturnsAllMinusOne() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {-1, -1, -1, -1};
        assertArrayEquals(expected, ImmdiateSmallerElement.immediateSmaller(input));
    }

    @Test
    void immediateSmaller_whenMixedElementsGiven_thenReturnsCorrectNextSmallerOrMinusOne() {
        int[] input = {4, 2, 5, 1, 3};
        int[] expected = {2, -1, 1, -1, -1};
        assertArrayEquals(expected, ImmdiateSmallerElement.immediateSmaller(input));
    }

    @Test
    void immediateSmaller_whenSingleElementArrayGiven_thenReturnsMinusOne() {
        int[] input = {5};
        int[] expected = {-1};
        assertArrayEquals(expected, ImmdiateSmallerElement.immediateSmaller(input));
    }

    @Test
    void immediateSmaller_whenArrayWithDuplicatesGiven_thenHandlesDuplicatesCorrectly() {
        int[] input = {5, 5, 3, 3};
        int[] expected = {-1, 3, -1, -1};
        assertArrayEquals(expected, ImmdiateSmallerElement.immediateSmaller(input));
    }

    @Test
    void immediateSmaller_whenArrayWithNegativeNumbersGiven_thenProcessesCorrectly() {
        int[] input = {-1, -3, 0, -2};
        int[] expected = {-3, -1, -2, -1};
        assertArrayEquals(expected, ImmdiateSmallerElement.immediateSmaller(input));
    }

    @Test
    void immediateSmaller_whenEmptyArrayGiven_thenReturnsEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, ImmdiateSmallerElement.immediateSmaller(input));
    }
}
