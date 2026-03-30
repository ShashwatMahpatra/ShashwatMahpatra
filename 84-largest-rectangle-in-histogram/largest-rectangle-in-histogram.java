class Solution {
   public int largestRectangleArea(int[] heights) {
       int n = heights.length;
       Stack<Integer> indexStack = new Stack<>(); // Stack to store indices
       int maxArea = Integer.MIN_VALUE;


       // Iterate through the bars
       for (int i = 0; i < n; i++) {
           // Pop elements until we find a bar shorter than the current one
           while (!indexStack.isEmpty() && heights[i] < heights[indexStack.peek()]) {
               int topIndex = indexStack.pop();
               int height = heights[topIndex];


               // Calculate width for the popped element
               int width = indexStack.isEmpty() ? i : (i - indexStack.peek() - 1);
               int area = height * width;


               // Update maximum area
               maxArea = Math.max(maxArea, area);
           }


           // Push current index to the stack
           indexStack.push(i);
       }


       // Handle remaining bars in the stack
       while (!indexStack.isEmpty()) {
           int topIndex = indexStack.pop();
           int height = heights[topIndex];


           // Calculate width for the remaining elements
           int width = indexStack.isEmpty() ? n : (n - indexStack.peek() - 1);
           int area = height * width;


           // Update maximum area
           maxArea = Math.max(maxArea, area);
       }


       return maxArea;
   }
}

