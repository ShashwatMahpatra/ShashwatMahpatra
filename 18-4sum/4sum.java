class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        long sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k=nums.length-1,l=j+1;
            while(l<k){
                sum=(long) nums[i]+nums[j]+nums[k]+nums[l];
                if(sum<target){
                    l++;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[j], nums[k],nums[l]));
                    k--;
                    l++;
                    while(l<k && nums[l]==nums[l-1]) l++;
                    while(l < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
    }
     return result;
}
}