class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=0;
        if(sum>=k*threshold){
            maxSum++;
        }
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            if(sum>=k*threshold){
            maxSum++;
        }
        }
        return maxSum;
    }
}
