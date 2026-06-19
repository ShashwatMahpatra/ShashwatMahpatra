class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxOne=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxOne=Math.max(maxOne,count);
        }
        return maxOne;
    }
}