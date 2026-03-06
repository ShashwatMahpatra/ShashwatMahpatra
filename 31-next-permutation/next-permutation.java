import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1;

        // Step 1: find pivot
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        // Step 2: if no pivot reverse entire array
        if(pivot == -1){
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: find next greater element
        for(int i = nums.length - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: reverse right half
        reverse(nums, pivot + 1, nums.length - 1);
    }

    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}