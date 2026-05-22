class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        a=0
        for s in sentences:
            m=len(s.split())
            a=max(a,m)
        return a
        
        