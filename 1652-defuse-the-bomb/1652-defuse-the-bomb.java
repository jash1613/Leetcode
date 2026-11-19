class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int []r=new int[code.length];
        if(k==0)
        {
            return r;
        }
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=1;j<=Math.abs(k);j++)
            {
                int l;
                if(k>0)
                {
                    l=(i+j)%n;
                }
                else
                {
                    l=(i-j+n)%n;
                }
                s+=code[l];
            }
            r[i]=s;
        }
        return r;
    }
}