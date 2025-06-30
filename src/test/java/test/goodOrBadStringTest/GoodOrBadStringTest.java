package test.goodOrBadStringTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.goodOrBadString.GoodOrBadString;

public class GoodOrBadStringTest {

	@Test
	void isGoodOrBadString_whenMoreThanFiveVowels_thenReturnsZero()
	{
		assertEquals(0, GoodOrBadString.isGoodorBad("bntaieo??soft"));
	}
	
	@Test
	void isGoodOrBadString_whenMoreThanThreeConsonents_thenReturnsZero()
	{
		assertEquals(0, GoodOrBadString.isGoodorBad("bnt??soft"));
	}
	
	@Test
	void isGoodOrBadString_whenNotMoreThanFiveVowels_thenReturnsZero()
	{
		assertEquals(1, GoodOrBadString.isGoodorBad("bntaieto??soft"));
	}
	
	@Test
	void isGoodOrBadString_whenNotMoreThanThreeConsonents_thenReturnsZero()
	{
		assertEquals(1, GoodOrBadString.isGoodorBad("bnti??soft"));
	}
}
