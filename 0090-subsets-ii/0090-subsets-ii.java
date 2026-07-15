class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        Arrays.sort(nums);
        solve(l1,nums,0);
        return l;
    }
    public void solve(List<Integer> l1,int []nums,int i)
    {
        if(i>=nums.length)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[i]);
        solve(l1,nums,i+1);
        l1.remove(l1.size()-1);
        while(i+1<nums.length&&nums[i]==nums[i+1])i++;
        solve(l1,nums,i+1);
    }
}