from collections import deque
class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        q=deque()
        for i,t in enumerate(tickets):
            q.append((i,t))
        time=0
        while q:
            idx,t = q.popleft()
            t-=1
            time+=1

            if t==0:
                if idx==k:
                    return time
            else:
                q.append((idx,t))
