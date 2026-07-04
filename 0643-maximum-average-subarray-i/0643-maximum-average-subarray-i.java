class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        double avg=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int max=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            if(max<sum)
            {
                max=sum;
            }
        }
        avg=(double)max/k;
        return avg;
    }
}