class Solution {
    public int minElement(int[] nums) {
        int sum;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            while(nums[i]>0)
            {
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            nums[i]=sum;
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        return min;
    }
}