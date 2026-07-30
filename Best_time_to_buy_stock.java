package pkg;

public class Best_time_to_buy_stock {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    static int maxProfit(int[] prices) {
        int maxpr = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (prices[j]-prices[i] > maxpr){
                    maxpr = prices[j]-prices[i] ;
                }
            }
        }
        return maxpr;
    }
}
