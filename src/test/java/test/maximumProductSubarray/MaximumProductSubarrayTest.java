package test.maximumProductSubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.maximumProductSubarray.MaximumProductSubarray;

public class MaximumProductSubarrayTest {

    @Test
    void maxProduct_whenArrayWithMixedPositiveAndNegative_thenReturnsMaxProduct() {
        assertEquals(360, MaximumProductSubarray.maxProduct(new Integer[] {6, -3, -10, 0, 2}));
    }

    @Test
    void maxProduct_whenArrayWithAllPositiveNumbers_thenReturnsProductExcludingZerosAndOnes() {
        assertEquals(96, MaximumProductSubarray.maxProduct(new Integer[] {6, 8, 2, 0, 1}));
    }

    @Test
    void maxProduct_whenArrayWithOneElement_thenReturnsThatElement() {
        assertEquals(6, MaximumProductSubarray.maxProduct(new Integer[] {6}));
    }

    @Test
    void maxProduct_whenArrayWithAllNegativeNumbers_thenReturnsMaxProduct() {
        assertEquals(210, MaximumProductSubarray.maxProduct(new Integer[] {-5, -1, -7, -3, -2}));
    }

    @Test
    void maxProduct_whenArrayWithZerosAndOnesOnly_thenReturnsOne() {
        assertEquals(1, MaximumProductSubarray.maxProduct(new Integer[] {0, 1, 0, 1}));
    }

    @Test
    void maxProduct_whenArrayWithZeroesOnly_thenReturnsOne() {
        assertEquals(1, MaximumProductSubarray.maxProduct(new Integer[] {0, 0, 0, 0}));
    }

    @Test
    void maxProduct_whenArrayHasSingleNegativeElement_thenReturnsThatElement() {
        assertEquals(-5, MaximumProductSubarray.maxProduct(new Integer[] {-5}));
    }
}
