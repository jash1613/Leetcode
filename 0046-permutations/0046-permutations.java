class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> permute(int[] nums) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        solve(nums,l1);
    
      return l;
    }
    public void solve(int []nums,List<Integer>l1)
    {
         if(l1.size()==nums.length)
         {
              l.add(new ArrayList<>(l1));
              return;
         }
         for(int i=0;i<nums.length;i++)
         {
            if(!l1.contains(nums[i]))
            {
                l1.add(nums[i]);
                solve(nums,l1);
                l1.remove(l1.size()-1);
            }
         }
    }
}