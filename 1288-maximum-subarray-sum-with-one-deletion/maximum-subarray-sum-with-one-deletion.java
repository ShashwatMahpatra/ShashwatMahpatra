class Solution {
    public int maximumSum(int[] arr) {
        int noDelete=arr[0];
        int oneDelete=0;
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevDelete=noDelete;
            noDelete=Math.max(noDelete+arr[i],arr[i]);
            oneDelete=Math.max(oneDelete+arr[i],prevDelete);
            maxSum=Math.max(maxSum,Math.max(noDelete,oneDelete));
        }
        return maxSum;
        
    }
}