class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
           int high = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(sum1(piles,h,mid))
            {
                 high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
        
    }
    public boolean sum1(int[] piles, int h, int speed)
    {
         long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;

            if (hours > h) {
                return false;
            }
        }

        return true;
    }
}