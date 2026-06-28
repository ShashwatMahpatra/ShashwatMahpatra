class Solution {
    public int maxAbsoluteSum(int[] nums) {
        //int total=nums[0];

        int currMin=nums[0];
        int minSum=nums[0];

        int currSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
           // total+=nums[i];
            // for maximum subarray sum
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=(Math.max(currSum,maxSum));
            // for mnimum sum to maintain if wraps or not
            currMin=Math.min(currMin+nums[i],nums[i]);
            minSum=(Math.min(currMin,minSum));
        }
       // if(maxSum<0){     // if all values are negative
            //return maxSum;
        //}
        return Math.max(maxSum,Math.abs(minSum));
        
    }
}