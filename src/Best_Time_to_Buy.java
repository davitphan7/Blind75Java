package src;
public class Best_Time_to_Buy {
    public int maxExhaustiveProfit(int[] prices) {

        if (prices.length == 0) return 0;


        int maxProfit = -1;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length ; j++) {
                if (maxProfit < prices[j] - prices[i]){
                    maxProfit = prices[j] - prices[i];


                }

            }

        }
        if (maxProfit < 0) return 0;

        return maxProfit;

    }
    // find the minimum then find the maximum
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0, currentProfit;

        for (int i = 1; i < prices.length; i++) {
           if (prices[i] < min) {
               min = prices[i];
           }

            currentProfit = prices[i] - min;

           if (currentProfit > maxProfit){
               maxProfit = currentProfit;
           }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {1,2};
        int answer = maxProfit(prices);

        System.out.println(answer);

    }
}
