package Arrays.Medium;

public class StockBuyAndSell {
    static int buyAndSell(int[] prices){
        int minimum = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            int cost = prices[i]-minimum;
            maxProfit = Math.max(maxProfit,cost);
            minimum = Math.min(minimum,prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = buyAndSell(prices);
        System.out.println(ans);
    }
}
