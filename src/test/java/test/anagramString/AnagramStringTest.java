package test.anagramString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.anagramString.AnagramString;

public class AnagramStringTest {

    @Test
    void anagramString_whenTwoStringsHavePartialMatch_thenReturnsCorrectDeletions() {
        assertEquals(2, AnagramString.remAnagram("abcde", "abc"));
    }

    @Test
    void anagramString_whenTwoStringsAreSame_thenReturnsZero() {
        assertEquals(0, AnagramString.remAnagram("abcde", "abcde"));
    }

    @Test
    void anagramString_whenTwoStringsAreCompletelyDifferent_thenReturnsTotalLength() {
        assertEquals(6, AnagramString.remAnagram("efg", "abc"));
    }

    @Test
    void anagramString_whenMixedCase_thenIgnoreCaseAndReturnCorrectResult() {
        assertEquals(0, AnagramString.remAnagram("AAbbCC", "aabbcc"));
    }

    @Test
    void anagramString_whenOneStringIsEmpty_thenReturnLengthOfOther() {
        assertEquals(5, AnagramString.remAnagram("", "abcde"));
    }

    @Test
    void anagramString_whenBothStringsAreEmpty_thenReturnZero() {
        assertEquals(0, AnagramString.remAnagram("", ""));
    }

    @Test
    void anagramString_whenStringsContainSymbols_thenCountThemAsNormalCharacters() {
        assertEquals(3, AnagramString.remAnagram("@bc!", "abc"));
    }

    @Test
    void anagramString_whenDigitsIncluded_thenTreatThemAsCharacters() {
        assertEquals(3, AnagramString.remAnagram("123abc", "abc"));
    }

    @Test
    void anagramString_whenOnlyWhitespace_thenReturnCorrectCount() {
        assertEquals(1, AnagramString.remAnagram(" ", ""));
    }

    @Test
    void anagramString_whenNullInput_thenThrowsException() {
        assertThrows(NullPointerException.class, () -> AnagramString.remAnagram(null, "abc"));
        assertThrows(NullPointerException.class, () -> AnagramString.remAnagram("abc", null));
    }
}
