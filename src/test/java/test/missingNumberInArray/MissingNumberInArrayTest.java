package test.missingNumberInArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.missingNumberInArray.MissingNumberInArray;

public class MissingNumberInArrayTest {

    @Test
    void missingNumber_whenGivenIncompleteArray_thenReturnsMissingNumber() {
        assertEquals(2, MissingNumberInArray.missingNumber(new Integer[] {5, 1, 3, 4}, 5));
    }

    @Test
    void missingNumber_whenFirstElementMissing_thenReturnsMissingNumber() {
        assertEquals(1, MissingNumberInArray.missingNumber(new Integer[] {2, 3, 4, 5}, 5));
    }

    @Test
    void missingNumber_whenLastElementMissing_thenReturnsMissingNumber() {
        assertEquals(5, MissingNumberInArray.missingNumber(new Integer[] {1, 2, 3, 4}, 5));
    }

    @Test
    void missingNumber_whenMiddleElementMissing_thenReturnsMissingNumber() {
        assertEquals(3, MissingNumberInArray.missingNumber(new Integer[] {1, 2, 4, 5}, 5));
    }

    @Test
    void missingNumber_whenOnlyOneElementGiven_thenReturnsTwo() {
        assertEquals(2, MissingNumberInArray.missingNumber(new Integer[] {1}, 2));
    }

    @Test
    void missingNumber_whenArrayIsEmpty_thenReturnsOne() {
        assertEquals(1, MissingNumberInArray.missingNumber(new Integer[] {}, 1));
    }
}
