class Solution {
    public int findMin(int[] nums) {
        int minimum=nums[0];
        for(int i=0;i<nums.length;i++){
            minimum= Math.min(nums[i],minimum);
        }
        return minimum;
    }
}