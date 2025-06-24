package test.pallindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.pallindromeDigit.PallindromeDigit;

public class PallindromeTest {

	@Test
	void pallindromTest()
	{
		assertEquals("Yes", PallindromeDigit.isPallindrome(123321));
	}
	
	@Test
	void oneNumberPallindromTest()
	{
		assertEquals("Yes", PallindromeDigit.isPallindrome(8));
	}
	
	@Test
	void nonPallindromTest()
	{
		assertEquals("No", PallindromeDigit.isPallindrome(57895));
	}
}
