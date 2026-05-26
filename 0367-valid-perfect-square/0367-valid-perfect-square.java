class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
         int l=0,h=num-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            long  s=(long)mid*mid;
            if(s==num)
            {
                return true;
            }
            else if(s<num)
            {
               
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }

        }
    return false;
    }
}