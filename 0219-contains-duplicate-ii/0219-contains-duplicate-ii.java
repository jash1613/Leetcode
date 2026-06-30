class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean a=false;
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           
            if(h1.containsKey(nums[i]))
            {
               if((i-h1.get(nums[i]))<=k)
               {
                a=true;
                break;
               }

            }
          
                h1.put(nums[i],i);
           
            
        }
        return a;
    }
}