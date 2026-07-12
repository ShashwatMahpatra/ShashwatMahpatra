class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #for i in range(len(nums)):
         #   for j in range(i + 1, len(nums)):
           #     if nums[i] + nums[j] == target:
           #         return [i, j]
        #return []
        mp = {}

        for i in range(len(nums)):
            complement = target - nums[i]

            if complement in mp:
                return [mp[complement], i]

            mp[nums[i]] = i