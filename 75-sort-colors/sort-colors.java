

class Solution {
    public void sortColors(int[] nums) {
         int low =0; //next position for 0
         int mid=0; //current element
         int high= nums.length-1; //Next position for 2
 
         while(mid<=high){
 
            //Case 1: Current element is 0
            if(nums[mid]==0){
 
                //Swap low and mid
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
 
                low++;
                mid++;
            }
 
            //Case 2: Current element is 1
            else if(nums[mid]==1){
 
                //1 is already in current region
                mid++;
            }
 
            //CAse 3: Current elemnt is 2
            else{
                //Swap mid and high
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
 
                high--;
            }
         }
    }
}