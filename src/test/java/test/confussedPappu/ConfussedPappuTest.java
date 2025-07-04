package test.confussedPappu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.confussedPappu.ConfussedPappu;

public class ConfussedPappuTest {

    @Test
    void findDiff_whenNumberHasSix_thenReturns3() {
        assertEquals(3, ConfussedPappu.findDiff(56));
    }

    @Test
    void findDiff_whenNumberHasMultipleSixes_thenReturns333() {
        assertEquals(333, ConfussedPappu.findDiff(666));
    }

    @Test
    void findDiff_whenNumberHasNoSix_thenReturns0() {
        assertEquals(0, ConfussedPappu.findDiff(59));
    }

    @Test
    void findDiff_whenNumberHasNoSixDifferentDigits_thenReturns0() {
        assertEquals(0, ConfussedPappu.findDiff(123));
    }

    @Test
    void findDiff_whenInputIsZero_thenReturns0() {
        assertEquals(0, ConfussedPappu.findDiff(0));
    }
    
    @Test
    void findDiff_whenInputIsNegative_thenReturns0() {
        assertEquals(0, ConfussedPappu.findDiff(-336));
    }
}
