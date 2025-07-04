package test.addMinimumCharacters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.addMinimumCharacters.AddMinimumCharacters;

public class AddMinimumCharactersTest {

    @Test
    void addMinimumCharacters_whenStringGiven_thenReturnsRequiredChar() {
        assertEquals(2, AddMinimumCharacters.addMinChar("abc"));
    }

    @Test
    void addMinimumCharacters_whenGivenStringIsPalindrome_thenReturnsZero() {
        assertEquals(0, AddMinimumCharacters.addMinChar("cbaabc"));
    }

    @Test
    void addMinimumCharacters_whenSingleCharacter_thenReturnsZero() {
        assertEquals(0, AddMinimumCharacters.addMinChar("a"));
    }

    @Test
    void addMinimumCharacters_whenTwoIdenticalCharacters_thenReturnsZero() {
        assertEquals(0, AddMinimumCharacters.addMinChar("aa"));
    }

    @Test
    void addMinimumCharacters_whenRepeatingPattern_thenReturnsCorrectCount() {
        assertEquals(3, AddMinimumCharacters.addMinChar("abcd"));
    }

    @Test
    void addMinimumCharacters_whenEmptyString_thenReturnsZero() {
        assertEquals(0, AddMinimumCharacters.addMinChar(""));
    }

    @Test
    void addMinimumCharacters_whenAllSameCharacters_thenReturnsZero() {
        assertEquals(0, AddMinimumCharacters.addMinChar("aaaaa"));
    }

    @Test
    void addMinimumCharacters_whenStringWithSpaces_thenReturnsCorrectCount() {
        assertEquals(4, AddMinimumCharacters.addMinChar("a b c"));
    }

    @Test
    void addMinimumCharacters_whenStringWithNumbers_thenReturnsCorrectCount() {
        assertEquals(4, AddMinimumCharacters.addMinChar("12345"));
    }

    @Test
    void addMinimumCharacters_whenStringWithSymbols_thenReturnsCorrectCount() {
        assertEquals(2, AddMinimumCharacters.addMinChar("a@b"));
    }

    @Test
    void addMinimumCharacters_whenPalindromeWithSpaces_thenReturnsCorrectCount() {
        assertEquals(0, AddMinimumCharacters.addMinChar("a b a"));
    }

    @Test
    void addMinimumCharacters_whenLongRandomString_thenReturnsCorrectCount() {
        assertEquals(7, AddMinimumCharacters.addMinChar("abcdefgh"));
    }

    @Test
    void addMinimumCharacters_whenNullInput_thenThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            AddMinimumCharacters.addMinChar(null);
        });
        assertEquals("Input string cannot be null", exception.getMessage());
    }

    @Test
    void addMinimumCharacters_whenOnlySpaces_thenReturnsZero() {
        assertEquals(0, AddMinimumCharacters.addMinChar("     "));
    }

    @Test
    void addMinimumCharacters_whenOnlySpecialCharacters_thenReturnsCorrectCount() {
        assertEquals(3, AddMinimumCharacters.addMinChar("@#$%"));
    }

    @Test
    void addMinimumCharacters_whenVeryLongNonPalindrome_thenReturnsCorrectCount() {
        String input = "abcdefghijabcdefghij";
        assertEquals(19, AddMinimumCharacters.addMinChar(input));
    }

}
