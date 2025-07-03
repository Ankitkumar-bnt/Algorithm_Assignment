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
	
	@Test
	void subsquenceChecker_whenFirstIsNull_returnsZero()
	{
	    assertEquals(0, SubsquenceChecker.isSubSequence(null, "abc"));
	}

	@Test
	void subsquenceChecker_whenSecondIsNull_returnsZero()
	{
	    assertEquals(0, SubsquenceChecker.isSubSequence("abc", null));
	}

	
}
