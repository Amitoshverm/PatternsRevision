package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bestTImeToBuy {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 6, 2};
        System.out.println(profit(arr));
    }
    public static int profit(int[] prices) {
        int max_profit = 0;
        if (prices == null || prices.length < 2) {
            return max_profit;
        }
        int n = prices.length;
        int min_price = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min_price = Math.min(min_price, prices[i]);
            max_profit = Math.max(prices[i] - min_price, max_profit);
        }
        return max_profit;
    }
}
// 1, 2, 3, 4, 5
// 7, 1, 5, 6, 2