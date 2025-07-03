package test.mergeTwoStringAlternate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.mergeTwoStringAlternate.MergeTwoStringAlternate;

public class MergeTwoStringAlternateTest {

    @Test
    void merge_whenTwoValidStrings_thenReturnsAlternatingMergedString() {
        assertEquals("axbyczdfg", MergeTwoStringAlternate.merge("abcdfg", "xyz"));
    }

    @Test
    void merge_whenSecondStringLonger_thenReturnsMergedWithRemainingFirst() {
        assertEquals("xaybzc", MergeTwoStringAlternate.merge("xyz", "abc"));
    }

    @Test
    void merge_whenBothStringsEmpty_thenReturnsInvalidInput() {
        assertEquals("Invalid input", MergeTwoStringAlternate.merge("", ""));
    }

    @Test
    void merge_whenFirstStringEmpty_thenReturnsInvalidInput() {
        assertEquals("Invalid input", MergeTwoStringAlternate.merge("", "abc"));
    }

    @Test
    void merge_whenSecondStringEmpty_thenReturnsInvalidInput() {
        assertEquals("Invalid input", MergeTwoStringAlternate.merge("abc", ""));
    }

    @Test
    void merge_whenStringsOfEqualLength_thenReturnsPerfectMerge() {
        assertEquals("a1b2c3", MergeTwoStringAlternate.merge("abc", "123"));
    }
    
    @Test
    void merge_whenFirstStringIsNull_thenThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> MergeTwoStringAlternate.merge(null, "abc"));
        assertThrows(NullPointerException.class, () -> MergeTwoStringAlternate.merge("abc", null));
    }
}
