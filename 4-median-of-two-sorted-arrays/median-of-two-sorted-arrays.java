class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0.0;
        int [] merged=new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
         Arrays.sort(merged);
        for(int i=0;i<merged.length;i++){
            if(merged.length==1){
                return median=merged[i];
        }
            if(merged.length%2!=0){
                 int a=(merged.length+1)/2;
                 median=merged[a-1];
                return median;
            }
        }
        if(merged.length%2==0){
                int l=merged.length/2;
                 median=((merged[l])+(merged[l-1]))/2.0;
                return median;
        }
        return median; 
    }

}