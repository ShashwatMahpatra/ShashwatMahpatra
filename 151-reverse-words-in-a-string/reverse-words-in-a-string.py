class Solution:
    def reverseWords(self, s: str) -> str:
        s=s.split()[::-1]
        r=" ".join(s)
        #words=[]
        #res=""
        #for i in s:
        #    words.append(i)
        #words=words[::-1]
        #res=" ".join(words)
        #return (" ".join(s.split()[::-1]))
        #return s.split()[::-1]
        return r