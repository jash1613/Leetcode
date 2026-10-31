class Solution {
    List<List<Integer>> l;

    public List<List<Integer>> permuteUnique(int[] nums) {

        l = new ArrayList<>();
        Arrays.sort(nums);

        List<Integer> l1 = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        solve(nums, l1, visited);

        return l;
    }

    public void solve(int[] nums, List<Integer> l1, boolean[] visited) {

        if (l1.size() == nums.length) {
            l.add(new ArrayList<>(l1));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i])
                continue;

            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])
                continue;

            l1.add(nums[i]);
            visited[i] = true;

            solve(nums, l1, visited);

            l1.remove(l1.size() - 1);
            visited[i] = false;
        }
    }
}