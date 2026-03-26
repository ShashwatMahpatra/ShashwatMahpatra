class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        List<Integer> dq=new LinkedList<>();
        dq.addLast(0);
        for(int i=1;i<k;i++){
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]){
                dq.removeLast();

            }
            dq.addLast(i);
        }
        result.add(nums[dq.getFirst()]);
        for(int i=k;i<nums.length;i++){
            if(i-dq.getFirst()>=k){
                dq.removeFirst();
            }
             while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]){
                dq.removeLast();

            }
            dq.addLast(i);
            result.add(nums[dq.getFirst()]);

        }
        int[] resArr = new int[result.size()];
       for (int i = 0; i < result.size(); i++) {
           resArr[i] = result.get(i);
       }
      
       return resArr;

        
    }
}