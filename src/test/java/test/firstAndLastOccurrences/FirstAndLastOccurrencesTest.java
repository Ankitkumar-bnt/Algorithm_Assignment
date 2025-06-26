package test.firstAndLastOccurrences;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.firstAndLastOccurrences.FirstAndLastOccurrences;

public class FirstAndLastOccurrencesTest {

	@Test
	void firstAndLast_whenValuePresentMultipleTimes_returnsFirstAndLastIndices()
	{
		 int[] arr = {1, 2, 2, 4, 7, 2, 5, 2, 6};
		 int[] result = FirstAndLastOccurrences.firstAndLast(arr, 2);

		  assertArrayEquals(new int[]{1, 7}, result);
	}
	
	@Test
	void firstAndLast_whenValuePresentOnce_returnsSameIndices()
	{
		 int[] arr = {1, 2, 2, 4, 7, 2, 5, 2, 6};
		 int[] result = FirstAndLastOccurrences.firstAndLast(arr, 7);

		  assertArrayEquals(new int[]{4, 4}, result);
	}
	
	@Test
	void firstAndLast_whenValueNotPresent_returnsNegativeOne()
	{
		 int[] arr = {1, 2, 2, 4, 7, 2, 5, 2, 6};
		 int[] result = FirstAndLastOccurrences.firstAndLast(arr, 10);

		  assertArrayEquals(new int[]{-1}, result);
	}
}
