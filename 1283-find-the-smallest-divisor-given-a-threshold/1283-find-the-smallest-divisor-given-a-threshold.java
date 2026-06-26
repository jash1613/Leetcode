class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int high=nums[0];
       int low=1;
       int ans=0;
       for(int i=0;i<nums.length;i++)
       {
        if(high<=nums[i])
        {
            high=nums[i];
        }
       }
       while(low<=high)
       {
        int mid=low+(high-low)/2;
         if(check(nums,mid,threshold))
         {
            ans=mid;
            high=mid-1;
         }
         else
         {
           low=mid+1;
         }
       }
      
    return ans;
    }
      
      private boolean check(int[] nums, int divisor, int threshold) {

    int sum = 0;

    for (int num : nums) {

        sum += (num + divisor - 1) / divisor;

    }

    return sum <= threshold;
}

}