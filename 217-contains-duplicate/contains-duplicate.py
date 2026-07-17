class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        d={}
        for i in range(len(nums)):
            compliment=nums[i]
            if compliment in d:
                return True
            d[nums[i]]=i
        return False