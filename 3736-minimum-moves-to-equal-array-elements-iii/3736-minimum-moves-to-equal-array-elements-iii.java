class Solution {
    public int minMoves(int[] nums) {
        int c=0,max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
               c+=max-nums[i];
        }
        return c;
    }
}