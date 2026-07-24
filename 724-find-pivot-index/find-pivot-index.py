class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        sum=0
        for i in range(len(nums)):
            sum+=nums[i]
        if (sum-nums[0])==0:
            return 0
        left=0
        right=0
        for i in range(1,len(nums)):
            left+=nums[i-1]
            right=sum-nums[i]-left
            if(left==right):
                return i
        return -1