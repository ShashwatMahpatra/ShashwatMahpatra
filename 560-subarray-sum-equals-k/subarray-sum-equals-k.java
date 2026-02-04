class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        for(int a=0;a<nums.length;a++){
            int sum=0;
            for(int b=a;b<nums.length;b++){
                sum+=nums[b];
                if(sum==k){
                    c++;
                }
            }
        }
        return c;
    }
}
