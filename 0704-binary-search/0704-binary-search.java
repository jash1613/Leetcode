class Solution {
    public int bin(int[] nums,int i,int j,int target)
    {   
        if(i>j)
        {
            return -1;

        }
        int mid=(i+j)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(target>nums[mid])
        {
            return bin(nums,mid+1,j,target);
        }
        else
        {
            return bin(nums,i,mid-1,target);
        }

    }
    public int search(int[] nums, int target) {
        return bin(nums,0,nums.length-1,target);
    }
}