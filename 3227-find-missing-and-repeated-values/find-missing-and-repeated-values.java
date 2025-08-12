class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;
        int[] freq=new int[total+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        int a=-1,b=1;
        for(int s=1;s<=total;s++){
            if(freq[s]==2){
                a=s;
            }
            else if (freq[s]==0){
                b=s;
            }
        }
        return new int[]{a,b};
    }
}