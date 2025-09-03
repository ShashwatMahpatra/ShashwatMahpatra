class Solution(object):
    def groupAnagrams(self, strs):
        anagram_map= defaultdict(list)
        for words in strs:
            sorted_word=' '.join(sorted(words))
            anagram_map[sorted_word].append(words)
        return list(anagram_map.values())