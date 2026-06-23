class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum - nums[0] == 0) {
            return 0;
        }

        int left=0;
        int right=0;
        for(int i=1;i<nums.length;i++){
            left+=nums[i-1];
            right=sum-nums[i]-left;
            if(left==right){
                return i;
            }
        }
    
    return -1;
        
    }
}