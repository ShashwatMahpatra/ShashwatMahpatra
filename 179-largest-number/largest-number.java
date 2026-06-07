class Solution {
    public String largestNumber(int[] nums) {
        String [] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);//all arrays to string
         }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")) return "0";
        String ans="";
        for(String s: arr){
            ans+=s;
        }
        return  ans;
    }
}