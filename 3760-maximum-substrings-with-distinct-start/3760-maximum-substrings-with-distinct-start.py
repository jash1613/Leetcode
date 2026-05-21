class Solution(object):
    def maxDistinct(self, s):
        """
        :type s: str
        :rtype: int
        """
        a=""
        for i in s:
            if i not in a:
                a+=i
        return len(a)
        