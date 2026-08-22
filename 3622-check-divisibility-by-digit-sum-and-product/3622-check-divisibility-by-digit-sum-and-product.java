class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0,p=1;
        while(n>0)
        {
            int d=n%10;
            sum+=d;
            p*=d;
            n=n/10;
        }
        if(temp%(sum+p)==0)
        {
            return  true;

        }
        return false;
    }
}