class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;

        //for storing the largest pile
        for(int pile:piles){
            right=Math.max(pile,right);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            int hours=0;
            // hours needed to finish a pile
            for(int pile:piles){
                 hours+=(pile+mid-1)/mid;
            }
            //speed works can go for slower
            if(hours<=h){
                right=mid;
            }
            // too slow
            else{
                left=mid+1;
            }
        }
        return left;
    }
}