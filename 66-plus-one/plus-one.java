class Solution {
    public int[] plusOne(int[] digits) {

        int sum=1;
        for(int i=digits.length-1;i>=0;i--){
            sum=digits[i] + sum;
            digits[i]=sum%10;
            sum=sum/10;
            if(sum==0){
                return digits;
            }

        }
        int[] newArr = new int[digits.length+1];
        newArr[0]=1;
        return newArr;
    }
}