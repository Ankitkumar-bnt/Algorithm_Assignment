package test.maximumProductSubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.maximumProductSubarray.MaximumProductSubarray;

public class MaximumProductSubarrayTest {

	@Test
	void maximumProductSubarray_whenArrayGiven_thenReturnsMaxProduct()
	{
		assertEquals(360, MaximumProductSubarray.maxProduct(new Integer[] {6,-3,-10,0,2}));
	}
	
	@Test
	void maximumProductSubarray_whenArrayWithOneElement_thenReturnsTheElemet()
	{
		assertEquals(6, MaximumProductSubarray.maxProduct(new Integer[] {6}));
	}
	
	@Test
	void maximumProductSubarray_whenArrayWithAllPositive_thenReturnsMaxProduct()
	{
		assertEquals(96, MaximumProductSubarray.maxProduct(new Integer[] {6,8,2,0,1}));
	}
	
	@Test
	void maximumProductSubarray_whenArrayWithAllNegative_thenReturnsMaxProduct()
	{
		assertEquals(210, MaximumProductSubarray.maxProduct(new Integer[] {-5,-1,-7,-3,-2}));
	}
}
