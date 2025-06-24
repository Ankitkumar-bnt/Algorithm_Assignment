package test.pallindromeString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.pallindromeString.CheckPallindromeString;

public class PallindromeStringTest {

	@Test
	void stringPallindromeTest()
	{
		assertEquals("Yes", CheckPallindromeString.isPallindrome("abcdcba"));
	}
	
	@Test
	void singleStringPallindromeTest()
	{
		assertEquals("Yes", CheckPallindromeString.isPallindrome("A"));
	}
	
	@Test
	void stringNotPallindromeTest()
	{
		assertEquals("No", CheckPallindromeString.isPallindrome("dfbjd"));
	}
}
