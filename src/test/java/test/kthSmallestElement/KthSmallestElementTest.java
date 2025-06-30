package test.kthSmallestElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kthSmallestElement.KthSmallestElement;

public class KthSmallestElementTest {

	@Test
	void kthSmallestElement_whenGivenIndex_thenReturnsKthSmallest()
	{
		assertEquals(2, KthSmallestElement.kthSmallest(new Integer[] {1, 2, 3, 4, 5}, 2));
	}
	
	@Test
	void kthSmallestElement_whenIndexGreaterThanArraySize_thenReturnsNegativeOne()
	{
		assertEquals(-1, KthSmallestElement.kthSmallest(new Integer[] {1, 2, 3, 4, 5}, 7));
	}
}
