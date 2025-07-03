package test.firstAndLastOccurrences;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.firstAndLastOccurrences.FirstAndLastOccurrences;

public class FirstAndLastOccurrencesTest {

    @Test
    void firstAndLast_whenValuePresentMultipleTimes_thenReturnsFirstAndLastIndices() {
        int[] arr = {1, 2, 2, 4, 7, 2, 5, 2, 6};
        int[] result = FirstAndLastOccurrences.firstAndLast(arr, 2);
        assertArrayEquals(new int[]{1, 7}, result);
    }

    @Test
    void firstAndLast_whenValuePresentOnce_thenReturnsSameIndices() {
        int[] arr = {1, 2, 2, 4, 7, 2, 5, 2, 6};
        int[] result = FirstAndLastOccurrences.firstAndLast(arr, 7);
        assertArrayEquals(new int[]{4, 4}, result);
    }

    @Test
    void firstAndLast_whenValueNotPresent_thenReturnsNegativeOne() {
        int[] arr = {1, 2, 2, 4, 7, 2, 5, 2, 6};
        int[] result = FirstAndLastOccurrences.firstAndLast(arr, 10);
        assertArrayEquals(new int[]{-1}, result);
    }

    @Test
    void firstAndLast_whenArrayIsEmpty_thenReturnsNegativeOne() {
        int[] arr = {};
        int[] result = FirstAndLastOccurrences.firstAndLast(arr, 3);
        assertArrayEquals(new int[]{-1}, result);
    }

    @Test
    void firstAndLast_whenAllElementsMatchValue_thenReturnsFullRange() {
        int[] arr = {5, 5, 5, 5, 5};
        int[] result = FirstAndLastOccurrences.firstAndLast(arr, 5);
        assertArrayEquals(new int[]{0, 4}, result);
    }

    @Test
    void firstAndLast_whenValueAtStartAndEnd_thenReturnsCorrectIndices() {
        int[] arr = {3, 1, 2, 4, 3};
        int[] result = FirstAndLastOccurrences.firstAndLast(arr, 3);
        assertArrayEquals(new int[]{0, 4}, result);
    }

    @Test
    void firstAndLast_whenSingleElementArrayMatchesValue_thenReturnsZeroIndices() {
        int[] arr = {7};
        int[] result = FirstAndLastOccurrences.firstAndLast(arr, 7);
        assertArrayEquals(new int[]{0, 0}, result);
    }
}
