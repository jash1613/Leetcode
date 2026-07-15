class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates, target, 0, 0, new ArrayList<>());
        return ans;
    }

    public void solve(int[] candidates, int target, int i, int sum, List<Integer> path) {

        
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (i == candidates.length || sum > target) {
            return;
        }
        path.add(candidates[i]);
        solve(candidates, target, i, sum + candidates[i], path);
        path.remove(path.size() - 1);
        solve(candidates, target, i + 1, sum, path);
    }
}