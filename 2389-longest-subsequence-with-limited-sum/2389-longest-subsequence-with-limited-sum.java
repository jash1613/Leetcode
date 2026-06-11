class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int []ans=new int[queries.length];
        Arrays.sort(nums);
        int []nums1=new int[nums.length];
        nums1[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            nums1[i]+=nums[i]+nums1[i-1];
        }
 
        int j=0;
        for(int i=0;i<queries.length;i++)
        {
                   int l=0,h=nums1.length-1;
            int temp=queries[i];
             while(l<=h)
            {
                  int mid=l+(h-l)/2;
                  
                 if(nums1[mid]<=temp)
                  {
                    l=mid+1;
                  }
                  else
                  {
                    h=mid-1;
                  }
              

             }
                 if(ans[j]==0)
                  {
                    ans[j]=l;
                    j++;
                  }
    }
    return ans;
}
}