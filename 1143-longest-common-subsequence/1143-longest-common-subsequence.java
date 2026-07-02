class Solution {
    int [][]dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()][text2.length()];
        for(int []r: dp)
        {
            Arrays.fill(r,-1);
        }
        return lcs(text1,text2,0,0);

    }
    public int lcs(String s1,String s2,int i,int j)
    {
        if(i==s1.length()|| j==s2.length())
        {
          return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            dp[i][j]=1+lcs(s1,s2,i+1,j+1);
        }
        else
        {
        dp[i][j]=Math.max(lcs(s1,s2,i+1,j),lcs(s1,s2,i,j+1));
        }
        return dp[i][j];
    }
}