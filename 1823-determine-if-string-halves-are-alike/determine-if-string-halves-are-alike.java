class Solution {
    public boolean halvesAreAlike(String s) {
        char [] arr=s.toCharArray();
        int mid=(arr.length)/2;
        int first=0;
        int second=0;
        for(int i=0;i<mid;i++){
            if("aeiouAEIOU".indexOf(arr[i])!=-1){
                first++;
            }
        }
        for(int i=mid;i<arr.length;i++){
            if("aeiouAEIOU".indexOf(arr[i])!=-1){
                second++;
            }
        }
        return first == second;

    }
}