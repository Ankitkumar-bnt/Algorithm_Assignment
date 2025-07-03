package test.convertArrayToZigZag;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import com.convertArrayToZigZag.ConvertArrayToZigZag;

public class ConvertArrayToZigZagTest {

    @Test
    void convertArrayToZigZag_whenArrayGiven_thenReturnZigZagArray() {
        int[] input = {4, 3, 7, 8, 6, 2, 1};
        int[] expected = {3, 7, 4, 8, 2, 6, 1};
        ConvertArrayToZigZag.zigZag(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void convertArrayToZigZag_whenSmallArrayGiven_thenReturnsZigZagArray() {
        int[] input = {1, 4, 3, 2};
        int[] expected = {1, 4, 2, 3};
        ConvertArrayToZigZag.zigZag(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void convertArrayToZigZag_whenDescendingAndAscendingMixGiven_thenReturnsZigZagArray() {
        int[] input = {9, 6, 8, 3, 7};
        int[] expected = {6, 9, 3, 8, 7};
        ConvertArrayToZigZag.zigZag(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void convertArrayToZigZag_whenEmptyArrayGiven_thenReturnsEmptyArray() {
        int[] input = {};
        int[] expected = {};
        ConvertArrayToZigZag.zigZag(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void convertArrayToZigZag_whenSingleElementArrayGiven_thenReturnsSameArray() {
        int[] input = {5};
        int[] expected = {5};
        ConvertArrayToZigZag.zigZag(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void convertArrayToZigZag_whenAlreadyZigZagArrayGiven_thenReturnsSameArray() {
        int[] input = {1, 3, 2, 4, 3};
        int[] expected = {1, 3, 2, 4, 3};
        ConvertArrayToZigZag.zigZag(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void convertArrayToZigZag_whenAllSameElementsGiven_thenReturnsSameArray() {
        int[] input = {2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2};
        ConvertArrayToZigZag.zigZag(input);
        assertArrayEquals(expected, input);
    }
}
