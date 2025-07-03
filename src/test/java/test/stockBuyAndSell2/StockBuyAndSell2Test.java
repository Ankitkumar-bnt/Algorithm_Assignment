package test.stockBuyAndSell2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.stockBuyAndSell2.StockBuyAndSell2;

public class StockBuyAndSell2Test {

    @Test
    void stockBuyAndSell2_whenArrayHasProfit_thenReturnsTotalProfit() {
        assertEquals(4, StockBuyAndSell2.maxProfit(new int[] {1, 5, 4, 2, 1}));
    }

    @Test
    void stockBuyAndSell2_whenPricesKeepFalling_thenReturnsZero() {
        assertEquals(0, StockBuyAndSell2.maxProfit(new int[] {6, 5, 4, 2, 1}));
    }

    @Test
    void stockBuyAndSell2_whenAllPricesSame_thenReturnsZero() {
        assertEquals(0, StockBuyAndSell2.maxProfit(new int[] {6, 6, 6, 6, 6, 6}));
    }

    @Test
    void stockBuyAndSell2_whenMultipleUpwardSegments_thenReturnsSumOfAllProfits() {
        assertEquals(6, StockBuyAndSell2.maxProfit(new int[] {1, 2, 3, 2, 5, 6}));
    }

    @Test
    void stockBuyAndSell2_whenSingleElement_thenReturnsZero() {
        assertEquals(0, StockBuyAndSell2.maxProfit(new int[] {10}));
    }

    @Test
    void stockBuyAndSell2_whenEmptyArray_thenReturnsZero() {
        assertEquals(0, StockBuyAndSell2.maxProfit(new int[] {}));
    }
}
