class Solution {
    public int maxDepth(String s) {
        int c=0;
        int maxc=0;
        for(int i=0;i<s.length();i++)
        {
               if(s.charAt(i)=='(')
               {
                 c++;
                 if(c>maxc)
                 {
                    maxc=c;
                 }
               }
               if(s.charAt(i)==')')
               {
                   c--;
               }
        }
        return maxc;
    }
}