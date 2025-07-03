package test.uniqueNumberOfOccurrences;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.uniqueNumberOfOccurrences.UniqueNumberOfOccurrences;

public class UniqueNumberOfOccurrencesTest {

    @Test
    void isFrequencyUnique_whenFrequenciesAreDistinct_thenReturnsTrue() {
        assertEquals(true, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{1, 2, 2, 3, 3, 3}));
    }

    @Test
    void isFrequencyUnique_whenAllElementsHaveSameFrequencyOfOne_thenReturnsTrue() {
        assertEquals(false, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{9, 8, 7, 6}));
    }

    @Test
    void isFrequencyUnique_whenTwoElementsShareSameFrequency_thenReturnsFalse() {
        assertEquals(false, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{4, 4, 3, 3}));
    }

    @Test
    void isFrequencyUnique_whenAllElementsHaveSameFrequency_thenReturnsFalse() {
        assertEquals(false, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{1, 1, 2, 2, 3, 3}));
    }

    @Test
    void isFrequencyUnique_whenSingleElementArray_thenReturnsTrue() {
        assertEquals(true, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{99}));
    }

    @Test
    void isFrequencyUnique_whenEmptyArray_thenReturnsTrue() {
        assertEquals(true, UniqueNumberOfOccurrences.isFrequencyUnique(new int[]{}));
    }
}
