class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            if(max<s)
            {
                max=s;
            }
            if(s<0)
            {
                s=0;
            }
        }
        return max;
    }
}