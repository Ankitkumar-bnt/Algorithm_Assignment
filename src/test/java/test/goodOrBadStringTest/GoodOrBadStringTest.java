package test.goodOrBadStringTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.goodOrBadString.GoodOrBadString;

public class GoodOrBadStringTest {

    @Test
    void isGoodorBad_whenMoreThanFiveVowels_thenReturnsZero() {
        assertEquals(0, GoodOrBadString.isGoodorBad("bntaieo??soft"));
    }

    @Test
    void isGoodorBad_whenMoreThanThreeConsonants_thenReturnsZero() {
        assertEquals(0, GoodOrBadString.isGoodorBad("bnt??soft"));
    }

    @Test
    void isGoodorBad_whenValidWithVowelsAndQuestionMarks_thenReturnsOne() {
        assertEquals(1, GoodOrBadString.isGoodorBad("bntaieto??soft"));
    }

    @Test
    void isGoodorBad_whenValidWithConsonantsAndQuestionMarks_thenReturnsOne() {
        assertEquals(1, GoodOrBadString.isGoodorBad("bnti??soft"));
    }

    @Test
    void isGoodorBad_whenEmptyString_thenReturnsZero() {
        assertEquals(0, GoodOrBadString.isGoodorBad(""));
    }

    @Test
    void isGoodorBad_whenAllVowels_thenReturnsZero() {
        assertEquals(0, GoodOrBadString.isGoodorBad("aeiouae"));
    }

    @Test
    void isGoodorBad_whenAllConsonants_thenReturnsZero() {
        assertEquals(0, GoodOrBadString.isGoodorBad("bcdfgh"));
    }
}
