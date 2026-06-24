class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int res=0;
        HashMap <Integer,Integer> f = new HashMap<>();
        f.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            res+=f.getOrDefault(rem,0);
            f.put(rem,f.getOrDefault(rem,0)+1);
        }
        return res;   
    }
}