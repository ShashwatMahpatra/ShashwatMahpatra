class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minvalue){
                minvalue=prices[i];
            }
            else{
                maxProfit=Math.max(maxProfit,prices[i]-minvalue);
            }
        }
        return maxProfit;
    }
}