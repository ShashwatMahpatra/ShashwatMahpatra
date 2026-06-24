class Solution {
    public int findMaxLength(int[] nums) {
        int zero=0;
        int one=0;
        int res=0;
        HashMap <Integer,Integer> f = new HashMap<>();
        f.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }
            int diff=zero-one;
            if(diff==0){
                res=Math.max(res,i+1);
                continue;
            }
            if(!f.containsKey(diff)){
                f.put(diff,i);
            }
            else{
                int idx=f.get(diff);
                int len=i-idx;
                res=Math.max(len,res);
            }
        }
        return res;
        
    }
}