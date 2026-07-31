class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        each_child=[]
        ans=[]
        for i in range(len(candies)):
            child=(candies[i]+extraCandies)
            each_child.append(child)
        for i in range(len(each_child)):
            is_max=True
            for j in range(len(candies)):
                if each_child[i]<candies[j]:
                    is_max=False
                    break
            ans.append(is_max)
        return ans