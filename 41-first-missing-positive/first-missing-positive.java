class Solution {
    public int firstMissingPositive(int[] nums) {
        int a=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0)continue;
            if(nums[i]==a){
                a++;
            }
            else if(nums[i]>a){
                return a;
            }
        }  
        return a;  
    }
}