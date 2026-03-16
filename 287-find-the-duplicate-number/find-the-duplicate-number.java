class Solution {
    public int findDuplicate(int[] nums) {
       int slow=nums[0];
       int fast=nums[0];
       while(true){
        slow=nums[slow];//increase slow by 1
        fast=nums[nums[fast]];//increase fast by 2
        if(slow==fast){
            break;
        }
       }
       slow=nums[0];
       while(slow!=fast){
        slow=nums[slow];
        fast=nums[fast];
       }
    
       return slow;
    }
}