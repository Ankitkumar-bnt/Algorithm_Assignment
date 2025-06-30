package test.countPairsWithGivenSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.countPairsWithGivenSum.CountPairsWithGivenSum;

public class CountPairsWithGivenSumTest {

	@Test
	void countPairsWithGivenSum_whenArrayAndTargetGiven_thenReturnsCount()
	{
		assertEquals(2, CountPairsWithGivenSum.getPairsCount(new int[] {1, 5, 7, 1}, 6));
	}
	
	@Test
	void countPairsWithGivenSum_whenArrayGivenTargetNotMatched_thenReturnsNegativeOne()
	{
		assertEquals(-1, CountPairsWithGivenSum.getPairsCount(new int[] {1, 5, 7, 1}, 10));
	}
	
	@Test
	void countPairsWithGivenSum_whenArrayElementSameAndTargetGiven_thenReturnsCOunt()
	{
		assertEquals(6, CountPairsWithGivenSum.getPairsCount(new int[] {1, 1, 1, 1}, 2));
	}
}
