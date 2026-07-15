class Solution {
       List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(1,k,n,0,new ArrayList<>());
        return ans;
    }
    public void solve(int i,int k,int n,int sum,List<Integer> path)
    {
            if(path.size()==k && sum==n)
            {
                ans.add(new ArrayList<>(path));
                return;
            }
            if (i > 9 || sum > n || path.size() == k) {
                return;
            }
            path.add(i);
            solve(i+1,k,n,sum+i,path);
            path.remove(path.size()-1);
            solve(i+1,k,n,sum,path);

    }
}