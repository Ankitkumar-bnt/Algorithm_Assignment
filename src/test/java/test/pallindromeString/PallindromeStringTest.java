package test.pallindromeString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.pallindromeString.CheckPallindromeString;

public class PallindromeStringTest {

    @Test
    void isPallindrome_whenEvenLengthPalindromeString_thenReturnsYes() {
        assertEquals("Yes", CheckPallindromeString.isPallindrome("abba"));
    }

    @Test
    void isPallindrome_whenSingleCharacterString_thenReturnsYes() {
        assertEquals("Yes", CheckPallindromeString.isPallindrome("X"));
    }

    @Test
    void isPallindrome_whenNonPalindromeString_thenReturnsNo() {
        assertEquals("No", CheckPallindromeString.isPallindrome("hello"));
    }

    @Test
    void isPallindrome_whenAnotherNonPalindromeString_thenReturnsNo() {
        assertEquals("No", CheckPallindromeString.isPallindrome("openai"));
    }

    @Test
    void isPallindrome_whenEmptyStringGiven_thenReturnsYes() {
        assertEquals("Yes", CheckPallindromeString.isPallindrome(""));
    }

    @Test
    void isPallindrome_whenSpacesOnlyStringGiven_thenReturnsYes() {
        assertEquals("Yes", CheckPallindromeString.isPallindrome("   "));
    }
    
    @Test
    void isPallindrome_whenNullInput_thenThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> CheckPallindromeString.isPallindrome(null));
    }
}
