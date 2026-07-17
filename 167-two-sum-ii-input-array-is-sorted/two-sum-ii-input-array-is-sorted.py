class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        #d={}
        #for i in range(len(numbers)):
         #   compliment=target-numbers[i]

          #  if compliment in d:
           #     return [d[compliment] + 1, i + 1]
            #d[numbers[i]]=i

        left=0
        right=len(numbers)-1
        while left<right:
            total=numbers[left]+numbers[right]
            if target == total:
                return [left+1,right+1]
            elif total<target:
                left+=1
            else:
                right-=1