class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) minIndex = i;
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }

        int start = 0;
        int end = n - 1;

        int s1 = Math.max(minIndex, maxIndex) - start + 1;
        int s2 = end - Math.min(minIndex, maxIndex) + 1;
        int s3 = Math.min(minIndex, maxIndex) - start + 1
               + end - Math.max(minIndex, maxIndex) + 1;

        return Math.min(s1, Math.min(s2, s3));
    }
}