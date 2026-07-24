class Solution(object):
    def getLucky(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: int
        """
        s = ''.join(str(ord(c) - ord('a') + 1) for c in s)
        for _ in range(k):
            t = sum(int(c) for c in s)
            s = str(t)
        return int(s)
        