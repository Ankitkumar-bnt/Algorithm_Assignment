package test.uniqueNumberOfOccurrences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uniqueNumberOfOccurrences.UniqueNumberOfOccurrences;

public class UniqueNumberOfOccurrencesTest {

	@Test
	void inUniqueNumberOfOccurrences_whenUniqueFreqency_thenRetuensTrue()
	{
		assertEquals(true, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{5,1,2,1,2,8,2,8,8,8}));
	}
	
	@Test
	void inUniqueNumberOfOccurrences_whenNotUniqueFreqency_thenRetuensFalse()
	{
		assertEquals(false, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{5,5,1,2,1,2,8,2,8,8,8}));
	}
	
	@Test
	void inUniqueNumberOfOccurrences_whenOneFreqency_thenRetuensTrue()
	{
		assertEquals(true, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{5}));
	}
}
