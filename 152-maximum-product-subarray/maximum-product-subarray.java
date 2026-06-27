class Solution {
    public int maxProduct(int[] nums) {
        int currProd=nums[0];
        int maxProd=nums[0];
        int max=nums[0];

        for(int i=1;i<nums.length;i++){
            if (nums[i]<0){
                int temp=currProd;
                currProd=maxProd;
                maxProd=temp;
            }
            currProd=Math.max(currProd*nums[i],nums[i]);
            maxProd=Math.min(maxProd*nums[i],nums[i]);
            max=Math.max(max,currProd);
        }
        return max;
        
    }
}