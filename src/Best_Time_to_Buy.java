public class Best_Time_to_Buy {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;


        int maxProfit = -1;
        for (int i = 1; i < prices.length; i++) {
            for (int j = i+1; j < prices.length ; j++) {
                if (maxProfit < prices[j] - prices[i]){
                    maxProfit = prices[j] - prices[i];

                }

            }

        }
        if (maxProfit < 0) return 0;

        return maxProfit;

    }
}
