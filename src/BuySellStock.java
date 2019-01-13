import java.util.Stack;

public class BuySellStock {
    public static void main(String[] args){
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(getMaxProfit(prices));
    }
    private static int getMaxProfit(int[] prices) {
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                maxProfit+=(prices[i]-prices[i-1]);
            }
        }
        return maxProfit;
    }
}
