class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}
            int temp=nums[i];
            int l=i+1;
            int r=nums.length-1;
          
            while(l<r)
            {
                if(nums[i]+nums[l]+nums[r]==0)
                {
                      List<Integer> l2=new ArrayList<>();
                    l2.add(nums[i]);
                    l2.add(nums[l]);
                    l2.add(nums[r]);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                         l++;
                    while (l < r && nums[r] == nums[r + 1])
                         r--;
                     if (!l2.isEmpty()) {
    l1.add(l2);
       }
                }
                else if(nums[i]+nums[l]+nums[r]<0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
                     

            }
      
        }
        return l1;
    }
}