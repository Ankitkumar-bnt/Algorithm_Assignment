package test.mergeTwoStringAlternate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mergeTwoStringAlternate.MergeTwoStringAlternate;

public class MergeTwoStringAlternateTest {

	@Test
	void mergeTwoStringAlternate_whenGivenTwoStrings_thenReturnsMergedAlternatingString()
	{
		assertEquals("axbyczdfg", MergeTwoStringAlternate.merge("abcdfg", "xyz"));
	}
	
	@Test
	void mergeTwoStringAlternate_whenGivenEmptyTwoStrings_thenReturnsInvalidInput()
	{
		assertEquals("Invalid input", MergeTwoStringAlternate.merge("", ""));
	}
}
