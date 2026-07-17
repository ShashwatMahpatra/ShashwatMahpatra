class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        d={}
        for i in range(len(nums)):
            compliment=nums[i]
            if compliment in d and abs(d[compliment]-i)<=k:
                return True
            d[nums[i]]=i
        return False