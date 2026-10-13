
class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++)
        {
            sum-=nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
}
