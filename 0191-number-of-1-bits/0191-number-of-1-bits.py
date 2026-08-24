class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        a=bin(n)[2:]
        c=0
        for i in a:
            if i=='1':
                c=c+1
        return c