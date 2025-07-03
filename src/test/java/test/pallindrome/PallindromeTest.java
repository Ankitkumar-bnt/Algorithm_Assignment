package test.pallindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.pallindromeDigit.PallindromeDigit;

public class PallindromeTest {

    @Test
    void isPallindrome_whenEvenLengthPalindromeNumber_thenReturnsYes() {
        assertEquals("Yes", PallindromeDigit.isPallindrome(123321));
    }

    @Test
    void isPallindrome_whenSingleDigitNumber_thenReturnsYes() {
        assertEquals("Yes", PallindromeDigit.isPallindrome(8));
    }

    @Test
    void isPallindrome_whenNonPalindromeNumber_thenReturnsNo() {
        assertEquals("No", PallindromeDigit.isPallindrome(57895));
    }

    @Test
    void isPallindrome_whenAnotherNonPalindromeNumber_thenReturnsNo() {
        assertEquals("No", PallindromeDigit.isPallindrome(12345));
    }

    @Test
    void isPallindrome_whenZeroGiven_thenReturnsYes() {
        assertEquals("Yes", PallindromeDigit.isPallindrome(0));
    }

    @Test
    void isPallindrome_whenNegativeNumberGiven_thenReturnsNo() {
        assertEquals("No", PallindromeDigit.isPallindrome(-121));
    }
}
