class Solution {
    public boolean isPalindrome(int x) {
        int og=x;
        int rev=0;

        if (x<0){
            return false;

        }
        while(x!=0){
            int a=x%10;
            rev=(rev*10)+a;
            x=x/10;
        }
        return og==rev;
    }
}