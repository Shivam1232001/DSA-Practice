public class BuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BuyAndSellStock2 obj =new BuyAndSellStock2();
        int prices[]={7,1,5,3,6,4};

        int res=obj.maxProfit(prices);
        System.out.println(res);
    }
}