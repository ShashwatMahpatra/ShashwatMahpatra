class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        d={}
        for i in range(len(numbers)):
            compliment=target-numbers[i]

            if compliment in d:
                return [d[compliment] + 1, i + 1]
            d[numbers[i]]=i