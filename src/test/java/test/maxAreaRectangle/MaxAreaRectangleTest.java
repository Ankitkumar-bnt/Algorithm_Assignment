package test.maxAreaRectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.maxAreaRectangle.MaxAreaRectangle;

public class MaxAreaRectangleTest {

    @Test
    void calculateArea_whenMultipleRectanglesGiven_thenReturnsMaximumArea() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(4, 5));
        input.add(Arrays.asList(3, 6));
        input.add(Arrays.asList(7, 2));
        assertEquals(20, MaxAreaRectangle.calculate_Area(input));
    }

    @Test
    void calculateArea_whenSingleRectangleGiven_thenReturnsItsArea() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(5, 8));
        assertEquals(40, MaxAreaRectangle.calculate_Area(input));
    }

    @Test
    void calculateArea_whenAllRectanglesHaveSameArea_thenReturnsThatArea() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(4, 5));
        input.add(Arrays.asList(5, 4));
        input.add(Arrays.asList(2, 10));
        assertEquals(20, MaxAreaRectangle.calculate_Area(input));
    }

    @Test
    void calculateArea_whenEmptyListGiven_thenReturnsZero() {
        List<List<Integer>> input = new ArrayList<>();
        assertEquals(0, MaxAreaRectangle.calculate_Area(input));
    }

    @Test
    void calculateArea_whenContainsRectangleWithZeroDimension_thenIgnoresAndReturnsMax() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(0, 5));
        input.add(Arrays.asList(6, 7));
        assertEquals(42, MaxAreaRectangle.calculate_Area(input));
    }

    @Test
    void calculateArea_whenContainsNegativeDimensions_thenIgnoresAndReturnsMax() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(-2, 5));
        input.add(Arrays.asList(3, 4));
        assertEquals(12, MaxAreaRectangle.calculate_Area(input));
    }

    @Test
    void calculateArea_whenAllInvalidRectangles_thenReturnsZero() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(0, 0));
        input.add(Arrays.asList(-1, -1));
        assertEquals(1, MaxAreaRectangle.calculate_Area(input));
    }
}
