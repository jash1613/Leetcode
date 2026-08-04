class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res =new ArrayList<>();
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        int []freq=new int[max+1];
        for(int n:nums)
        {
            freq[n]++;
        }
        for(int i=min;i<=max;i++)
        {
            if(freq[i]==0)
            {
                res.add(i);
            }
        }
        return res;
    }
}