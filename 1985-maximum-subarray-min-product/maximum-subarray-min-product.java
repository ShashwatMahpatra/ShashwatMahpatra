class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        long[] prefix = new long[n + 1];

        // Build prefix sum
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Find nearest smaller on the left
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Find nearest smaller on the right
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Compute max product
        long maxProduct = 0;
        for (int i = 0; i < n; i++) {
            long subarraySum = prefix[right[i]] - prefix[left[i] + 1]; // <-- declare here
            long product = subarraySum * nums[i];
            maxProduct = Math.max(maxProduct, product);
        }

        return (int)(maxProduct % 1_000_000_007);
    }
}
