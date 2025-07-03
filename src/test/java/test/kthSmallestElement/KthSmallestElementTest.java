package test.kthSmallestElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kthSmallestElement.KthSmallestElement;

public class KthSmallestElementTest {

    @Test
    void kthSmallestElement_whenSecondSmallestRequested_thenReturnsSecondSmallest() {
        assertEquals(2, KthSmallestElement.kthSmallest(new Integer[] {1, 2, 3, 4, 5}, 2));
    }

    @Test
    void kthSmallestElement_whenArrayWithDuplicates_thenReturnsCorrectUniqueKthSmallest() {
        assertEquals(3, KthSmallestElement.kthSmallest(new Integer[] {5, 3, 3, 2, 1, 4}, 3));
    }

    @Test
    void kthSmallestElement_whenIndexGreaterThanUniqueSize_thenReturnsNegativeOne() {
        assertEquals(-1, KthSmallestElement.kthSmallest(new Integer[] {1, 2, 3, 4, 5}, 7));
    }

    @Test
    void kthSmallestElement_whenIndexIsZero_thenReturnsNegativeOne() {
        assertEquals(-1, KthSmallestElement.kthSmallest(new Integer[] {1, 2, 3}, 0));
    }

    @Test
    void kthSmallestElement_whenArrayWithSingleElementAndIndexOne_thenReturnsSameElement() {
        assertEquals(42, KthSmallestElement.kthSmallest(new Integer[] {42}, 1));
    }

    @Test
    void kthSmallestElement_whenArrayWithAllSameElements_thenReturnsThatElement() {
        assertEquals(7, KthSmallestElement.kthSmallest(new Integer[] {7, 7, 7, 7}, 1));
    }

    @Test
    void kthSmallestElement_whenArrayIsEmpty_thenReturnsNegativeOne() {
        assertEquals(-1, KthSmallestElement.kthSmallest(new Integer[] {}, 1));
    }
}
