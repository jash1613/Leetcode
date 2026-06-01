class Solution {
    public int findMin(int[] nums) {
       int l=0;
       int h=nums.length-1;
       int k=nums[nums.length-1];
       while(l<=h)
       {
         int mid=(l+h)/2;
         if(nums[mid]==k)
         {
            k=nums[mid];
            break;

         }
         else if(nums[mid]<k)
         {
            k=nums[mid];
            h=mid-1;
        }
        else
        {
          
            l=mid+1;
        }
       }
       return k;
    }
}