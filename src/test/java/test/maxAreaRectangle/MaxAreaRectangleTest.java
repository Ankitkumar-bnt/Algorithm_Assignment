package test.maxAreaRectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.maxAreaRectangle.MaxAreaRectangle;

public class MaxAreaRectangleTest {

	@Test
	public void calculateArea_whenMultipleRectanglesGiven_thenReturnsMaximumArea() {
	    List<List<Integer>> input = new ArrayList<>();
	    input.add(Arrays.asList(4, 5));
	    input.add(Arrays.asList(3, 6));
	    input.add(Arrays.asList(7, 2));

	    int result = MaxAreaRectangle.calculate_Area(input);
	    assertEquals(20, result);
	}

	@Test
	public void calculateArea_whenSingleRectangleGiven_thenReturnsItsArea() {
	    List<List<Integer>> input = new ArrayList<>();
	    input.add(Arrays.asList(5, 8));
	    int result = MaxAreaRectangle.calculate_Area(input);
	    assertEquals(40, result);
	}

	@Test
	public void calculateArea_whenAllRectanglesHaveSameArea_thenReturnsThatArea() {
	    List<List<Integer>> input = new ArrayList<>();
	    input.add(Arrays.asList(4, 5));
	    input.add(Arrays.asList(5, 4));
	    input.add(Arrays.asList(2, 10));
	    int result = MaxAreaRectangle.calculate_Area(input);
	    assertEquals(20, result);
	}

	@Test
	public void calculateArea_whenEmptyListGiven_thenReturnsZero() {
	    List<List<Integer>> input = new ArrayList<>();
	    int result = MaxAreaRectangle.calculate_Area(input);
	    assertEquals(0, result);
	}

}
