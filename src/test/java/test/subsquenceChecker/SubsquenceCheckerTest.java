package test.subsquenceChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.subsquenceChecker.SubsquenceChecker;

public class SubsquenceCheckerTest {

	@Test
	void subsquenceCheckerTest()
	{
		assertEquals(1, SubsquenceChecker.isSubSequence("abc", "dabsqck"));
	}
	
	@Test
	void subsquenceCheckerForFailTest()
	{
		assertEquals(0, SubsquenceChecker.isSubSequence("abcu", "dabsqck"));
	}
	
	@Test
	void subsquenceCheckerForNullTest()
	{
		assertEquals(0, SubsquenceChecker.isSubSequence("", ""));
	}
	
	@Test
	void isSubSequence_whenSubIsLongerThanMain_returnsZero()
	{
		assertEquals(0, SubsquenceChecker.isSubSequence("abcde", "abc"));
	}
	
}
