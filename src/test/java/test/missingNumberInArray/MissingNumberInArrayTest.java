package test.missingNumberInArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.missingNumberInArray.MissingNumberInArray;

public class MissingNumberInArrayTest {

	@Test
	void missingNumber_whenGivenIncompleteArray_thenReturnsMissingNumber()
	{
		assertEquals(2, MissingNumberInArray.missingNumber(new Integer[] {5,1,3,4}, 5));
	}
}
