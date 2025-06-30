package test.anagramString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.anagramString.AnagramString;

public class AnagramStringTest {
	
	@Test
	void anagramString_whenTwoStringGiven_thenReturnsNeedToDeleteCharNum()
	{
		assertEquals(2, AnagramString.remAnagram("abcde", "abc"));
	}
	
	@Test
	void anagramString_whenTwoStringAreSame_thenReturnsZero()
	{
		assertEquals(0, AnagramString.remAnagram("abcde", "abcde"));
	}
	
	@Test
	void anagramString_whenTwoStringNotSame_thenReturnsNeedToDeleteCharNum()
	{
		assertEquals(6, AnagramString.remAnagram("efg", "abc"));
	}
}
