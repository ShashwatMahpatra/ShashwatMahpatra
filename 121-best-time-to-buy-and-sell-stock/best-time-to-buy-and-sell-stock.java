class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minvalue){
                minvalue=prices[i];//this is the time to buy the stock
            }
            else{
                maxprofit=Math.max(maxprofit,prices[i]-minvalue);
            }

        }
        return maxprofit;
    }
}