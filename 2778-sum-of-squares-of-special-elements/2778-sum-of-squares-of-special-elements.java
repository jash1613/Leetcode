class Solution {
    public int sumOfSquares(int[] nums) {
        int s=0;
        for(int i=1;i<=nums.length;i++)
        {
            if(nums.length%i==0)
            {
                s=s+(nums[i-1]*nums[i-1]);
            }
        }
    
      return s;
    }
}