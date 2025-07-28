class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i; // first occurrence
                }
                last = i; // update last occurrence every time we see target
            }
        }

        return new int[] {first, last};
    }
}
