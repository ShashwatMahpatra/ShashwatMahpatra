class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> f= new HashMap<>();
        int sum=0;
        int res=0;
        f.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int ques=sum-k;
            res+=f.getOrDefault(ques,0);
            f.put(sum,f.getOrDefault(sum,0)+1);
        }
        return res;
    }
}