class Solution {
    public int maxProduct(int[] nums) {
        int pmin=nums[0];
        int pmax=nums[0];
        int res=nums[0];
        if(nums.length==1)
        {
            return res;
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp=pmax;
                pmax=pmin;
                pmin=temp;
            }
            if(pmax*nums[i]>nums[i])
            {
                pmax*=nums[i];
            }
            else
            {
                pmax=nums[i];
            }
             if(pmin*nums[i]>nums[i])
            {
                pmin=nums[i];
            }
            else
            {
                pmin*=nums[i];
            }
            res=Math.max(res,pmax);
        }

    return res;
    }
}