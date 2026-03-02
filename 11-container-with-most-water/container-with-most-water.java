class Solution {
    public int maxArea(int[] height) {
        int l=0,r=(height.length-1),res=0;
        while(l<r){
            int area=Math.min(height[l],height[r])*(r-l);
            res=Math.max(area,res);
            if(height[l]<=height[r]){
                l+=1;
            }
            else{
                r-=1;
            }
        }
        return res;
    }
}