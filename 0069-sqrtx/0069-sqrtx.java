class Solution {
    public int mySqrt(int x) {
        int l=0,h=x-1;
        if(x==1)
        {
            return 1;
        }
        long ans=0;
        while(l<=h)
        {
            int mid=(l+h)/2;
            long s=(long)mid*mid;
            if(s==x)
            {
                ans=mid;
                break;
            }
            else if(s<x)
            {
                ans=mid;
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }

        }
        return (int)ans;
    }
}