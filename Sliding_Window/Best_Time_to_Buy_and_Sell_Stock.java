package Sliding_Window;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        //--------BruteForce---------

        //     int n=prices.length;
            int maxprofit=0;
        //    for(int i=0;i<n;i++){
        //         int buy=prices[i];
        //     for(int j=i+1;j<n;j++){
        //         int sell=prices[j];
        //         maxprofit=Math.max(maxprofit,sell-buy);
    
        //     }
        //    }
        //    return maxprofit;

        //---------SlidingWindow-----
    
        int l=0,r=1;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit=prices[r]-prices[l];
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                l=r;
            }
               r++;
        }
        return maxprofit;
        }

        public static void main(String[] args) {
            Best_Time_to_Buy_and_Sell_Stock obj=new Best_Time_to_Buy_and_Sell_Stock();

            int prices[]={1,5,6,8,2,4,9};
            int res=obj.maxProfit(prices);
            System.out.println(res);
        }
}
