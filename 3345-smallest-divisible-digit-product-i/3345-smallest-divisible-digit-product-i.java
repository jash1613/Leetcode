class Solution {
    public int smallestNumber(int n, int t) {
       
        while(true)
        {
        int temp1=mul(n);
        if(temp1%t==0)
        {
            return n;
        }
        else
        {
            n=n+1;
        }
        }
    }
    public int mul(int n)
    {
         int p=1;
         while(n>0)
        {

            p=p*(n%10);
            n=n/10;
        }
        return p;
    }
}
