package test.confussedPappu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.confussedPappu.ConfussedPappu;

public class ConfussedPappuTest {

	@Test
	void checkDifferenceConfussedPappuTest()
	{
		assertEquals(3, ConfussedPappu.findDiff(56));
	}
	
	@Test
	void checkNoDifferenceConfussedPappuTest()
	{
		assertEquals(0, ConfussedPappu.findDiff(59));
	}
	
	@Test
	void checkDifferenceNotConfussedPappuTest()
	{
		assertEquals(0, ConfussedPappu.findDiff(12));
	}
}
