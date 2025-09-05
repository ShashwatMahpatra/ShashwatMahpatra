class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1){
            return 0;
        }
        int mindp[]=new int[amount+1];
        for(int i=1;i<=amount;i++){
            mindp[i]=Integer.MAX_VALUE;
            for(int coin:coins){
                if(coin<=i && mindp[i-coin]!=Integer.MAX_VALUE)
                    mindp[i]=Math.min(mindp[i],1+mindp[i-coin]);
            }
        }
        if(mindp[amount]==Integer.MAX_VALUE)
            return -1;
        return mindp[amount];
            
    }
}