package test.thirdLargestElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.thirdLargestElement.ThirdLargestElement;

public class ThirdLargestElementTest {

	@Test
	public void thirdLargest_whenArrayHasDistinctElements_thenReturnsThirdLargest() {
	    Integer[] input = {5, 2, 8, 1, 9};
	    int result = ThirdLargestElement.thirdLargest(input);
	    assertEquals(5, result);
	}

	@Test
	public void thirdLargest_whenArrayHasExactlyThreeElements_thenReturnsSmallest() {
	    Integer[] input = {7, 3, 5};
	    int result = ThirdLargestElement.thirdLargest(input);
	    assertEquals(3, result);
	}

	@Test
	public void thirdLargest_whenArrayHasDuplicates_thenIgnoresDuplicatesAndReturnsThirdLargest() {
	    Integer[] input = {4, 4, 6, 2, 8, 6};
	    int result = ThirdLargestElement.thirdLargest(input);
	    assertEquals(4, result);
	}

	@Test
	public void thirdLargest_whenArrayHasNegativeAndPositiveNumbers_thenReturnsCorrectThirdLargest() {
	    Integer[] input = {-5, -2, 0, 3, 7, 1};
	    int result = ThirdLargestElement.thirdLargest(input);
	    assertEquals(1, result);
	}
}
