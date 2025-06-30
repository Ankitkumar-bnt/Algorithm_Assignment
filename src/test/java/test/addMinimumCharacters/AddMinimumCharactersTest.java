package test.addMinimumCharacters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.addMinimumCharacters.AddMinimumCharacters;

public class AddMinimumCharactersTest {

	@Test
	void addMinimumCharacters_whenStringGiven_thenReturnsRequiredChar()
	{
		assertEquals(2, AddMinimumCharacters.addMinChar("abc"));
	}
	
	@Test
	void addMinimumCharacters_whenGivenStringIsPallindrome_thenReturnsZero()
	{
		assertEquals(0, AddMinimumCharacters.addMinChar("cbaabc"));
	}
	
	@Test
	void addMinimumCharacters_whenGivenStringHavePartialPallindrome_thenReturnsRequiredChar()
	{
		assertEquals(2, AddMinimumCharacters.addMinChar("abang"));
	}
}
