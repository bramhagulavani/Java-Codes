class Solution(object):
    def digitSum(self, s, k):
        while len(s) > k:
            nexts = ""
            for i in range(0, len(s), k):
                nexts += str(sum(int(d) for d in s[i:i+k]))
            s = nexts
        return s
        