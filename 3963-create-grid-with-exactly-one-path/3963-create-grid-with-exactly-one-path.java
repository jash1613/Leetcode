class Solution {
    public String[] createGrid(int m, int n) {
        String[] s=new String[m];
        String s1="";
        for(int i=0;i<n;i++)
        {
            s1=s1+".";
        }
        s[0]=s1;
        for(int i=1;i<m;i++)
        {
            s1="";
            for(int j=0;j<n-1;j++)
            {
                s1=s1+"#";
            }
            s1=s1+".";
            s[i]=s1;
        }
        return s;
    }
}