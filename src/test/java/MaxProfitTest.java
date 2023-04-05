import com.murmylo.volodymyr.MaxProfit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxProfitTest {

    @Test
    void shouldReturnMaxProfit() {
        MaxProfit maxProfit = new MaxProfit();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int res = maxProfit.maxProfit(prices);
        assertEquals(5, res);
    }
}
