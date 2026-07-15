class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprofit=0
        minvalue=float(inf)
        for i in range(len(prices)):
            if prices[i]<minvalue:
                minvalue=prices[i]
            else:
                maxprofit=max(maxprofit,prices[i]-minvalue)
        return maxprofit
            